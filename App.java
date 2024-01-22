import java.util.LinkedList;
import java.util.Scanner;
import java.util.Calendar;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        LinkedList<Task> tasks = new LinkedList<Task>();
        // loop
        Calendar dueDate1 = Calendar.getInstance();
        Calendar dueDate2 = Calendar.getInstance();
        dueDate1.set(2024, 02, 01);
        dueDate2.set(2023, 9, 20);
        
        tasks.add(new Task("Bug fix", "Fix bug at line 1700", dueDate1));
        tasks.add(new Task("Add feature", "Add chat with support", dueDate2));
        
        do {
            System.out.println("press a to add a task or d to display all tasks or r to remove a task or e to exit");
            String userString = input.nextLine();
            // add task
            if (userString.equalsIgnoreCase("a")) {
                System.out.println("add title");
                String title = input.nextLine();

                System.out.println("add description");
                String description = input.nextLine();

                System.out.println("add due year");
                int dueYear = input.nextInt();
                System.out.println("add due month");
                int dueMonth = input.nextInt();
                System.out.println("input due day");
                int dueDay = input.nextInt();

                Calendar dueDate3 = Calendar.getInstance();
                dueDate3.set(dueYear, dueMonth, dueDay);
                tasks.add(new Task(title, description, dueDate3));

                System.out.println("the task has been added");
            }
            // display all
            else if (userString.equalsIgnoreCase("d")) {
                Calendar currentDate = Calendar.getInstance();
                currentDate.get(Calendar.YEAR); 
                currentDate.get(Calendar.MONTH + 1);
                currentDate.get(Calendar.DATE);
                for(int i = 0; i < tasks.size(); i++) {
                    tasks.get(i).printAllInfo();
                    // overdue tasks
                    if (tasks.get(i).getDate().before(currentDate)) {
                        System.out.println("The task with id: " + tasks.get(i).getId() + " is overdue");
                    }
                }
            }
            // exit
            else if (userString.equalsIgnoreCase("e")) {
                break;
            }
            // remove task
            else if (userString.equalsIgnoreCase("r")) {
                System.out.println("input the id of the task that you want to remove");
                int userId = input.nextInt();
                for(int i = 0; i < tasks.size(); i++) {
                    if (userId == tasks.get(i).getId()) {
                        tasks.remove(i);
                        System.out.println("the task has been removed");
                        break;
                    }
                    else if (i == tasks.size() - 1) {
                        System.out.println("no such id exists");
                    }
                }                    
            }
        } while(true);
    }
    public static void addTaskInfo(Scanner input) {

    }
}
class Task {
    private int id;
    private String title, description;
    private Calendar dueDate;
    private static int nextId = 2500;
    public Task(String title, String description, Calendar dueDate) {
        this.title = title; 
        this.description = description;
        this.dueDate = dueDate;
        this.id = nextId;
        nextId++;
    }
    public void printAllInfo() {
        System.out.println("title: "+ this.title + "\ndescription: " + this.description + "\ndue date: " + this.dueDate.get(this.dueDate.YEAR) + "/"+ this.dueDate.get(this.dueDate.MONTH) + "/" + this.dueDate.get(this.dueDate.DATE) + "\nid: " + this.id);
    }
    public int getId() {
        return id;
    }
    public Calendar getDate() {
        return dueDate;
    }
}