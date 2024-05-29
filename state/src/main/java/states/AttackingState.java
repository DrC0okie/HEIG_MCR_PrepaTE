package states;

import characters.FremenWarrior;

public class AttackingState implements State {
    @Override
    public void attack(FremenWarrior warrior) {
        System.out.println("Fremen warrior is already attacking!");
    }

    @Override
    public void defend(FremenWarrior warrior) {
        System.out.println("Fremen warrior switches to defending!");
        warrior.setState(new DefendingState());
    }

    @Override
    public void rest(FremenWarrior warrior) {
        System.out.println("Fremen warrior stops attacking and rests.");
        warrior.setState(new IdleState());
    }
}