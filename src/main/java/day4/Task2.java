package day4;

public class Task2 {
    public static void main(String[] args) {
        int count = 0;
        int summa = 0;
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = (int) (Math.random() * 10000);
        }
        int max = array[0];
        int min = array[0];
        for (int num : array) {
            if (max < num) {
                max = num;
            } else if (min > num) {
                min = num;
            }
            int temp = num;
            if ((temp % 10) == 0) {
                count++;
                summa = summa + num;
            }
        }
        System.out.println("\nНаибольший элемент массива: " + max + "\nНаименьшей элемент массива: " + min +
                "\nКоличество элементов массива, оканчивающихся на 0: " + count + "\nСумму элементов массива, оканчивающихся на 0: " + summa);
    }
}
