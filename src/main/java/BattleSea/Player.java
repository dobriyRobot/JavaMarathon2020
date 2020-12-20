package BattleSea;

import java.util.Scanner;

public class Player {
    private String name;
    private PlayingField playingField;

    public Player(String name, PlayingField playingField){
        this.name = name;
        this.playingField = playingField;
    }

    public void addShip(){
        Badge ship = Badge.SHIP;
        Scanner scanner = new Scanner(System.in);
        String[] xyString = scanner.nextLine().split(";");
        Badge[][] qq = playingField.getField();
        for (int i = 0; i < xyString.length; i ++){
            String[] xy = xyString[i].split(",");
            int x = Integer.parseInt(xy[0]) - 1;
            int y = Integer.parseInt(xy[1]) - 1;
            qq [x][y] = ship;
        }
        playingField.setField(qq);
    }

    public void printField(){
        for(int i = 0; i < playingField.getField().length; i ++){
            for (int j = 0; j < playingField.getField()[i].length; j ++){
                System.out.print(playingField.getField()[i][j].getName());
            }
            System.out.println("");
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
