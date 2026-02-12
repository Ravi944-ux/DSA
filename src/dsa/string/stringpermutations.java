package dsa.string;
import java.util.Scanner;
public class stringpermutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        generatepermutations(str, "");
        scanner.close();
}
    public static void generatepermutations(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
            return;
        }
         for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                generatepermutations(rem, prefix + str.charAt(i));
            }
        }
    }
