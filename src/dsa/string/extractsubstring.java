package dsa.string;
import java.util.Scanner;
public class extractsubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        int start = scanner.nextInt();
        int end = scanner.nextInt();
        String sub = str.substring(start, end);
        System.out.println("The extracted substring is: '" + sub + "'.");
        scanner.close();
    }
}
