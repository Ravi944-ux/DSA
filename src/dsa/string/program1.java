package dsa.string;
import java.util.Scanner;
public class appendstringsusingSb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine(); 

        StringBuffer sb = new StringBuffer(s1);
        sb.append(s2);
        StringBuffer sbi = new StringBuffer(sb);
        sbi.append(s3);
        System.out.println("The concatenated string is: " + sbi.toString());
        scanner.close();
    }
}
