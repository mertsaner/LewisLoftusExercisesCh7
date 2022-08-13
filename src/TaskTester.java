import java.util.Date;
import java.util.Arrays;
/** For instance, shopping items, laundry, washing dishes, programming,
        * Going out, sunbathing, go to gym, go for a walk
        * The program will priorities this list according my needs and then print the final prioritized list
*/
 public class TaskTester {
    public static void main (String[] args ){       //DRIVER CLASS OF TASK CLASS

        Task Edeka = new Task("Shopping in Edeka", 3, 0);
        Task Laundry = new Task("Laundry", 7, 0);
        Task ZIB = new Task("Working for ZIB", 2, 5);
        Task Gym = new Task("Going to Gym", 4, 1);
        Task Java = new Task("Studying Java", 1, 8);
        Task Sunbathing = new Task("Sunbathing", 5, 0);

        Date d = new Date();
        System.out.println(Edeka);
        System.out.println(Laundry);
        System.out.println(ZIB);
        System.out.println(Gym);
        System.out.println(Java);
        System.out.println(Sunbathing);

        String dayString = "";
        for (int i=0 ; i < 3 ; i++){
            dayString = dayString + d.toString().charAt(i);   //Fill Mystring with the Week of the day
        }
        //System.out.println(myString);

      //  Task taskPriority = new taskPriority();

        // object1.someMethod();       //Called the method of the another class by creating its object

        switch (dayString) {        //Task.taskPriority
            case "Mon":
                //Make it in a way that the item which has priority 1 will be replaced to 2 second each priority will be step below
                ZIB.setTaskPriority(1);
                break;
            case "Tue":
                break;
            case "Wed":
                break;
            case "Thu":
                break;
            case "Fri":
                ZIB.setTaskPriority(1);
                break;
            case "Sat":
                break;
            case "Sun":
                System.out.println("Entered!");
//                for (int i = 1; i < 10 ; i++){
//                        if(Task.taskPriority == 1)
//                        {}
//                }
                ZIB.setTaskPriority(1);
                break;
            default:
                dayString = "Invalid day";
                break;
        }

        System.out.println("ZIB task has changed, it is urgent now and includes MIP optimization");
        ZIB.setTaskPriority(1);
        ZIB.setComplexityLevel(9);

        System.out.println("===================================");
        System.out.println("ZIB task has changed, it is urgent now and includes MIP optimization");
        System.out.println("NEW RESULTS!");
        System.out.println("===================================");
        //Print Again
        System.out.println(Edeka);
        System.out.println(Laundry);
        System.out.println(ZIB);
        System.out.println(Gym);
        System.out.println(Java);
        System.out.println(Sunbathing);

    }
}