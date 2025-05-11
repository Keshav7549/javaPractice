package src.main.code.streams;

import java.util.stream.Stream;

/* This demo involves the same purpose as Demo2 but here will generate limited integer data using Supplier with Stream.of(). */
public class StreamDemo3 {
    public static void main(String[] args) {

        /* 1. For limited stream of data we added integer values in Stream.of() which will return stream object */
        Stream <Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6 ,7, 8, 9);

        /* 2. We can use the integerStream object created earlier and iterate through each integer value */
        integerStream.forEach(intVal -> System.out.println("The consumer accepted data is : "+intVal));

    }
}
