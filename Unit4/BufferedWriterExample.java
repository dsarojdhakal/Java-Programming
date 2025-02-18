//WAP to create a file and write on a file using BufferedWrite

import java.io.*;

public class BufferedWriterExample {
    public static void main(String[] args) {

        File file = new File("example.txt");

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
                System.out.println("An error occurred .\n");
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
            
              
    }
}

