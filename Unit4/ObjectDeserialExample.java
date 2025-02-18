//Java Program to Deserialize a Student Object from a File Using ObjectInputStream

import java.io.*;

class Student implements Serializable {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
}
 
public class ObjectDeserialExample {
    public static void main(String[] args) {
        String file = "student.txt";

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Student s1 = (Student) ois.readObject(); 
            System.out.println("Records stored in the file are:\n");
            System.out.println("Name = " + s1.name);
            System.out.println("Age = " + s1.age);
        } 
        catch (Exception e) {
            System.out.println("An error occurred during deserialization.");
            e.printStackTrace();
        }
    }
}
