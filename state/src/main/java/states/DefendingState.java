package states;

import characters.FremenWarrior;

public class DefendingState implements State {
    @Override
    public void attack(FremenWarrior warrior) {
        System.out.println("Fremen warrior switches to attacking!");
        warrior.setState(new AttackingState());
    }

    @Override
    public void defend(FremenWarrior warrior) {
        System.out.println("Fremen warrior is already defending!");
    }

    @Override
    public void rest(FremenWarrior warrior) {
        System.out.println("Fremen warrior stops defending and rests.");
        warrior.setState(new IdleState());
    }
}