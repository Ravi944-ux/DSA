package dsa.string;
import java.util.Scanner;
public class substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int startIndex = scanner.nextInt();
        int endIndex = scanner.nextInt();
        if (startIndex >= 0 && endIndex <= str.length() && startIndex < endIndex) {
            String substring = str.substring(startIndex, endIndex);
            System.out.println("The substring from index " + startIndex + " to " + endIndex + " is: '" + substring + "'.");
        } else {
            System.out.println("Invalid indices.");
        }
        scanner.close();
    }
}
