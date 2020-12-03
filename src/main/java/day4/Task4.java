package day4;

public class Task4 {
    public static void main(String[] args) {
        int count = 0;
        int max = 0;
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = (int) (Math.random() * 10000);
        }
        for (int i = 0; i < 98; i++) {
            int summa = 0;
            for (int t = i; t < (i + 3); t++) {
                summa = summa + array[t];
                if (summa > max) {
                    max = summa;
                    count = i;
            }
                        }
        }
        System.out.println("\n " + max + "\n " + count);
    }
}
