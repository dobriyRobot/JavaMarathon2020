package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack {

    public Paladin() {
        physDef = 50;
        magicDef = 20;
        physAtt = 15;
    }

    public String toString() {
        return "Paladin {health = " + health + "}";
    }

    public void healHimself() {
        if ((health + 25) > 100) {
            health = 100;
        } else {
            health += 25;
        }
    }

    public void healTeammate(Hero hero) {
        if((hero.health + 10) > 100){
            hero.health = 100;
        } else {
            hero.health += 10;
        }
    }
}
