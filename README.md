
# Task Management CLI (Java Version)

This is a Command-Line Interface (CLI) application for managing tasks. Originally written in JavaScript, this program has been converted to Java. It provides various functionalities for adding, listing, updating, marking, and deleting tasks.

## Features

1. **Add Task**: Adds a new task with a unique ID.
2. **List Tasks**: Lists all tasks with their ID, name, status, and creation date.
3. **Update Task**: Updates the name of an existing task.
4. **Mark Task In Progress**: Marks a task as "In Progress".
5. **Mark Task Done**: Marks a task as "Done".
6. **Delete Task**: Deletes a task using its ID.
7. **Exit**: Exits the program.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher

### Installation

1. Download and unzip the project files.
2. Open a terminal and navigate to the `src` directory.

### Compilation

Run the following command to compile all Java files:
```bash
javac utils/*.java commands/*.java
```

### Running the Program

After compiling, run the program with:
```bash
java commands.Main
```

## Usage

The program will display a menu with the following options:

1. Add Task
2. List Tasks
3. Update Task
4. Mark Task In Progress
5. Mark Task Done
6. Delete Task
7. Exit

Select an option by entering the corresponding number and following the prompts.

## Example

Here is a simple interaction example:

```plaintext
Task Management CLI
1. Add Task
2. List Tasks
3. Update Task
4. Mark Task In Progress
5. Mark Task Done
6. Delete Task
7. Exit
Choose an option: 1

Enter task name: Buy groceries
Added task: Task{id=1, name='Buy groceries', status='Pending', createdAt=2023-10-31}

Task Management CLI
Choose an option: 2

Listing all tasks:
Task{id=1, name='Buy groceries', status='Pending', createdAt=2023-10-31}
```

## License

This project is provided for educational purposes and does not have a specific license.

---

Feel free to modify and expand this program to suit your needs!
