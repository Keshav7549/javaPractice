package src.main.code.serialization;

import java.io.Serializable;

public class Student implements Serializable {

    private String studentName;
    private int studentId;
    private int age;

    public Student(){
        System.out.println("Welcome to the default Student constructor!!!");
    }

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public String getStudentName(){
        return studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String studentName, int studentId, int age) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.age = age;
//        System.out.println("Student Name : "+getStudentName());
//        System.out.println("Student Id : "+getStudentName());
//        System.out.println("Student Age : "+getStudentName());
    }
}
