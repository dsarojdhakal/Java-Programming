//Wrte a Java program to demonstrate the use of the Scanner class for input handling.

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        int x;
        double y;
        String z;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an integer:");
        if(sc.hasNextInt()) {
            x = sc.nextInt();
            System.out.println("You entered integer: " + x);
        } 
        else {
            System.out.println("Invalid input for integer.");
            sc.next(); // Clear the invalid input
        }


        System.out.println("Enter a double:");
        if(sc.hasNextDouble()) {
            y = sc.nextDouble();
            System.out.println("You entered double: " + y);
        } else {
            System.out.println("Invalid input for double.");
            sc.next(); // Clear the invalid input
        }

        System.out.println("Enter a string:");
        z = sc.next();
        System.out.println("You entered string: " + z);
    }
    
}
