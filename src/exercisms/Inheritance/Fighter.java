package exercisms.Inheritance;

abstract class Fighter {

    boolean vulnerable = false;


    boolean isVulnerable() {
        return false;
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        System.out.println(warrior);
        System.out.println(warrior.isVulnerable());
    }

    @Override
    public String toString() {
        Warrior warrior = new Warrior();
        String className = warrior.getClass().getSimpleName();
        return "Fighter is a " + className;
    }

    @Override
    int damagePoints(Fighter fighter) {
        throw new UnsupportedOperationException("Please implement Warrior.damagePoints() method");
    }
}

class Wizard extends Fighter {


    boolean speelActivate = false;

    @Override
    public String toString() {
        Wizard wizard = new Wizard();
        String className = wizard.getClass().getSimpleName();
        return "Fighter is a " + className;
    }

    @Override
    boolean isVulnerable() {
        if (speelActivate){
            this.vulnerable = false;
        } else this.vulnerable = true;
        return this.vulnerable;
    }

    @Override
    int damagePoints(Fighter fighter) {
        int damagePoints = 0;
        if (speelActivate){
           damagePoints = 12;
        } else damagePoints = 3;
        return damagePoints;
    }

    void prepareSpell() {
            if (this.vulnerable == true){
            this.vulnerable = false;
            this.speelActivate = true;
        } else this.speelActivate = true;
    }

}
