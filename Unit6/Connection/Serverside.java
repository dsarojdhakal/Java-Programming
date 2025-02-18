import java.io.*;
import java.net.*;

public class Serverside {
    public static void main(String[] args) throws IOException {
        
        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("Server is running and waiting for a client...");

        Socket socket = serverSocket.accept();
        System.out.println("Client connected!");

        socket.close();
        serverSocket.close();
    }
}
