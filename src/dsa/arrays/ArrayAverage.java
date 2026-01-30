package dsa.arrays;
import java.util.Scanner;
public class ArrayAverage {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        double average = (double) sum / n;
        System.out.print("Array: [");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.println("Average = " + average);
        scanner.close();
    }
}
