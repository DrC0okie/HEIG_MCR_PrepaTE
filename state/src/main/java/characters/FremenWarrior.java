package characters;

import states.*;

public class FremenWarrior {
    private State state;

    public FremenWarrior() {
        // Initialement en état de repos
        this.state = new IdleState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void attack() {
        state.attack(this);
    }

    public void defend() {
        state.defend(this);
    }

    public void rest() {
        state.rest(this);
    }
}
