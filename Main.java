import java.io.File;
import java.util.*;

import Javie.Task;
import Javie.TaskManager;

import Javie.TaskManager;
import messenger.Messenger;
import messenger.Person;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        TaskManager taskManager = new TaskManager();
        System.out.println("Choose an option below");
        System.out.println("1 - Add a task");
        System.out.println("2 - Remove a task");
        System.out.println("3 - Display all tasks");
        System.out.println("4 - Display overdue tasks");
        int option = input.nextInt();
        if (option == 1) {
            System.out.println("Insert the title of the task you would like to add -> ");
            String taskName = input.nextLine();
            System.out.println("Insert the description -> ");
            String taskDescription = input.nextLine();
            System.out.println("Insert the due date in YYYY-MM-DD format -> ");
            String dueDateOfTheTask = input.nextLine();
            Task newTask = new Task(taskName, taskDescription, dueDateOfTheTask);
        } else if (option == 2) {
            System.out.println("Insert the Task's title -> ");
            String taskTitle = input.nextLine();
            taskManager.removeTask(taskTitle);
        } else if (option == 3) {
            taskManager.displayAllTasks();
        } else if (option == 4){
            taskManager.displayOverdueTasks();
        }


    }
}











