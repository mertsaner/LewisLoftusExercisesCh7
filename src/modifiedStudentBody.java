//*********************************************************************
//  StudentBody.java        Author: Lewis/Loftus
//
//  Demonstrates the use of an aggregate class.
//*********************************************************************

public class modifiedStudentBody    //DRIVER CLASS which consists of main method
{
    //-----------------------------------------------------------------
    //  DRIVER CLASS
    //  Creates a course, adds several students, prints a roll, and prints
    //  the overall course test average.
    //-----------------------------------------------------------------
    public static void main (String[] args)
    {
        Course math = new Course("math");
        Course geometry = new Course("geometry");
        Course history = new Course("history");

        modifiedStudent john = new modifiedStudent("John", "Smith", 23, 32, 23); //First New student Object Created
        modifiedStudent marsha = new modifiedStudent("Marsha", "Jones", 70, 68, 74); //Second New student Object Created
        modifiedStudent mert = new modifiedStudent("Mert", "Saner",  100, 100, 96); //Third New student Object Created

        math.addStudent(john);
        math.addStudent(mert);
        math.addStudent(marsha);

        history.addStudent(john);
        history.addStudent(marsha);
        geometry.addStudent(marsha);
        geometry.addStudent(mert);

       // math.average();
       // history.average();
       // geometry.average();
        System.out.println(math.roll());
        System.out.println();
        System.out.println(history.roll());
        System.out.println();
        System.out.println(geometry.roll());
    }
}