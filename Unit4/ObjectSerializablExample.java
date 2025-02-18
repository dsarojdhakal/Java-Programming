    //Java Program to Serialize a Student Object Using ObjectOutputStream

    // import java.io.File;
    // import java.io.FileOutputStream;
    // import java.io.ObjectOutputStream;
    // import java.io.Serializable;

    import java.io.*;
    class Student implements Serializable{
        String name;
        int age;
    }

    public class ObjectSerializablExample {
        public static void main(String[] args) throws Exception{

            Student s1 = new Student();

            File file = new File("student.txt");

            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s1);

            System.out.println("Serialized Sucessfully");
            oos.close();

        }
        
    }
