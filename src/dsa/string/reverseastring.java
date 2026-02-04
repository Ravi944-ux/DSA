package dsa.string;
import java.util.Scanner;
public class reverseastring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Str = scanner.nextLine();
        StringBuilder sb = new StringBuilder(Str).reverse();
        System.out.println("The reversed string is: '" + sb.toString() + "''.");
        scanner.close();
    }
}