package dsa.string;
import java.util.Scanner;
public class splittingandjoining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] words = inputString.split(" ");
        System.out.println("Splitted words:");
        for (String word : words) {
            System.out.println(word);
        }
        String joinedString = String.join("-", words);
        System.out.println("Joined string: " + joinedString);
        scanner.close();
    }
}
