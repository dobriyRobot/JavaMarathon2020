package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("file1");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        String line = "";
        int sum = 0;
        try {
            Scanner scanner = new Scanner(file);
            line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            int[] numbers = new int[numbersString.length];
            if (numbersString.length != 10) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Некорректный входной файл");
                }
            } else {
                for (int i = 0; i < numbers.length; i++) {
                    sum = sum + Integer.parseInt(numbersString[i]);
                }
                System.out.println(sum);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
