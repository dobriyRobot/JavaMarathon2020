package day18;

public class Task1 {
    public static int counter = 10;

    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(recursionSum(numbers));
    }

    private static int recursionSum(int[] num){
        int sum = 0;
        sum = sum + num[counter];
        counter--;
        if(counter == 0)
            return sum + num[counter];
        return sum + recursionSum(num);
    }
}
