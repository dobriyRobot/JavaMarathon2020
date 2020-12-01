package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Введите число а: ");
        int a = scanner.nextInt();
        //System.out.print("Введите число b: ");
        int b = scanner.nextInt();
        if (a >= b) {
            System.out.println("Некорректный ввод");
        } else {
            while (a < b) {
                a++;
                double mod1 = a % 5;
                double mod2 = a % 10;
                if (mod1 == 0 && (mod2 > 0 || mod2 <0)) {
                    System.out.print(a + " ");
                }
            }
        }
    }
}
