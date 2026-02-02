package dsa.string;
import java.util.Scanner;
public class immutableusernameupdate {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);   
            String originalusername = scanner.nextLine();
            String suffix = scanner.nextLine(); 
            String newUsername = originalusername + suffix;
            System.out.println("Original Username: " + originalusername);
            System.out.println("New Username: " + newUsername);     
            scanner.close();
}
}
