package classes;

public class C {
    public static void main(String[] args) {
        B classB = new B();
        System.out.println(classB.getName());

//        calling printMSG() method from class A
        classB.printMsgFromParent();

//        calling printMSG() method from class B
        classB.printMSG();

//        calling super class printMSG() method inside the sub class printMSG method
        classB.printBoth();

//        Static super methods can be overridden in a sub class, but cannot call super methods.

//        When we extend a class with another class, first it calling the super class's constructor and then the sub class's constructor.

//        When we add super(); to the first line of the constructor of A, it does nothing.
//        But, when we try to add it to the last line, it says "call to super must be first statement in constructor"
    }
}
