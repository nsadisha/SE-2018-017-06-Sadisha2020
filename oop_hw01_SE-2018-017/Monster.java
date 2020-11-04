public class Monster {
    String name;
    int age;

    Monster(String name, int age){
        this.name = name;
        this.age = age;
    }

    // methods
    void walk(){
        System.out.println(this.name+" is walking.");
    }

    void stealTheStickFrom(Warrior warrior) {
        if(!warrior.isImmobile){
            warrior.becomeImmobile();
            System.out.println(this.name+" stealed the stick from "+warrior.name);
        }else{
            System.out.println(warrior.name+" doesn't have a stick.");
        }
    }
}
