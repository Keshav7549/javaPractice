//package src.main.code.streams;
//
//import java.util.Arrays;
//import java.util.stream.Stream;
//
//import static java.lang.Math.pow;
//
//public class StreamPractice1 {
//
//    //1. Given a list of integers, use a stream to filter out and print only the even numbers.
//    //    Example Input: [1, 2, 3, 4, 5, 6]
//    //    Expected Output: 2, 4, 6
//    public static void main(String[] args) {
//
//        Integer[] input = {1, 2, 3, 4, 5, 6};
//        Arrays.stream(input)
//                .filter(val -> val % 2 == 0)
//                .forEach(even -> System.out.println("Even no. is : "+even));
//
////        Mapping to Squares: Given a list of integers, use a stream to transform each number into its square and print the results.
////
////        Example Input: [1, 2, 3, 4, 5]
////        Expected Output: 1, 4, 9, 16, 25
//        Arrays.stream(input)
//                .map( intVal -> intVal * intVal)
//                .forEach( squareVal -> System.out.println("Square is : "+squareVal));
//
//
////        Sum of Elements: Calculate the sum of all elements in a list of integers using a stream.
////
////        Example Input: [10, 20, 30]
////        Expected Output: 60
//        int add = 0;
//        Arrays.stream(input)
//                .map( (Integer intVal) -> :: sum)
//                .forEach();
//    }
//
//    public int sum(int a, int b){
//        return a+b;
//    }
//
//}
