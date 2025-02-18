public class StringExample {
    public static void main(String[] args) {
        String greeting = "Hello";
        System.out.println("Original: " + greeting);

        greeting += " World";
        System.out.println("Concatenated: " + greeting);

        System.out.println("Length: " + greeting.length());
        System.out.println("Substring (0, 5): " + greeting.substring(0, 5));

        String MyVar = greeting.toUpperCase();
        System.out.println(MyVar);
    }
}
