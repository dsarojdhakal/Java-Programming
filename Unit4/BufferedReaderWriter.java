import java.io.*;

public class BufferedReaderWriter {
    public static void main(String[] args) {

        File file = new File("example.txt");

        //write
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println("File created successfully.\n");
                } 
                else {
                    System.out.println("Failed to create the file.\n");
                }
            } 
            catch (IOException e) {
                System.out.println("An error occurred while creating the file.\n");
                e.getMessage();
            }
        }
        else{
            String data = "Welcome to Bachelor in Information Technology in Purwanchal University\n";
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write(data);
                System.out.println("Data written to the file successfully.\n");
            } 
            catch (IOException e) {
                System.out.println("An error occurred.\n");
                e.printStackTrace();
            }          
        }

        //read
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

