//java Program to Read Records from a File (example.txt) Using FileReader
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        try (FileReader reader = new FileReader("example.txt")) {
            int x;

            while ((x = reader.read()) != -1) { 
                System.out.print((char) x); 
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
