import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost", 5000);
        System.out.println("Connected to the server!");

        socket.close();
    }
}
