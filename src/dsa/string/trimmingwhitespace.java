package dsa.string;
import java.util.Scanner;
public class trimmingwhitespace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine(); // Read input string from the user    
        String trimmedStr = str.trim();
        System.out.println("Original String: '" + str + "'");
        System.out.println("Trimmed String: '" + trimmedStr + "'");
    }
}
