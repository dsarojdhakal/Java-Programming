import java.io.*;

public class FISExample {
    public static void main(String[] args) {
        File file = new File("example.txt");
        if(file.exists()){
            try (FileInputStream fis = new FileInputStream("file")) {
                int content;
                while ((content = fis.read()) != -1) {
                    System.out.print((char) content);
                }
            } catch (IOException e) {
                e.toString();
            }
        }

        else{
            System.out.println("File not found");
        }
        
    }
}
