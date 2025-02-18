//Java File Creation and Writing Example using FileOutputStream
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;

public class FOSExample {
    public static void main(String[] args) throws IOException {
        File file = new File("example.txt");

        if (file.createNewFile()) {
            System.out.println("File created successfully");
        } else {
            System.out.println("File already exists");
        }

        try (FileOutputStream fos = new FileOutputStream(file)) {
            String data = "Hello, this is JAVA class in BIT-4!";
            fos.write(data.getBytes()); 
            System.out.println("Data written to the file successfully");
        } 
        catch (IOException e) {
            System.out.println("An error occurred : " + e.getMessage());
        }
    }
}
