
package commands;

import utils.TaskManager;

public class ListTask {
    public static void run() {
        System.out.println("Listing all tasks:");
        TaskManager.listTasks().forEach(System.out::println);
    }
}
