package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // System.out.print("Введите число а: ");
        int a = scanner.nextInt();
       // System.out.print("Введите число b: ");
        int b = scanner.nextInt();
        if (a >= b) {
            System.out.println("Некорректный ввод");
        } else {
            for (int i = a + 1; i < b; i++) {
                double mod1 = i % 5;
                double mod2 = i % 10;
                if (mod1 == 0 && (mod2 > 0 || mod2 <0)) {
                    System.out.print(i + " ");
                }
            }
        }
    }

}
