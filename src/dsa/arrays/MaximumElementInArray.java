package dsa.arrays;
import java.util.Scanner;
public class MaximumElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size  = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.print("Array: [");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
        
        System.out.println("Maximum value = " + max);
        sc.close();
    }
}
