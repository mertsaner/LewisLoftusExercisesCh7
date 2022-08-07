import java.util.Date;
/** For instance, shopping items, laundry, washing dishes, programming,
        * Going out, sunbathing, go to gym, go for a walk
        * The program will priorities this list according my needs and then print the final prioritized list
*/
 public class TaskTester {
    public static void main (String[] args ){       //DRIVER CLASS OF TASK CLASS

        Task Edeka = new Task("Shopping in Edeka", 3);
        Task Laundry = new Task("Laundry", 7);
        Task ZIB = new Task("Working for ZIB", 2);
        Task Gym = new Task("Going to Gym", 4);
        Task Java = new Task("Studying Java", 1);
        Task Sunbathing = new Task("Sunbathing", 5);

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

        System.out.println(Edeka.taskPriority);

        switch (dayString) {        //Task.taskPriority
            case "Mon":
                //Make it in a way that the item which has priotry 1 will be replaced to 2 second each prioty will be step below
                ZIB.setTaskPriority(1);
                break;
            case "Tue":
                break;
            case "Wed":
                break;
            case "Thu":
                ZIB.setTaskPriority(1);
                break;
            case "Fri":
                break;
            case "Sat":
                break;
            case "Sun":
                ZIB.setTaskPriority(1);
                break;
            default:
                dayString = "Invalid day";
                break;
        }

        System.out.println("===================================");
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