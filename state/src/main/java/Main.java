import characters.FremenWarrior;

public class Main {
    public static void main(String[] args) {
        FremenWarrior warrior = new FremenWarrior();

        // Essayer de différentes actions et observer les transitions d'état
        warrior.attack();  // Idle -> Attacking
        warrior.defend();  // Attacking -> Defending
        warrior.rest();    // Defending -> Idle
        warrior.rest();    // Idle -> Idle
        warrior.defend();  // Idle -> Defending
        warrior.attack();  // Defending -> Attacking
    }
}