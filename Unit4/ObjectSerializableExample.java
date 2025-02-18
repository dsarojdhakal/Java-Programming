//Java Program for Serialization and Deserialization of a Student Object

import java.io.*;

class Student implements Serializable {

    private String name;
    private int age;
    private transient String password; 

    public Student(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    @Override
    public String toString() {
        return "name=" + name + ", age= " + age + ", password= " + password ;
    }
}

public class ObjectSerializableExample {
    public static void main(String[] args) {
        String filename = "student.txt";

        Student student = new Student("John Doe", 21, "secret123");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(student);
            System.out.println("Object serialized: " + student);
        } 
        catch (IOException e) {
            System.out.println("An error occurred during serialization.");
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Student deserializedStudent = (Student) ois.readObject();
            System.out.println("Object deserialized: " + deserializedStudent);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred during deserialization.");
            e.printStackTrace();
        }
    }
}
