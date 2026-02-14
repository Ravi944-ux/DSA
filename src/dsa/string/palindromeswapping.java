package dsa.string;
import java.util.Scanner;
public class palindromeswapping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (canFormPalindrome(str)) {
            System.out.println("Yes, it can be rearranged to form a palindrome.");
        } else {
            System.out.println("No, it cannot be rearranged to form a palindrome.");
        }
        scanner.close();
    }

    public static boolean canFormPalindrome(String str) {
        int[] charCount = new int[256]; // Assuming ASCII character set
        for (char c : str.toCharArray()) {
            charCount[c]++;
        }
        int oddCount = 0;
        for (int count : charCount) {
            if (count % 2 != 0) {
                oddCount++;
            }
            if (oddCount > 1) {
                return false; // More than one character has an odd count
            }
        }
        return true; // Can be rearranged to form a palindrome
    }
}
