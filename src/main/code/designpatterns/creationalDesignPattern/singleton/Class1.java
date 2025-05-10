package src.main.code.designpatterns.creationalDesignPattern.singleton;

public class Class1 {
//
//    // 1. Create and set something in default constructor Class1
//    public Class1(){
//        System.out.println("Inside constructor Class1....");
//    }

    // 3. Now making constructor private
    private Class1(){
        System.out.println("Inside constructor Class1....");
    }

    //5. Get the constructor details using this method
    private static Class1 objClass1;
    static int count = 0;   /* need this to be static since non-static can't be called
                                inside static method getClass1Object()  */
    public static Class1 getClass1Object(){

        count++;
        System.out.println("Gave you object-"+count);
        // 6. Adding condition to prevent creating new object and re-use the old object
        if(objClass1 == null) {
            objClass1 = new Class1();
        }
        return objClass1;
    }
}
