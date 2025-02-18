import java.io.*;
import java.net.*;

public class ClientSide {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345)) {
            System.out.println("Connected to the server.");

            var input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            var output = new PrintWriter(socket.getOutputStream(), true);
            var consoleInput = new BufferedReader(new InputStreamReader(System.in));

            String clientMessage, serverMessage;

            while (true) {
                System.out.print("You: ");
                clientMessage = consoleInput.readLine();
                output.println(clientMessage);
                if (clientMessage.equalsIgnoreCase("goodbye")) {
                    break;
                }

                serverMessage = input.readLine();
                if (serverMessage.equalsIgnoreCase("goodbye")) {
                    System.out.println("Server: goodbye");
                    break;
                }
                System.out.println("Server: " + serverMessage);
            }

            System.out.println("Chat ended.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
