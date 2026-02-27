import java.util.*;

public class DiagonalSum {
    // Time complexity is O(n^2).
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                } else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("The sum is: " + sum);
        return sum;

        // To make this code more optimized and with less time complexity:
        /*
         * int sum=0;
         * for(int i=0; i<matrix.length; i++) {
         * sum+=matrix[i][i];
         * if(i!=matrix.length-1-i) {
         * sum+=matrix[i][matrix.length-i-1];
         * }
         * return sum;
         *
         * Now its time complexity is O(n).
         * }
         */
    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        diagonalSum(matrix);
    }
}
