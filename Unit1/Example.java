import java.util.Vector;

public class Example {
    public static void main(String[] args) {
        Vector<String> languages = new Vector<>();
        languages.add("Java");
        languages.add("Python");
        languages.add(1, "C++");

        System.out.println("Programming Languages: " + languages);
    }
}
