package dsa.collections;
import java.util.ArrayList;
import java.util.Scanner;
public class program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numberOfElements; i++) {
            list.add(scanner.nextInt());
        }
        System.out.println("Size " + list.size());
        System.out.println("Elements in the list:");
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            if(i < list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();   
        scanner.close();
    }
}
