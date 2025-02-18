import java.util.Scanner;

interface Parent_A{
    void getData_A();
    void displayData_A();
}

interface Parent_B{
    void getData_B();
    void displayData_B();
}

class Child implements Parent_A,Parent_B{
    int x,y;
    Scanner sc = new Scanner(System.in);
    public void getData_A(){
        System.out.println("Enter two numbers A: ");
        x = sc.nextInt();
        y = sc.nextInt();
    }
    public void getData_B(){
        System.out.println("Enter two numbers B: ");
        x = sc.nextInt();
        y = sc.nextInt();

    }
    public void displayData_A(){
        System.out.println("Sum of two numbers A: "+ (x+y));

    }
    public void displayData_B(){
        System.out.println("Sum of two numbers B: "+ (x+y));
    }
}

public class InterfaceMultipleInheritance {
    public static void main(String[] args) {
        Parent_A objA = new Child();
        objA.getData_A();
        objA.displayData_A();

        System.out.println();

        Parent_B objB = new Child();
        objB.getData_B();
        objB.displayData_B();
    }
}
