import java.util.Stack;

public class StackProgram {
    public static void main(String[] args) {
        Stack <String> obj = new Stack<>();
        obj.push("Apple");
        obj.push("Ball");
        obj.push("Doll");
        System.out.println(obj);
        System.out.println(obj);

        obj.remove(obj.size()-1);
        System.out.println(obj);

        obj.set(0, "Anynomous");
        System.out.println(obj);

        obj.pop();
        System.out.println(obj);
    }
    
}
