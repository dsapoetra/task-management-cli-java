
package commands;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nTask Management CLI");
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Mark Task In Progress");
            System.out.println("5. Mark Task Done");
            System.out.println("6. Delete Task");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    AddTask.run();
                    break;
                case 2:
                    ListTask.run();
                    break;
                case 3:
                    UpdateTask.run();
                    break;
                case 4:
                    MarkInProgress.run();
                    break;
                case 5:
                    MarkDone.run();
                    break;
                case 6:
                    DeleteTask.run();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
