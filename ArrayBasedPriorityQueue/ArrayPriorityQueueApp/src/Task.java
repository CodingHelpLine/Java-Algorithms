
/**
 * The <code>Task</code> class that will encapsulates Task information: 
 * Name and Priority. 
 *
 * @author CodingHelpLine
 * Web: https://codinghelpline.org 
 */
public class Task {

    // name of task
    private String taskName; 
    
    // Priority
    private int priority; // 0, 1, 2, 3, 4, 5 etc 
    
    /**
     * Default Constructor to initialize the Objects of Task class with
     * default values. 
     * 
     * @param taskName of the task
     * @param priority of the task
     */
    public Task(String taskName, int priority) {
        this.taskName = taskName;
        this.priority = priority;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
    
    @Override
    public String toString() {
        return String.format("(Name: %s, Priority: %d)", taskName, priority); 
    }
}
