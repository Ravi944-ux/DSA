package dsa.arrays;
import java.util.Scanner;

public class ReverseOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Original array: [");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int[] reversedArr = new int[n];
        for (int i = 0; i < n; i++) {
            reversedArr[i] = arr[n - 1 - i];
        }

        System.out.println("Reversed Array: [");
        for (int i = 0; i < n; i++) {
            System.out.print(reversedArr[i]);
            if (i !=  n - 1) {
                System.out.print(", ");
        }
        System.out.println("]");
        sc.close();
    }
}
}

