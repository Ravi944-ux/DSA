package dsa.string;
import java.util.Scanner;
public class countoccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String originalString = scanner.nextLine();
        char characterToCount = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < originalString.length(); i++) {
            if (originalString.charAt(i) == characterToCount) {
                count++;
            }
        }
        System.out.println("The character '" + characterToCount + "' occurs " + count + " times in the string.");
        scanner.close();
    }
}
