package dsa.string;
import java.util.Scanner;
public class reverseastringwithoutreversemethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        StringBuilder reversedString = new StringBuilder();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversedString.append(inputString.charAt(i));
        }
        System.out.println("Original string: " + inputString);
        System.out.println("Reversed string: " + reversedString.toString());
        scanner.close();
    }
}
