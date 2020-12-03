package day4;

public class Task3 {
    public static void main(String[] args) {
        int m = 12;
        int n = 8;
        int flag = 0;
        int[] summa = new int[m];
        int max = 0;
        int[][] matrix = new int[m][n];
        for(int i = 0; i < m; i ++){
            for(int j = 0; j < n; j ++){
                matrix[i][j] = (int)(Math.random() * 50);
            }
        }
        for (int i = 0; i < m; i++) {
            int temp = 0;
            for (int j = 0; j < n; j++) {
                temp = temp + matrix[i][j];
            }
            if(max < temp){
                flag = 0;
                max = temp;
                flag = i + 1;
            }
        }
        System.out.println("\nСТРОКА: " + flag);
    }
}
