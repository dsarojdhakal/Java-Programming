import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) {

        File file = new File("example.txt");

        if (file.exists()) {
            System.out.println("Reading from file:\n");
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                System.out.println();
                System.out.println();
            } 
            catch (IOException e) {
                System.out.println("An error occurred.\n");
                e.printStackTrace();
            }
        } 
        else {
            System.out.println("File does not exist.\n");
        }

        
    }
}

