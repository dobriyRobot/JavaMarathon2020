package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYearOfIssue(1902);
        car1.setColor("Green");
        car1.setModel("Toyota");
        car1.info();
        int year1 = car1.yearDifference(2002);
        if(year1 == 0){
            System.out.println("ERROR!  Разница годов отрицательная");
        } else {
            System.out.println("Разница годов " + year1);
        }
        Motorbike motorbike1 = new Motorbike(2022, "Black", "Harley");
        motorbike1.info();
        int year2 = motorbike1.yearDifference(1222);
        if(year2 == 0){
            System.out.println("ERROR!  Разница годов отрицательная");
        } else {
            System.out.println("Разница годов " + year2);
        }
    }
}
