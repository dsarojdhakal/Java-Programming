//Write a Java program to demonstrate serialization and deserialization of an object.
//The program should create a class with some fields, serialize an object of that class to a file, 
//and then read the object back from the file, displaying its contents.

import java.io.*;

class Student implements Serializable {

    String name = "Ram Sharma";
    int age = 20;
    String password = "Nepal@123"; 

    @Override
    public String toString() {
        return "\nname= " + name + "\nage= " + age + "\npassword= " + password + "\n";
    }
}

public class Objecstsa {
    public static void main(String[] args) {

        String filename = "student.txt";
        Student student = new Student();

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(student);
            System.out.println("Object serialized: " + student);
        } 
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Student deserializedStudent = (Student) ois.readObject();
            System.out.println("Object deserialized: " + deserializedStudent);
        } 
        catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        finally{
            System.out.println("Work Completed");
        }
    }
}
