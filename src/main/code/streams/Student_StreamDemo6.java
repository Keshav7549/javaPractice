package src.main.code.streams;

// 1. This POJO is required to create a list of student object that will take id, studentName and age to be later consumed in stream defined in StreamDemo6.
public class Student_StreamDemo6{
    int id;
    String studentName;
    int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student_StreamDemo6{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", age=" + age +
                '}';
    }

    public Student_StreamDemo6(int id, String studentName, int age) {
        this.id = id;
        this.studentName = studentName;
        this.age = age;
    }
}