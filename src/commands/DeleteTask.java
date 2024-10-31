
package commands;

import utils.TaskManager;
import java.util.Scanner;

public class DeleteTask {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter task ID to delete:");
        int taskId = scanner.nextInt();
        
        if (TaskManager.deleteTask(taskId)) {
            System.out.println("Task deleted successfully.");
        } else {
            System.out.println("Task ID not found.");
        }
    }
}
