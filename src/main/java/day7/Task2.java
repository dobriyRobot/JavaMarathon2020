package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int numberOfPlayer = 3;
        int maxPlayers = 6;
        int [] numbers = new int [maxPlayers];
        Player[] player = new Player[100];
        Random random = new Random();
        for(int i = 0; i < maxPlayers; i++){
            numbers[i] = random.nextInt((100 - 90) + 1) + 90;
            player[i] = new Player(numbers[i]);
        }
        player[numberOfPlayer].info();
        for (int i = 0; i <= (numbers[numberOfPlayer] - 1); i++){
            player[numberOfPlayer].run(player[numberOfPlayer]);
        }
        player[10] = new Player(200);
    }
}
