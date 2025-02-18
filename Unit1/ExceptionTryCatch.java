public class ExceptionTryCatch {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            // Risky operation: division by zero
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Program continues...");
    }
}
