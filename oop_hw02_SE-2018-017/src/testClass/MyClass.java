package testClass;

public class MyClass {
//    instance variables
    int variable1;
    int variable2;

//    class variables (static variables)
    static int sVariable1;
    static int sVariable2;

//    instance methods
    public void setVariable1(int value){
//        accessing instance variable in a instance method
        this.variable1 = value;
    }
    public void setVariable2(){
//        accessing class variables and class methods in a instance method
        sVariable1 = 5;
        setsVariable1();
    }

//    static methods
    static void setsVariable1(){
//        accessing class variables and class methods in a class method
        sVariable2 = 20;
        setsVariable2();
    }
    static void setsVariable2(){
//        accessing instance variables and methods in a static method without this keyword
//        variable2 = 7;
//        setVariable1(6);

//        accessing instance variables and methods in a static method without this keyword
//        this.variable2 = 7;
//        this.setVariable1(6);
    }
}
