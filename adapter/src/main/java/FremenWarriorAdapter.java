class FremenWarriorAdapter implements Character {
    private FremenWarrior fremenWarrior;

    public FremenWarriorAdapter(FremenWarrior fremenWarrior) {
        this.fremenWarrior = fremenWarrior;
    }

    @Override
    public void attack() {
        // Adapter l'appel à l'interface de FremenWarrior
        fremenWarrior.crySkirmish();
    }
}