
package commands;

import utils.TaskManager;
import java.util.Scanner;

public class UpdateTask {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter task ID to update:");
        int taskId = scanner.nextInt();
        scanner.nextLine();  // consume newline
        System.out.println("Enter new task name:");
        String newName = scanner.nextLine();
        
        if (TaskManager.updateTask(taskId, newName)) {
            System.out.println("Task updated successfully.");
        } else {
            System.out.println("Task ID not found.");
        }
    }
}
