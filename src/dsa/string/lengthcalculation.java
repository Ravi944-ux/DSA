package dsa.string;
import java.util.Scanner;
public class lengthcalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int length = inputString.length();
        System.out.println("The length of the string is: " + length + ".");
        int limit = 165;
        if (length <= limit) {
        } else {
            System.out.println("The string length exceeds the limit of " + limit + ".");
        }
        scanner.close();
    }
}
