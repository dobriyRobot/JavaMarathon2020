package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 1920, 1230.34, 34530);
        Airplane airplane2 = new Airplane("AirBUS", 2000, 12355.1, 232);
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}