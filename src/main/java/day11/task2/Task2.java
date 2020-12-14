package day11.task2;

import day11.task2.Classes.Magician;
import day11.task2.Classes.Paladin;
import day11.task2.Classes.Shaman;
import day11.task2.Classes.Warrior;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior1 = new Warrior();
        Paladin paladin1 = new Paladin();
        Magician magician1 = new Magician();
        Shaman shaman1 = new Shaman();

        warrior1.physicalAttack(paladin1);
        System.out.println(paladin1);

        paladin1.physicalAttack(magician1);
        System.out.println(magician1);

        shaman1.healTeammate(magician1);
        System.out.println(magician1);

        magician1.magicalAttack(paladin1);
        System.out.println(paladin1);

        shaman1.physicalAttack(warrior1);
        System.out.println(warrior1);

        paladin1.healHimself();
        System.out.println(paladin1);

        for(int i = 0; i < 5; i ++){
            warrior1.physicalAttack(magician1);
            System.out.println(magician1);
        }
    }

}
