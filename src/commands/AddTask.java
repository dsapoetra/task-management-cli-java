
package commands;

import utils.Task;
import utils.TaskManager;
import java.util.Scanner;

public class AddTask {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter task name:");
        String taskName = scanner.nextLine();
        
        Task newTask = TaskManager.addTask(taskName);
        System.out.println("Added task: " + newTask);
    }
}
