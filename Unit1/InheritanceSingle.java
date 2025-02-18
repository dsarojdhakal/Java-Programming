class A 
{   
        protected void getdataA(){
            System.out.println("Class A display function");
    }
}

class B extends A
{
    public void getdataB(){
        getdataA();
        System.out.println("Class B display function");
    }

    
}
public class InheritanceSingle {
    public static void main(String[] args) {
        B bb = new B();
        bb.getdataB();
        bb.getdataA();
        
    }
    
}
