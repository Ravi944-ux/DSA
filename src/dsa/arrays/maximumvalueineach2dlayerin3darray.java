package dsa.arrays;
import java.util.Scanner;
public class maximumvalueineach2dlayerin3darray {
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

        for (int i = 0; i < d; i++) {
            int max = array3D[i][0][0];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (array3D[i][j][k] > max) {
                        max = array3D[i][j][k];
                    }
                }
            }
            System.out.println("Maximum value in layer " + (i + 1) + " = " + max);
        }

        scanner.close();
    }
}
