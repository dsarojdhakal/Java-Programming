import java.util.ArrayList;

public class ArraylistProgram {
    public static void main(String[] args) {
        ArrayList <String> obj = new ArrayList<>();
        obj.add("Apple");
        obj.add("Ball");
        obj.add("Doll");
        System.out.println(obj);
        obj.add(2,"Carrot");
        System.out.println(obj);

        obj.remove(obj.size()-1);
        System.out.println(obj);

        obj.set(0, "Anynomous");
        System.out.println(obj);

    }
    
}
