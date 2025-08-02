// This code demonstrates the use of try-catch blocks to handle exceptions in Java.
public class ExceptionToString {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            // Risky operation: division by zero
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("\n\n"+ e.toString());
        }
        
        System.out.println("Program continues...");
    }
}