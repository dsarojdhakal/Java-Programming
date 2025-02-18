import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatinSIngleProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you a server or a client? (Type 'server' or 'client'):");
        String role = scanner.nextLine().trim().toLowerCase();

        if ("server".equals(role)) {
            runServer();
        } else if ("client".equals(role)) {
            runClient();
        } else {
            System.out.println("Invalid role. Exiting.");
        }
        scanner.close();
    }

    public static void runServer() {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server is waiting for a connection...");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");

            handleChat(socket);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void runClient() {
        try (Socket socket = new Socket("localhost", 12345)) {
            System.out.println("Connected to the server.");
            handleChat(socket);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void handleChat(Socket socket) {
        try (
            var input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            var output = new PrintWriter(socket.getOutputStream(), true);
            var consoleInput = new BufferedReader(new InputStreamReader(System.in));
        ) {
            Thread receiver = new Thread(() -> {
                try {
                    String message;
                    while ((message = input.readLine()) != null) {
                        System.out.println("Peer: " + message);
                        if ("goodbye".equalsIgnoreCase(message)) {
                            System.out.println("Chat ended by peer.");
                            System.exit(0);
                        }
                    }
                } catch (IOException e) {
                    System.out.println("Connection closed.");
                }
            });

            receiver.start();

            String userMessage;
            while (true) {
                System.out.print("You: ");
                userMessage = consoleInput.readLine();
                output.println(userMessage);
                if ("goodbye".equalsIgnoreCase(userMessage)) {
                    System.out.println("You ended the chat.");
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
