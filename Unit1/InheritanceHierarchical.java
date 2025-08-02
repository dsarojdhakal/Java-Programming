class A {   
    void getdataA(){
        System.out.println("Class A display function");
    }
}

class B extends A{
    void getdataB(){
        System.out.println("Class B display function");
    }   
}

class C extends A{
    void getdataC(){
        System.out.println("Class C display function");
    }   
}

public class InheritanceHierarchical {
    public static void main(String[] args) {
        C cc = new C();
        B bb = new B();
        cc.getdataA();
        cc.getdataC();  
        bb.getdataA();
        bb.getdataB();  
    }   
}
