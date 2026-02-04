package dsa.string;
import java.util.Scanner;
public class charAtmethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int index = scanner.nextInt();
        if (index >= 0 && index < inputString.length()) {
            char characterAtIndex = inputString.charAt(index);
            System.out.println("The character at index " + index + " is: '" + characterAtIndex + "'.");
        } else {
            System.out.println("Invalid index.");
        }
        scanner.close();
    }
}
