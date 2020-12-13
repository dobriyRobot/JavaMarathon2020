package day11.task2;

public abstract class Hero implements PhysAttack {
    double health;
    double physAtt;
    double physDef;
    double magicDef;

    public Hero() {
        health = 100;
    }
    public void physicalAttack(Hero hero) {
        double pAttack = physAtt * (1 - hero.physDef / 100);
        if (hero.health - pAttack < 0) {
            hero.health = 0;
        } else {
            hero.health = hero.health - pAttack;
        }
    }
}
