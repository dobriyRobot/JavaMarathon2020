package day4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int equalOne = 0;
        int equalZero = 0;
        int evenCount = 0;
        int oddCount = 0;
        int bigEight = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int summa = 0;
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 11);
            summa = summa + array[i];
            if (array[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            if (array[i] > 8) {
                bigEight++;
            } else if (array[i] == 1) {
                equalOne++;
            } else if (array[i] == 0) {
                equalZero++;
            }
            System.out.print("[" + array[i] + "]");
        }
        scanner.close();
        System.out.println("\nДлина массива: " + n + "\nКоличетсов чисел больше 8: " + bigEight +
                "\nКоличество равных 1: " + equalOne + "\nКоличество четных чисел: " + evenCount +
                        "\nКоличество нечетных чисел: " + oddCount + "\nСумма всех элементов массива: " + summa);
    }
}
