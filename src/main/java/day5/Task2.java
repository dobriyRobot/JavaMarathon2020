package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike1 = new Motorbike(2001, "orange", "Mazda");
        System.out.println("Модель авто: " + motorbike1.getModel() + "\nЦвет авто: " + motorbike1.getColor() +
                "\nГод выпуска: " + motorbike1.getYearOfIssue());
    }
}
