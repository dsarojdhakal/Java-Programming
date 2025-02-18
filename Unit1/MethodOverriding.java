class parent{
    void displayMessage(){
        System.out.println("Parent class function.");
    }
}

class child extends parent{
    @Override
    void displayMessage(){
        super.displayMessage();
        System.out.println("Child class function.");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        parent obj = new child();
        obj.displayMessage();
        
    }
    
}
