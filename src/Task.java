/** JAVA LEWIS & LOFTUS EX 7.5
*  @author mertsaner
* I will add many objects to this class, like I did on my to-do-list
* */
public class Task implements Priority{
   // public static int taskPriority;  //Task class represents to-do-list, not possible to use
   // since it changes all instances of the class

    private String taskName;
    private int complexityLevel;
    public int taskPriority;

    //We commented this and defined taskPriority as Static to use it in static class(main), but it didn't worked out since;
    //Static variables are shared across instances of the class. When edited, they change for all instances
    private String description;

    //Constructor, that will initialize variables for Task class
    //Each task should have its name as well as priority weight
    public Task (String taskName, int taskPriority, int complexityLevel){
        this.taskName = taskName;
        this.taskPriority = taskPriority;
        this.complexityLevel = complexityLevel;
    }
    //====
    //Complexity Interface Accessors and Mutators
    public int getComplexityLevel() {return complexityLevel;}
    public void setComplexityLevel(int complexityLevel){
        this.complexityLevel = complexityLevel;
    }
    //====
    //TaskPriority Accessors and Mutators
    public int getTaskPriority() {
        return taskPriority;
    }
    public void setTaskPriority(int taskPriority) { //important to assign task priority
        this.taskPriority = taskPriority;
    }
    //====
    //TaskName Accessors and Mutators
    public void setTaskName(String taskName) { //optional setter method to change task name
        this.taskName = taskName;
    }
    public String getTaskName() {return taskName;}
    //====

    public String toString() {
        String result = "Item: " + taskName + ", Priority(lower is higher priority): " + Integer.toString(taskPriority)
                + ", ComplexityLevel: " + getComplexityLevel()  ;
        return result;
    }
}