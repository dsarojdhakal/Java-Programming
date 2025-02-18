//WAP to create a file named example.txt  and store data in the file using FileWriter
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        String data = "Hello welcome to Bachelor of Information Technology";
        File file = new File("example.txt");

        if(file.exists()){
            try {
                FileWriter writer = new FileWriter(file);
                writer.write(data);
                System.out.println("Data has been written to the file.");
                writer.close();
            } 
            catch (IOException e) {
                System.out.println("An error occurred ");
                e.getMessage();
            }
        }
        else{
            System.out.println("File Doesn't Exists");
        }
        
    }
}
