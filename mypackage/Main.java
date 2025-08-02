package mypackage;

public class Main {
    public static void main(String[] args) {
        System.out.println("Simple Package Example");
        
        int result = SimpleMath.add(10, 5);
        System.out.println("10 + 5 = " + result);
        
        result = SimpleMath.subtract(10, 5);
        System.out.println("10 - 5 = " + result);
    }
}