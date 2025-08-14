//WAP to create a file named example.txt  and store data in the file using FileWriter
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        String data = "Hello welcome to Bachelor of\nInformation Technology";
            try {
                FileWriter writer = new FileWriter("example.txt");
                writer.write(data);
                System.out.println("Data has been written to the file.");
                writer.close();
            } 
            catch (IOException e) {
                System.out.println("An error occurred ");
                e.getMessage();
            }
        }     
}
