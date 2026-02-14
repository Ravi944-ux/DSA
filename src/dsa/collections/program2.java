package dsa.collections;
import java.util.ArrayList;
import java.util.Scanner;   
public class program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numberOfElements; i++) {
            list.add(scanner.nextInt());
        }
        int index = scanner.nextInt();
        System.out.println("Element at index " + index + ": " + list.get(index));   
        scanner.close();
    }
}