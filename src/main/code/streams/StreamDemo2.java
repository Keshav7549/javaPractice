package src.main.code.streams;

/* This demo involves the same purpose as Demo1 but minimizing the code using lambda expressions here.
*/


import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

/* This demo involves generating infinite data string "Hello Stream" using supplier and
then passed to the consumer iterating over the created stream object using forEach()
*
* */
public class StreamDemo2 {
    public static void main(String[] args) {

        // ==============================> WITHOUT LAMBDA EXPRESSION <================================
        /* 1. First we generate String data using supplier object which is an interface and need an overridden get() method */
//        Supplier <String> supplier = new Supplier<>() {
//            @Override
//            public String get() {
//                return "Hello Stream";
//            }
//        };

        /* 2. Second we create a Stream <String> object and pass that supplier object in its generate() method */
//        Stream<String> streamOfStrings = Stream.generate(supplier);

        /* 3. Third we create a Consumer <String> object which is also an interface and
               need an overridden accept() method with an argument ie; String */
//        Consumer <String> consumer = new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println("The consumer accepted data is : "+s);
//            }
//        };
        // ==============================> WITHOUT LAMBDA EXPRESSION <================================

        /* 4. Once generated will call the Stream <String> object.forEach() and pass the consumer object */
//        streamOfStrings.forEach(consumer);

        // ==============================> USING LAMBDA EXPRESSION <================================
        /* Modified 1. We can use lambda expression in statement 1 to get supplier object like below
             () -> "Hello Stream";   */

        /* 2. Will pass the modified 1. supplier object inside Stream.generate() */

        /* Modified 3. Similar to 1. lambda expression in statement 3 will be
           (String s) -> System.out.println("The consumer accepted data is : "+s);
           or
           s -> System.out.println("The consumer accepted data is : "+s);
           Since consumer object will automatically be able to distinguish the data type being passed  */

        /* 4. Will pass the modified 3. consumer object in the forEach()  */

        // ==============================> USING LAMBDA EXPRESSION <================================
        Stream<String> streamOfStrings2 = Stream.generate(() -> "Hello Stream");
        streamOfStrings2.forEach(s -> System.out.println("The consumer accepted data is : "+s));

    }
}
