package src.main.code.streams;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) {

        // 1. First we generate String data using supplier object which is an interface and need an overridden get() method
        Supplier <String> supplier = new Supplier<>() {
            @Override
            public String get() {
                return "Hello Stream";
            }
        };

        // 2. Second we create a Stream <String> object and pass that supplier object in its generate() method
        Stream<String> streamOfStrings = Stream.generate(supplier);

        // 3. Third we create a Consumer <String> object which is also an interface and
        // need an overridden accept() method with an argument ie; String
        Consumer <String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("The consumer accepted data is : "+s);
            }
        };

        // 4. Once generated will call the Stream <String> object.forEach() and pass the consumer object
        streamOfStrings.forEach(consumer);
    }
}
