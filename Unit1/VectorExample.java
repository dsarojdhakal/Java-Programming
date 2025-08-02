import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        Vector<String> names = new Vector<>();
        System.out.println(names);

        names.add("Ram");
        names.add("Shyam");
        names.add("Gita");

        names.add(1, "Hari");

        System.out.println("Element at index 2: " + names.get(2));

        System.out.println("Contains 'Gita'? " + names.contains("Gita"));

        names.remove("Shyam");

        System.out.println("Size of vector: " + names.size());

        System.out.println("Is vector empty? " + names.isEmpty());

        System.out.println("All names in vector:");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println(names);

        names.clear();

        System.out.println("Vector cleared. Size now: " + names.size());

        System.out.println("Is vector empty? " + names.isEmpty());

    }
}
