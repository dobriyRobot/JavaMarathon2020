package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boieng", 1999, 332.3, 124);
        airplane1.setProducer("AirBUS");
        airplane1.setLength(2112.23);
        airplane1.fillUp(50);
        airplane1.fillUp(300);
        airplane1.info();
    }
}
