/** JAVA LEWIS & LOFTUS EX 7.5
*  @author mertsaner
* I will add many objects to this class, like I did on my to-do-list
* For instance, shopping items, laundry, washing dishes, programming,
* working for ZIB, writing report for SNET, cleaning the room, preparing the dinner
* Going out, sunbathing, go to gym, go for a walk
* The program will priorities this list according my needs and then print the final prioritized list
* */
public class Task implements Priority{  //Task class represents to-do-list

    private String taskName;
    private int taskPriority;
    private String description;

    //Constructor, that will initialize variables for Task class
    //Each task should have its name as well as priority weight
    public Task (String taskName, int taskPriority){
        this.taskName = taskName;
        this.taskPriority =taskPriority;
    }

    public void setTaskPriority(int taskPriority) { //important to assign task priority
        this.taskPriority = taskPriority;
    }

    public void setTaskName(String taskName) { //optional set to change task name
        this.taskName = taskName;
    }

    public int getTaskPriority() {
        return taskPriority;
    }

    public String getTaskName() {
        return taskName;
    }

    public String toString() {
        String result = "Item: " + taskName + ", Priority(lower is higher priority): " + Integer.toString(taskPriority);
        return result;
    }
}
