//WAP to read the records stored in a file using Scanner class

import java.io.File;
import java.util.Scanner;

public class ScannerFile {
    public static void main(String[] args) {
        File file = new File("example.txt");

        if (file.exists()) {
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    System.out.println(line);
                }
            } catch (Exception e) {
                System.out.println("File is empty");
            }
        } else {
            System.out.println("File not found. ");
        }
    }
}
