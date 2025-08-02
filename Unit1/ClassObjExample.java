class Car {
    String color;
    int speed;

    void drive() {
        System.out.println(color + " car is driving at " + speed + " km/h");
    }
}

public class ClassObjExample {
    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.color = "Red";
        myCar.speed = 60;

        myCar.drive();  
    }
}
