// This code demonstrates the use of try-catch blocks to handle exceptions in Java.
public class ExceptionFinally {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;

        try {
            // Risky operation: division by zero
            int result = x / y;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("\n\n"+ e.getMessage());
            System.out.println("\n\n"+ e.toString());
            System.out.println("\n\n"+ e.getClass());
            System.out.println("\n\n"+ e);
        }
        catch (Exception e) {
            System.out.println("\n\nCaught a general exception: " + e.getMessage());
        }
        // The finally block is executed regardless of whether an exception occurs or not.
        finally{
            System.out.println("Finally block executes.....");
        }

        System.out.println("Program continues...");
    }
}