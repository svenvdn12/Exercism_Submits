abstract class Fighter {

    boolean isVulnerable() {
        return false;
    }

    abstract int damagePoints(Fighter fighter);

    @Override
    public String toString() {
        return "Fighter is a "+ this.getClass().getName();
    }
}

class Warrior extends Fighter {

    @Override
    int damagePoints(Fighter wizard) {
        if (wizard.isVulnerable()) return 10;
        else return 6;
    }
}

class Wizard extends Fighter {

    private boolean spellPrepared;

    @Override
    boolean isVulnerable() {
        return !spellPrepared;
    }

    @Override
    int damagePoints(Fighter warrior) {
        if(spellPrepared)return 12;
        else return 3;
    }

    void prepareSpell() {
        this.spellPrepared = true;
    }

}
