package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Введите X = ");
        double x = scanner.nextDouble();
        if (x >= 5) {
            double y = (x * x - 10) / (x + 7);
            System.out.println(y);
        } else if (x < 5 && x > -3) {
            double y = (x + 3) * (x * x - 2);
            System.out.println(y);
        } else {
            System.out.println(420.0);
        }
    }
}
