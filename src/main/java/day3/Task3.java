package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double num1, num2;
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            num1 = scanner1.nextDouble();
            num2 = scanner2.nextDouble();
            switch ((int) num2){
                case 0:
                    System.out.println("Деление на 0");
                    continue;
                default:
                    System.out.println(num1 / num2);
            }
        }
    }
}
