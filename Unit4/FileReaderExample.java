//java Program to Read Records from a File (example.txt) Using FileReader
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("example.txt")) {
            int character;

            while ((character = reader.read()) != -1) { 
                System.out.print((char) character); 
            }
            
        } catch (IOException e) {
            System.out.println("An error occurred ");
            e.printStackTrace();
        }
    }
}
