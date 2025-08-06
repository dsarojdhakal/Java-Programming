package UDPExample;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) {
        String serverAddress = "localhost";
        int serverPort = 1234; 
        String messageToSend = "Hello, UDP Server!";

        try {
            // Step 1: Create a DatagramSocket
            DatagramSocket socket = new DatagramSocket();

            // Step 2: Prepare the data to be sent
            byte[] sendData = messageToSend.getBytes();

            // Step 3: Create a DatagramPacket for sending
            InetAddress serverInetAddress = InetAddress.getByName(serverAddress);
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverInetAddress, serverPort);

            // Step 4: Send the packet
            socket.send(sendPacket);
            System.out.println("Sent: " + messageToSend);

            // Step 5: Prepare to receive the response
            byte[] receiveData = new byte[1024]; 
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

            // Step 6: Receive the response from the server
            socket.receive(receivePacket);
            String response = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Received from server: " + response);

            // Step 7: Close the socket
            socket.close();
            System.out.println("Socket closed.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
