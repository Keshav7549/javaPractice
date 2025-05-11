package src.main.code.streams;

/* This demo involves the same purpose as Demo3 but here will use Collection object to stream through data using Stream.of(). */

import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {

        /* 1. We defined student pojo with respective properties to be used after creating objects and adding them in Collection object */
        StudentPOJO_StreamDemo4 s1 = new StudentPOJO_StreamDemo4(26, "Karan", 26);
        StudentPOJO_StreamDemo4 s2 = new StudentPOJO_StreamDemo4(27, "Keshav", 27);
        StudentPOJO_StreamDemo4 s3 = new StudentPOJO_StreamDemo4(28, "Sai", 28);

        /* 2. For limited stream of data we added student Objects in Stream.of() which will return stream of Student object */
        Stream <StudentPOJO_StreamDemo4> studentObjStream = Stream.of(s1, s2, s3);

        /* 3. We can use the stream of Student object created earlier and iterate through each student object */
        studentObjStream.forEach(studObj -> System.out.println("The student data is : "+studObj));

    }
}
