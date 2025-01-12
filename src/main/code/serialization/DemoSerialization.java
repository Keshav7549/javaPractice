package src.main.code.serialization;

import java.io.*;

// Serialization is a process of converting state of pojo object into a byte-stream to be later stored
// in DB or as a file in storage or network
/* ========> for a class to be serialized,
1. we need a pojo first (Note: A pojo is a bean with private variables and private getter/setter methods
                            having at-least one private default constructor and implements **Serializable** interface)
2. we need a FileOutputStream class object to create and store it into a file named Student.txt
3. we need an ObjectOutputStream to consume this file and write the class object ie; Student to a stream of object using writeObject()
4. Close the ObjectOutputStream object and fileOutputStream object using close()
 ==========> for deserializing a byte stream in an object we can follow below steps
 1. Create a FileInputStream object to read the earlier generated file
 2. Deserialize it using ObjectInputStream object.
 (Note : the object return will be of object type so parse into corresponding class object eg: Student)

 */
public class DemoSerialization {

    public static void main(String[] args) {

    // Before serialisation
    Student studentObj = new Student("Keshav",1027,27);
    System.out.println("Student Name : "+studentObj.getStudentName());
    System.out.println("Student Id : "+studentObj.getStudentId());
    System.out.println("Student Age : "+studentObj.getAge());

    // After Serialization
        try{
            FileOutputStream studentFileObject = new FileOutputStream("Student.txt");
            ObjectOutputStream objStream = new ObjectOutputStream(studentFileObject);
            objStream.writeObject(studentObj);
            objStream.close();
            studentFileObject.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    // After Deserialization
    try{
        FileInputStream fis = new FileInputStream("Student.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        studentObj = (Student)ois.readObject();
        // Printing objects after De-serialization
        System.out.println("Deserialized Student Name : "+studentObj.getStudentName());
        System.out.println("Deserialized Student Id : "+studentObj.getStudentId());
        System.out.println("Deserialized Student Age : "+studentObj.getAge());
    }catch(Exception e){

    }
    }
}

