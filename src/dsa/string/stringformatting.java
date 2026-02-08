package dsa.string;
import java.util.Scanner;
public class stringformatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        String formattedString = String.format("Name: %s, Age: %d", name, age);
        System.out.println(formattedString);
        scanner.close();
    }
}
