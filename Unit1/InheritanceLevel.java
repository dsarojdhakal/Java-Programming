class A {   
    void getdataA(){
        System.out.println("Class A display function");
    }
}

class B extends A{
    void getdataB(){
        getdataA(); // Call to superclass method
        System.out.println("Class B display function");
    }
}

class C extends B{
    void getdataC(){
        System.out.println("Class C display function");
    }
}

public class InheritanceLevel {
    public static void main(String[] args) {
        C cc = new C();
        cc.getdataB();
        cc.getdataC();       
    }   
}
