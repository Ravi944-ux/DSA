package dsa.string;
import java.util.Scanner;
public class removevowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        String resultString = inputString.replaceAll("[AEIOUaeiou]", "");
        System.out.println("String after removing vowels: " + resultString);
        scanner.close();
    }
}