interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Shape shape;

        shape = new Circle();    // Polymorphism
        shape.draw();            // Output: Drawing a Circle

        shape = new Rectangle(); // Polymorphism
        shape.draw();            // Output: Drawing a Rectangle
    }
}
