
package commands;

import utils.TaskManager;
import java.util.Scanner;

public class MarkInProgress {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter task ID to mark as in progress:");
        int taskId = scanner.nextInt();
        
        if (TaskManager.markInProgress(taskId)) {
            System.out.println("Task marked as in progress.");
        } else {
            System.out.println("Task ID not found.");
        }
    }
}
