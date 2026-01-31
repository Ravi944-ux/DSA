package dsa.arrays;
import java.util.Scanner;

public class sumofminimumelementsin2darray {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

    int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nArray:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int sumMin = 0;
        for (int i = 0; i < rows; i++) {
            int min = matrix[i][0];
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }

            System.out.println("Minimum element in row " + (i + 1) + " = " + min);
            sumMin += min;
        }
        System.out.println("Sum of minimum elements = " + sumMin);

        scanner.close();
    }
}

