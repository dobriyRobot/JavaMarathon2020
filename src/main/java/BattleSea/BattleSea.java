package BattleSea;

import java.util.Scanner;

public class BattleSea {
    public static void main(String[] args) {
        Badge halo = Badge.HALO;
        Badge hit = Badge.HIT;
        Badge empty = Badge.EMPTY;
        Badge startField[][] = new Badge[10][10];
        for (int i = 0; i < startField.length; i ++){
            for (int j = 0; j < startField[i].length; j ++){
                startField[i][j] = empty;
            }
        }
        System.out.println("Введите имя 1ого игрока ");
        Scanner scanner1 = new Scanner(System.in);
        PlayingField field1 = new PlayingField(startField);
        Player player1 = new Player(scanner1.nextLine(), field1);


        System.out.println("Введите имя 2ого игрока ");
        Scanner scanner2 = new Scanner(System.in);
        PlayingField field2 = new PlayingField(startField);
        Player player2 = new Player(scanner2.nextLine(), field2);


        System.out.println("Начнемм расставлять корабли на поле " + player1 + ". " + player2 + " отвернись, не смотри!");
        System.out.println("Введите координаты четырехпалубного корабля (формат:x,y;x,y;x,y;x,y): ");
        player1.addShip();
        System.out.println("Введите координаты четырехпалубного корабля (формат:x,y;x,y;x,y;x,y): ");
        player2.addShip();

        player1.printField();
        player2.printField();

        //что то не так, никак не могу понять((
    }

}
