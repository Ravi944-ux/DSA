package dsa.string;
import java.util.Scanner;
public class indexof {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        char characterToFind = scanner.nextLine().charAt(0);
        int index = inputString.indexOf(characterToFind);
        if (index != -1) {
            System.out.println("The index of the first occurrence is '" + characterToFind + "' is: " + index + ".");
        } else {
            System.out.println("Character not found '" + characterToFind + "' not found in the string.");
        }
        scanner.close();
    }
}
