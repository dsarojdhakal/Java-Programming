import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) {
        int port = 1234; // Port number for the server

        try {
            // Step 1: Create a DatagramSocket
            DatagramSocket socket = new DatagramSocket(port);
            System.out.println("UDP Server is running, waiting for clients...");

            while (true) {
                // Step 2: Prepare to receive data
                byte[] receiveData = new byte[1024]; // Buffer for incoming data
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

                // Step 3: Receive a packet from the client
                socket.receive(receivePacket);
                String clientMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Received from client: " + clientMessage);

                // Step 4: Prepare a response
                String responseMessage = "Hello from UDP Server!";
                byte[] sendData = responseMessage.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length,
                                                                receivePacket.getAddress(), 
                                                                receivePacket.getPort());

                // Step 5: Send the response back to the client
                socket.send(sendPacket);
                System.out.println("Sent response to client.");
            }

            // Step 6: Close the socket 
            //socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
