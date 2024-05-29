package states;

import characters.FremenWarrior;

public class IdleState implements State {
    @Override
    public void attack(FremenWarrior warrior) {
        System.out.println("Fremen warrior starts attacking!");
        warrior.setState(new AttackingState()); // Set state quand on change d'état
    }

    @Override
    public void defend(FremenWarrior warrior) {
        System.out.println("Fremen warrior starts defending!");
        warrior.setState(new DefendingState());
    }

    @Override
    public void rest(FremenWarrior warrior) {
        System.out.println("Fremen warrior is already resting.");
    }
}
