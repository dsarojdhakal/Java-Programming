import java.util.LinkedList;

public class LinkedlistProgram {
    public static void main(String[] args) {
        LinkedList <String> obj = new LinkedList<>();
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

        obj.addFirst("JAVA");
        System.out.println(obj);

        obj.removeFirst();
        System.out.println(obj);
    }
    
}
