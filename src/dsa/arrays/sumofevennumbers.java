package dsa.arrays;
import java.util.Scanner;
public class sumofevennumbers {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int sumEven = 0;
        System.out.print("Array: [");
        for (int i = 0; i < size; i++){
            if (arr[i] % 2 == 0) {
                sumEven += arr[i];
        }
            System.out.print(arr[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.println("Sum of even numbers = " + sumEven);
        scanner.close();
    }
}
