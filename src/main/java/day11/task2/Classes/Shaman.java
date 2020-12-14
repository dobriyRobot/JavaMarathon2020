package day11.task2.Classes;

import day11.task2.Interfaces.Healer;
import day11.task2.Interfaces.MagicAttack;
import day11.task2.Interfaces.PhysAttack;

public class Shaman extends Hero implements Healer, PhysAttack, MagicAttack {
    double magicAtt;

    public Shaman(){
        physDef = 20;
        magicDef = 20;
        physAtt = 10;
        magicAtt = 15;
    }

    public String toString() {
        return "Shaman {health = " + health + "}";
    }

    public void healHimself(){
        if ((health + 50) > 100) {
            health = 100;
        } else {
            health += 50;
        }
    }
    public void healTeammate(Hero hero){
        if((hero.health + 30) > 100){
            hero.health = 100;
        } else {
            hero.health += 30;
        }
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
