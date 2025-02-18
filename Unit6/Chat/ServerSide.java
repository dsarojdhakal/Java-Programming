import java.io.*;
import java.net.*;

public class ServerSide {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server is waiting for a client...");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");

            var input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            var output = new PrintWriter(socket.getOutputStream(), true);
            var consoleInput = new BufferedReader(new InputStreamReader(System.in));

            String clientMessage, serverMessage;

            while (true) {
                clientMessage = input.readLine();
                if (clientMessage.equalsIgnoreCase("goodbye")) {
                    System.out.println("Client: goodbye");
                    break;
                }
                System.out.println("Client: " + clientMessage);

                System.out.print("You: ");
                serverMessage = consoleInput.readLine();
                output.println(serverMessage);
                if (serverMessage.equalsIgnoreCase("goodbye")) {
                    break;
                }
            }

            System.out.println("Chat ended.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}