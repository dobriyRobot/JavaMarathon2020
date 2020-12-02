package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        double num1 = scanner1.nextDouble();
        double num2 = scanner2.nextDouble();
        while (num2 != 0){
            double division = num1 / num2;
            System.out.println(division);
            num1 = scanner1.nextDouble();
            num2 = scanner2.nextDouble();
        }
        System.out.println("работа программы завершается");
    }
}
