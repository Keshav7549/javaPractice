package src.main.code.streams;

public class StudentPOJO_StreamDemo4 {

    private int id;

    private String studentName;

    private int age;

    // Setters
    private void setId(int id){
        this.id = id;
    }
    private void setStudentName(String studentName){
        this.studentName = studentName;
    }
    private void setAge(int age){
        this.age = age;
    }

    // Getters
    public int getId(int id){
        return id;
    }
    public int getAge(int age){
        return age;
    }

    public String getStudentName(String studentName){
        return studentName;
    }

    // Constructor
    StudentPOJO_StreamDemo4(int id, String studentName, int age){
        this.id = id;
        this.studentName = studentName;
        this.age = age;
    }

    // To String()
    @Override
    public String toString() {
        return "StudentPOJO_StreamDemo4{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", age=" + age +
                '}';
    }
}
