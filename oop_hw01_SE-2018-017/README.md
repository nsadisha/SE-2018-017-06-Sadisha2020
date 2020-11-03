# OOP_HW01_SE-2018-017

## Question

In a gaming application, each warrior is walking using a walking stick. Monsters can steal these walking sticks. A warrior becomes immobile if he loses the stick. A warrior has a name and age. A monster also has a name and age. 

Add the required methods to these classes. 

In addition to the classes you identified above, you should have a separate class ‘MyGame’ that contains the main method. Inside the main method, create two warrior objects, and a monster object. Now set the first warrior’s age to the monster’s age. Now write the code for the monster to steal the walking stick of the second warrior


## Answer

[Warrior.java](Warrior.java) contains the model of the Warrior

#### Instance Variables
```java
String name;
int age;
Boolean isImmobile;
```

#### Methods
```java
//Setting age
void setAge(int age){
    this.age = age;
}

//Warrior is walking
void walk(){
    System.out.println(this.name+" is walking.");
}

//Warrior becomes immobile
void becomeImmobile(){
    this.isImmobile = true;
}

//Check wheather the warrior is immobile or not
void checkImmobile(){
    System.out.print(this.name+" ");
    System.out.println(this.isImmobile?"immobile.":"not immobile.");
}
```

[Monster.java](Monster.java) contains the model of the Monster

#### Instance Variables
```java
String name;
int age;
```

#### Methods
```java
//Monster is walking
void walk(){
    System.out.println(this.name+" is walking.");
}

//Steal a stick from a warrior
void stealTheStickFrom(Warrior warrior) {
    if(!warrior.isImmobile){
        warrior.becomeImmobile();
        System.out.println(this.name+" stealed the stick from "+warrior.name);
    }else{
        System.out.println(warrior.name+" is doesn't have a stick.");
    }
}
```

In [MyGame.java](MyGame.java) file,

- Created 2 warrior objects and 1 monster.
- Set their names and ages.
- Set first warrior's age to monster's age.
- All 3 charactors are walking.
- Monster steal the stick from warrior 2.
- Then warrior becomes immobile.

Here is the code:
```java
public class MyGame {
    public static void main(String[] args) {
        Warrior warrior1 = new Warrior("Warrior 1", 15);
        Warrior warrior2 = new Warrior("Warrior 2", 20);

        Monster monster = new Monster("Monster",22);

        // setting first warrior's age to monster's age
        warrior1.setAge(monster.age);

        // warrior1, warrior2 and monster are walking
        warrior1.walk();
        warrior2.walk();
        monster.walk();

        System.out.println();
        
        // checkng warriors
        warrior1.checkImmobile();
	warrior2.checkImmobile();

        // steal the stick from warrior 2
        monster.stealTheStickFrom(warrior2);

        // checkng warriors
        warrior1.checkImmobile();
        warrior2.checkImmobile();
    }
}
```