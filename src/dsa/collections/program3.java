package dsa.collections;
import java.util.ArrayList;
import java.util.Scanner;
public class program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < numberOfElements; i++) {
            list.add(scanner.next());
        }
        int index = scanner.nextInt();
        scanner.nextLine();
        String newString = scanner.nextLine();
        list.add(index, newString);
        System.out.println("updated Arraylist: ");
        for(String element : list){
            System.out.print(element + " ");
        }
        System.out.println();
        scanner.close();
    }
}