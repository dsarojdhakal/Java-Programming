// This code demonstrates the use of try-catch blocks to handle exceptions in Java.
public class ExceptionGetClass {
    public static void main(String[] args){

        try {
            int x = 10;
            int y = 0;
            int result = x / y;
            System.out.println("Result: " + result);
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}