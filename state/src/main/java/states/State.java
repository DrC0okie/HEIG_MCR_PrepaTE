package states;

import characters.FremenWarrior;

public interface State {
    void attack(FremenWarrior warrior);
    void defend(FremenWarrior warrior);
    void rest(FremenWarrior warrior);
}
