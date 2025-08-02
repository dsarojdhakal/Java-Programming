public class StringBufferExample {
    public static void main(String[] args) {

        StringBuffer buffer = new StringBuffer("Hello");

        buffer.append(" World");
        System.out.println("After Append: " + buffer);

        buffer.insert(5, ",");
        System.out.println("Inserted comma: " + buffer);

        buffer.delete(5, 6);
        System.out.println("Deleted comma: " + buffer)p;

        buffer.reverse();
        System.out.println("Reversed string: " + buffer);
    }
}
