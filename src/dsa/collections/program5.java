package dsa.collections;
import java.util.LinkedList;
import java.util.Scanner;
public class program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        LinkedList<String> task = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String taskName = scanner.nextLine();
            task.add(taskName);
        }
        System.out.println("Tasks in the list:" + task.size());
        System.out.println("Tasks: ");
        for (String t : task) {
            System.out.println(t);
    }
        scanner.close();
    }
}
