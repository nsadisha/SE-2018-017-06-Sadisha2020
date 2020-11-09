package classes;

public class B extends A{
    String name = "Class B";

    public B() {
        System.out.println("B");
    }

    public void printMSG(){
        System.out.println("I'm of type B.");
    }
    public void printMsgFromParent(){
        super.printMSG();
    }
    public void printBoth(){
        super.printMSG();
        this.printMSG();
    }

    public String getName() {
        return this.name;
    }
}
