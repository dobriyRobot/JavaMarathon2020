package day8;

public class Task1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String numbers = "";
        for (int i = 0; i < 20000; i++) {
            numbers = numbers + " " + i;
        }
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        System.out.println(timeConsumedMillis);
        System.out.println(numbers);
    }
}
