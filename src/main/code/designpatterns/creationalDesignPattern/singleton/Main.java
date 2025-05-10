package src.main.code.designpatterns.creationalDesignPattern.singleton;

public class Main {
    public static void main(String[] args) {

        // 2. Calling the constructor of Class1 by creating object using new()
//        Class1 obj1 = new Class1();

        // 4. Above will not be called when constructor is private.
        // So create public method in Class1 to call the constructor to create object

        /* Since for calling  this method we require an object,
         so we need to make that getClass1Object method static  */
        Class1 objClass1 = Class1.getClass1Object();
        System.out.println("HASH_CODE for object 1 created => "+objClass1.hashCode());
        Class1 objClass2 = Class1.getClass1Object();
        System.out.println("HASH_CODE for object 2 created => "+objClass2.hashCode());

    }
}
