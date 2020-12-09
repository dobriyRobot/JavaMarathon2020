package day8;

public class Task1_2 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        StringBuilder numbers = new StringBuilder();
        for(int i = 0; i < 20000; i++){
            numbers.append(" ").append(i);
        }
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        System.out.println(timeConsumedMillis);
        System.out.println(numbers.toString());
    }
}
