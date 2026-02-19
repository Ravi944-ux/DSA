package dsa.collections;
import java.util.LinkedList;
import java.util.Scanner;
public class program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedList<String> task = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String taskName = scanner.nextLine();
            task.addLast(taskName);
        }
        System.out.println("Queue size: " + task.size());
        System.out.println("Tasks: ");
        for (String t : task) {
            System.out.println(t);
    }
        scanner.close();
    }
}