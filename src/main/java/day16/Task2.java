package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        final int COUNT_LOOP_AVERAGE = 4;
        PrintWriter pWriter1 = new PrintWriter("file_1.txt");
        PrintWriter pWriter2 = new PrintWriter("file_2.txt");
        Random random = new Random();
        for (int i = 0; i < 12; i++) {
            pWriter1.print(random.nextInt(100) + " ");
        }
        pWriter1.close();
        double averageSum = 0;
        int flag = 0;
        File file = new File("file_1.txt");
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        for (int i = 0; i < numbers.length; i++) {
            if (flag == COUNT_LOOP_AVERAGE) {
                pWriter2.print(averageSum / COUNT_LOOP_AVERAGE  + " ");
                flag = 0;
                averageSum = 0;
            }
            averageSum = averageSum + Double.parseDouble(numbers[i]);
            flag ++;
        }
        pWriter2.print(averageSum / COUNT_LOOP_AVERAGE  + " ");
        scanner.close();
        pWriter2.close();
        File file2 = new File("file_2.txt");
        printResult(file2);
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        double sum = 0;
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        for(String num : numbers)
            sum = sum + Double.parseDouble(num);
        System.out.println("Ответ " + (int)Math.floor(sum) );
        scanner.close();
    }
}

