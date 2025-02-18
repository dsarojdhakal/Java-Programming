//Java Program to Write a Number to a File and Compute Its Product with 20

import java.io.*;
import java.util.Scanner;

public class ProductOfNumbers {
    public static void main(String[] args) {
        File file = new File("number.txt");

        if (file.exists()) {
            System.out.println("File already exists. ");
        } 
        else {
            try {
                if (file.createNewFile()) {
                    System.out.println("File created successfully.\n");
                } 
                else {
                    System.out.println("Failed to create the file.\n");
                    return;
                }
            } 
            catch (IOException e) {
                System.out.println("An error occurred while creating the file.\n");
                e.printStackTrace();
                return;
            }
        }

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write(String.valueOf(number));
                System.out.println("Number has been written to the file.\n");
            } 
            catch (IOException e) {
                System.out.println("An error occurred while writing to the file.\n");
                e.printStackTrace();
                return;
            }
        }
        // catch (Exception e) {
        //     System.out.println("Please enter a valid number.\n");
        //     e.printStackTrace();
        // }

        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line = reader.readLine();
                if (line != null) {
                    int numberFromFile = Integer.parseInt(line);
                    int product = numberFromFile * 20;
                    System.out.println("The number read from the file is: " + numberFromFile);
                    System.out.println("The product of the number with 20 is: " + product);
                } else {
                    System.out.println("The file is empty.\n");
                }
            } 
            catch (IOException e) {
                System.out.println("An error occurred while reading the file.\n");
                e.printStackTrace();
            } 
            catch (NumberFormatException e) {
                System.out.println("The file does not contain a valid number.\n");
                e.printStackTrace();
            }
        } else {
            System.out.println("The file does not exist.\n");
        }
    }
}
