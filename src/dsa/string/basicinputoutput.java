package dsa.string;
import java.util.Scanner;
public class basicinputoutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking string input from user
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Displaying the input string
        System.out.println("You entered: " + userInput);

        scanner.close();
    }
}