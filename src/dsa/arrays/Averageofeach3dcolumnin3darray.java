package dsa.arrays;
import java.util.Scanner;   
public class Averageofeach3dcolumnin3darray {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int d = scanner.nextInt();
    int n = scanner.nextInt(); 
    int m = scanner.nextInt();
    int[][][] array3D = new int[d][n][m];

    for (int i = 0; i < d; i++) {
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < m; k++) {
                array3D[i][j][k] = scanner.nextInt();
            }
        }
    }
    System.out.println("\n3D Array:");
    for (int i = 0; i < d; i++) {
        System.out.println("Layer " + (i + 1) + ":");
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < m; k++) {
                System.out.print(array3D[i][j][k] + " ");
            }
            System.out.println();
        }
    }
    for(int j = 0; j < n; j++) {
        for(int k = 0; k < m; k++) {
            int sum = 0;
            for(int i = 0; i < d; i++) {
                sum = sum + array3D[i][j][k];
            }
            double average = sum / (double)d;
            System.out.printf("Average of column (%d, %d) = %.1f%n", j , k , average);
        }
    }
    scanner.close();
}   
}
