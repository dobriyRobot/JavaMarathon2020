package day11.task2.Classes;

import day11.task2.Interfaces.MagicAttack;
import day11.task2.Interfaces.PhysAttack;

public class Magician extends Hero implements PhysAttack, MagicAttack {
    double magicAtt;

    public Magician(){
        physDef = 0;
        magicDef = 80;
        physAtt = 5;
        magicAtt = 20;
    }

    public String toString() {
        return "Magician {health = " + health + "}";
    }
    public void magicalAttack(Hero hero){
        double mAttack = magicAtt * (1 - hero.magicDef / 100);
        if (hero.health - mAttack < 0) {
            hero.health = 0;
        } else {
            hero.health = hero.health - mAttack;
        }
    }
}
