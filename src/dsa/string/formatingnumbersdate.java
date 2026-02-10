package dsa.string;
import java.util.Scanner;   
public class formatingnumbersdate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.printf("Formatted number with commas: %,d%n", number);

        System.out.print("Enter a date (yyyy-MM-dd): ");
        String dateInput = scanner.next();
        String[] dateParts = dateInput.split("-");
        if (dateParts.length == 3) {
            String formattedDate = String.format("%s/%s/%s", dateParts[2], dateParts[1], dateParts[0]);
            System.out.println("Formatted date: " + formattedDate);
        } else {
            System.out.println("Invalid date format.");
        }
        scanner.close();
    }
}
