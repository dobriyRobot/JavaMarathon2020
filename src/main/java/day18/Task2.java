package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(717771237));
    }

    public static int count7(int number) {
        int count = 0;
        int length = String.valueOf(number).length() - 1;
        if (String.valueOf(number).charAt(length) == '7')
            count++;
        if (length == 0)
            return count;
        return count + count7(Integer.parseInt(String.valueOf(number).substring(0, length)));
    }
}
