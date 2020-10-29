public class Warrior{
    String name;
    int age;
    Boolean isImmobile;

    Warrior(String name, int age){
        this.name = name;
        this.age = age;
        this.isImmobile = false;
    }

    // methods
    void setAge(int age){
        this.age = age;
    }

    void walk(){
        System.out.println(this.name+" is walking.");
    }

    void becomeImmobile(){
        this.isImmobile = true;
    }

    void checkImmobile(){
        System.out.print(this.name+" ");
        System.out.println(this.isImmobile?"immobile.":"not immobile.");
    }
}