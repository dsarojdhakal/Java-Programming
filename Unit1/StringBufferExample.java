public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello");

        // Append
        buffer.append(" World");
        System.out.println("Appended: " + buffer);

        // Insert
        buffer.insert(5, ",");
        System.out.println("Inserted comma: " + buffer);

        // Delete
        buffer.delete(5, 6);
        System.out.println("Deleted comma: " + buffer);

        // Reverse
        buffer.reverse();
        System.out.println("Reversed: " + buffer);
    }
}
