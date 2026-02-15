package dsa.collections;
import java.util.ArrayList;
import java.util.Scanner;
public class program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < numberOfElements; i++) {
            list.add(scanner.next());
        }
        int index = scanner.nextInt();
        list.remove(index);
        System.out.println("updated Arraylist: ");
        for (String element : list){
            System.out.print(element + " ");
        }
        scanner.close();
    }
}