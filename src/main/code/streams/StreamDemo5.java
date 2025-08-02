package src.main.code.streams;

/* This demo involves use of more intermediate and terminal operations
1. filter() - intermediate operation used to filter data and return a new stream object. Takes predicate as input.
2. peak() - intermediate operation used to log or view stream data and return a new stream object. Takes consumer as input
3. forEach() - terminal operation used to iterate through stream object and display relevant output without returning anything.
    Takes consumer as input.
4. collect() - terminal operation used to iterate through stream object and grab it to save result in a Collection object
    without returning anything. Takes consumer as input
5. map() - intermediate operation used to iterate through stream object and return a new stream object
Note: All terminal operations have return type as void only
*
*  */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {

    // 1. Create an array of numbers first using Integer class. Note that Primitive types aren't used here
    Integer[] numArray = {1,2,3,4,5,6,7,8,9,10};

    // 2. Create stream object for the Integer class array object, we created earlier
    Stream<Integer> numArrayListStreamObj = Stream.of(numArray);

    // 3. Simply print using terminal operation forEach()
//    numArrayListStreamObj.forEach( arrayVal -> System.out.println("Array Numbers : "+arrayVal));

    // 4. Now, suppose we want to filter values to be shown only for num values > 5. We will use predicate functional interface to filter()
    Stream<Integer> filteredNumArrayListStreamObj = numArrayListStreamObj
                                                                .filter((Integer intArrValue) -> {return intArrValue > 5;});
    // Note: The intermediate operations always return a stream object like above after filtering we get filtered Stream object.

    // 5. After filtering the data won't show as terminal operation must be performed on the stream to perform action
    filteredNumArrayListStreamObj.forEach(intArrayVal -> System.out.println("Array values > 5 are : "+intArrayVal));
    // Note: Also note that if you uncomment 3. and try executing code again, then 4. will fail saying the stream is closed already
    // This is because once the terminal operation is performed like forEach() or collect() once, it can't be used again.

    // 6. Now, let say we want that if array int no. is > 5, then print corresponding no. in string val. Like 6 as Six and 7 as Seven n so on.
    // To perform this task we can use another intermediate operation which is map(). It's used to transform data n always returns new stream of object
        Integer[] numArray2 = {1,2,3,4,5,6,7,8,9,10};
        Stream<Integer> intArrayStreamObj2 = Arrays.stream(numArray2);

        Stream<Integer> filtered_intArrayStreamObj2 = intArrayStreamObj2.filter((Integer intVal2) -> intVal2 > 5);
        Stream<String> map_Filtered_intArrayStreamObj2 = filtered_intArrayStreamObj2.map((Integer num) -> {
                                                                                     switch(num) {
                                                                                         case 1: return "One";
                                                                                         case 2: return "Two";
                                                                                         case 3: return "Three";
                                                                                         case 4: return "Four";
                                                                                         case 5: return "Five";
                                                                                         case 6: return "Six";
                                                                                         case 7: return "Seven";
                                                                                         case 8: return "Eight";
                                                                                         case 9: return "Nine";
                                                                                         case 10: return "Ten";
                                                                                     }
                                                                                         return "DEFAULT No value found for provided integer";
                                                                                    });

//        map_Filtered_intArrayStreamObj2.forEach(num_in_string -> System.out.println(num_in_string));
        //OR
        List<String> int_num_as_string_list = map_Filtered_intArrayStreamObj2.collect(Collectors.toList());
        System.out.println("List of string for int values : "+int_num_as_string_list);

    }
}
