package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // System.out.println("Введите количество этажей: ");
        int floors = scanner.nextInt();
        if (floors > 0) {
            if (floors >= 1 && floors <= 4) {
                System.out.println("Малоэтажный дом");
            } else if (floors >= 5 && floors <= 8) {
                System.out.println("Среднеэтажный дом");
            } else if (floors >= 9) {
                System.out.println("Многоэтажный дом");
            }
        } else System.out.print("Ошибка ввода");
    }
}