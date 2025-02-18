import java.util.Scanner;

interface Parent {
    void getdata();
    void displaydata();
}

class child implements Parent  {
    int num1, num2;
    Scanner sc= new Scanner(System.in);
    public void getdata(){

        System.out.println("ENter two numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
    }

    public void displaydata(){
        System.out.println("Sum of two numbers = "+(num1+num2));
    }
}


public class InterfaceProgram {
    public static void main(String[] args) {
        Parent obj = new child();
        obj.getdata();
        obj.displaydata();      
    }
}
