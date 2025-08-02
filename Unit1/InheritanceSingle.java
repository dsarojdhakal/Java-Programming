
class A 
{   
        protected void getdataA(){
            System.out.println("Class A display function");
    }
}

class B extends A
{
    protected void getdataB(){
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

//access specifiers
//public, protected, private, default
//public - accessible from anywhere
//protected - accessible within the same package and subclasses(child classes) even if they are in different packages
//private - accessible only within the same class
//default - accessible within the same package only

//Private --> default --> protected --> public