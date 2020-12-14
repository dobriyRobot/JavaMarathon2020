package day11.task2.Classes;

import day11.task2.Interfaces.PhysAttack;

public class Warrior extends Hero implements PhysAttack {

    public Warrior(){
        physDef = 80;
        magicDef = 0;
        physAtt = 30;
    }

    public String toString() {
        return "Warrior {health = " + health + "}";
    }
}
