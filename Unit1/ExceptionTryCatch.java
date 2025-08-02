// This code demonstrates the use of try-catch blocks to handle exceptions in Java.
public class ExceptionTryCatch {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            // Risky operation: division by zero
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("\n"+ e.getMessage());
            System.out.println("\n"+ e.toString());
            System.out.println("\n"+ e.getClass());
            System.out.println("\n"+ e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("\n"+ e.getMessage());
        }
        catch(Exception e){
            System.out.println("\n\nAll other exceptions are caught here");
            System.out.println("\n"+ e.getMessage());
            System.out.println("\n"+ e.toString());
            System.out.println("\n"+ e.getClass());
            System.out.println("\n"+ e);
        }
        finally{
            System.out.println("Finally block executes.....");
        }

        System.out.println("Program continues...");
    }
}