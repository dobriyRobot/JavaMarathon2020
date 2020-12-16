package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\fuNky\\javaProjects\\JavaMarathon2020\\src\\main\\resources\\shoes.csv");
        PrintWriter printWriter = new PrintWriter("C:\\Users\\fuNky\\javaProjects\\JavaMarathon2020\\src\\main\\resources\\missing_shoes.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] arrLines = line.split(";");
                if ((Integer.parseInt(arrLines[2])) == 0){
                    System.out.println(line);
                    printWriter.print(line + "\n");
                }
            }
        scanner.close();
        printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден"); ;
        }

    }
}
