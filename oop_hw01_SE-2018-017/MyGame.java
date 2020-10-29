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
