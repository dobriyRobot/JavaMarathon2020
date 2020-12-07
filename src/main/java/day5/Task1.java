package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYearOfIssue(2002);
        car1.setColor("Red");
        car1.setModel("Jeep");
        System.out.println("Модель авто: " + car1.getModel() + "\nЦвет авто: " + car1.getColor() +
                "\nГод выпуска: " + car1.getYearOfIssue());
    }
}
