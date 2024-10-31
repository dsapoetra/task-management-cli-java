
package commands;

import utils.TaskManager;
import java.util.Scanner;

public class MarkDone {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter task ID to mark as done:");
        int taskId = scanner.nextInt();
        
        if (TaskManager.markDone(taskId)) {
            System.out.println("Task marked as done.");
        } else {
            System.out.println("Task ID not found.");
        }
    }
}
