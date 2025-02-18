//WAP in to create a file named Example.txt.
import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws IOException{
        File file = new File("Example.txt");
        try{
            if (file.createNewFile()) {
                System.out.println("File created sucessfully");            
            }
            else{
                System.out.println("File is not created");
            }
        }
        catch(IOException e){
            System.out.println("Exception occured");
        }
        
    }
}
