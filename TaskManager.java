package Javie;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class TaskManager {
    public LinkedList<Task> tasks;
    public TaskManager() {
        this.tasks = new LinkedList<>();
    }

    public void taskAdd(Task task) {
        tasks.add(task);
    }

    public void displayAllTasks() {
        for (Task task : tasks) {
            System.out.println("Title: " + task.title);
            System.out.println("Description: " + task.description);
            System.out.println("Due Date: " + task.dueDate);
            System.out.println("----------------------------");
        }
    }

    public void removeTask(String title) {
        for(Task task : tasks){
            if(task.title.equals(title)){
                tasks.remove(task);
                break;
            }
        }
    }

    public void displayOverdueTasks() {
        for(Task task : tasks){
            if(task.dueDate.compareTo(LocalDateTime.now().toString())<0){
                System.out.println("Title -> " + task.title);
                System.out.println("Description -> " + task.description);
                System.out.println("Due date -> " + task.dueDate);
                System.out.println("--------------------------------");
            }
        }
    }
}











