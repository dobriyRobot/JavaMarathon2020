package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        System.out.println(parseFileToObject(file));
    }
    public static List<Person> parseFileToObject(File file){
        List<Person> listOfPeople = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] people = line.split(" ");
                if (Integer.parseInt(people[1]) < 0)
                    throw new IOException();
                listOfPeople.add(new Person(people[0], Integer.parseInt(people[1])));
            }
            scanner.close();
            return listOfPeople;

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e){
            System.out.println("Некорректный файл");
        }
        return null;
    }

}
