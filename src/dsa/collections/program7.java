package dsa.collections;
import java.util.LinkedList;
import java.util.Scanner;
public interface program7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedList<String> attendees = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String attendeeName = scanner.nextLine();
            attendees.addLast(attendeeName);
        }
        String firstAttendee = attendees.getFirst();
        String lastAttendee = attendees.getLast();
        System.out.println("First attendee: " + firstAttendee);
        System.out.println("Last attendee: " + lastAttendee);
        System.out.println("Number of attendees: " + attendees.size());
        System.out.println("Attendees: ");
        for (String a : attendees) {
            System.out.println(a);
    }
        scanner.close();
    }
}
