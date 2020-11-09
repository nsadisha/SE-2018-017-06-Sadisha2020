package interfaces;

public interface Interface1 {

//    (4)
//    Instance fields should be public, static and final.
//    String name;

//    (5)
//    this should be final.
//    static int age;

//    (6)
//    this is ok.
      static final String city = "Kelaniya";

//    (3)
//    Interfaces are abstract. So they doesn't have a constructor since they cannot create objects.
//    Interface1(){}

//    (1)
//    (2)
//    interfaces can have methods but they doesn't contain a method body.
    void sayHello(int x);
//    {
//        if (x>5) {
//            System.out.println("s is greater than 5.");
//        }else{
//            System.out.println("x is less than or equal to 5");
//        }
//    }
}

class MyClass{
//    cannot create objects with interfaces
//    Interface1 interface = new Interface1();
}
