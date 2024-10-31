
package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskManager {
    private static List<Task> tasks = new ArrayList<>();
    private static int nextId = 1;

    public static Task addTask(String name) {
        Task task = new Task(nextId++, name, "Pending");
        tasks.add(task);
        return task;
    }

    public static List<Task> listTasks() {
        return tasks;
    }

    public static boolean updateTask(int id, String newName) {
        Optional<Task> taskOpt = tasks.stream().filter(t -> t.getId() == id).findFirst();
        if (taskOpt.isPresent()) {
            taskOpt.get().setStatus(newName);
            return true;
        }
        return false;
    }

    public static boolean markInProgress(int id) {
        Optional<Task> taskOpt = tasks.stream().filter(t -> t.getId() == id).findFirst();
        if (taskOpt.isPresent()) {
            taskOpt.get().setStatus("In Progress");
            return true;
        }
        return false;
    }

    public static boolean markDone(int id) {
        Optional<Task> taskOpt = tasks.stream().filter(t -> t.getId() == id).findFirst();
        if (taskOpt.isPresent()) {
            taskOpt.get().setStatus("Done");
            return true;
        }
        return false;
    }

    public static boolean deleteTask(int id) {
        return tasks.removeIf(task -> task.getId() == id);
    }
}
