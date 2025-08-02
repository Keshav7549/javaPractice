/* Write a program to print name of only 2 student out of 10 students where filter studentName > age 25. */
package src.main.code.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo6 {
    public static void main(String[] args) {

        // 3. Go through the student list object we created earlier using stream()
        // to filter student's age > 25 using filter() and pick only 2 records using limit()
        // to return 2 students Name only using map() and print them using forEach()
        getStudentList().stream()
                        .filter(studObj -> studObj.getAge() > 25)
                        .limit(2)
                        .map(studObj -> studObj.getStudentName())
                        .forEach(studName -> System.out.println("Student Name is : "+studName));
    }


    // 2. Create a list of Student_StreamDemo6 class to later stream it or go through it using getStudentList method.
    public static List<Student_StreamDemo6> getStudentList() {

        List<Student_StreamDemo6> studentList = new ArrayList<Student_StreamDemo6>();

        Student_StreamDemo6 s1 = new Student_StreamDemo6(2, "Abhishek", 21);
        Student_StreamDemo6 s2 = new Student_StreamDemo6(3, "Aman", 22);
        Student_StreamDemo6 s3 = new Student_StreamDemo6(4, "Anurag", 23);
        Student_StreamDemo6 s4 = new Student_StreamDemo6(5, "Dev", 24);
        Student_StreamDemo6 s5 = new Student_StreamDemo6(6, "Rahul", 25);
        Student_StreamDemo6 s6 = new Student_StreamDemo6(7, "Raj", 26);
        Student_StreamDemo6 s7 = new Student_StreamDemo6(8, "Keshav", 27);
        Student_StreamDemo6 s8 = new Student_StreamDemo6(9, "Karan", 28);
        Student_StreamDemo6 s9 = new Student_StreamDemo6(10, "Rakshit", 29);
        Student_StreamDemo6 s10 = new Student_StreamDemo6(1, "Amit", 30);

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s6);
        studentList.add(s7);
        studentList.add(s8);
        studentList.add(s9);
        studentList.add(s10);

        return studentList;
    }
}

