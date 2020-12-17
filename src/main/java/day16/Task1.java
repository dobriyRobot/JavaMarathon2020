package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("file1");
        printResult(file);
    }
        public static void printResult (File file){
            DecimalFormat decimalFormat = new DecimalFormat("##.###");
            double average, sum = 0;
            try {
                Scanner scanner = new Scanner(file);
                String line = scanner.nextLine();
                String[] stringNumbers = line.split(" ");
                for (String num : stringNumbers)
                    sum = sum + Double.parseDouble(num);
                average = sum / stringNumbers.length;
                scanner.close();
                System.out.println(average + "  -->  " + decimalFormat.format(average));
            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден");
            }
        }
}

