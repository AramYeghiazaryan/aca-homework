package van_java.homeworkFifteen;

import java.util.LinkedList;

public class Tasks {

    public Tasks() {
        this.tasks = new LinkedList<>();
    }

    private final LinkedList<Task> tasks;

    private void add(Task task) {
        tasks.add(task);
    }

    private void displayAll() {
        for (Task t : tasks) {
            System.out.println(t.toString());
        }
    }

    private void remove(Task task) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getDescription().equals(task.getDescription())
                    && tasks.get(i).getTitle().equals(task.getTitle())
                    && tasks.get(i).getDueDate().equals(task.getDueDate())) {
                tasks.remove(task);
                break;
            }
        }
    }

    private void displayOverDueTasks() {
        for (Task t : tasks) {
            if (t.isOverDue()) {
                System.out.println(t.toString());
            }
        }
    }
}
