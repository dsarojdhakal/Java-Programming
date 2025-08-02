class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        int sum2 = calc.add(2, 3);
        System.out.println("Addition of two integers: " + sum2 );

        int sum3 = calc.add(5, 10, 15);
        System.out.println("Addition of three integers: " + sum3 );

        double s = calc.add(5.1, 10.5);
        System.out.println("Addition of two doubles: " + s);
    }
}
