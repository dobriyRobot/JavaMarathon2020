package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
    String word = "";
        while (word != "Stop") {
            Scanner scanner = new Scanner(System.in);
            word = scanner.nextLine();
            switch (word) {
                case "Москва", "Владивосток", "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим", "Милан", "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль", "Манчестер", "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин", "Мюнхен", "Кёльн":
                    System.out.println("Германия");
                    break;
                case "Stop":
                    word = "Stop";
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }
        }
    }
}
