package van_java.homeworkFifteen;

import java.time.LocalDate;
import java.util.Locale;

//have a title, a description, and a due date.
public class Task {
    private Task(String title,String description,LocalDate dueDate){
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
    }
    private final String title;
    private final String description;
    private final LocalDate dueDate;

    public String getTitle() {
        return title;
    }
    public String getDescription(){
        return this.description;
    }
    public LocalDate getDueDate(){
        return this.dueDate;
    }

    public boolean isOverDue() {
        return LocalDate.now().isAfter(dueDate);
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\n' +
                ", description='" + description + '\n' +
                ", dueDate=" + dueDate +
                '}' + '\n';
    }
}
