//*********************************************************************
//  StudentBody.java        Author: Lewis/Loftus
//
//  Demonstrates the use of an aggregate class.
//*********************************************************************

public class modifiedStudentBody
{
    //-----------------------------------------------------------------
    //  Creates some Address and Student objects and prints them.
    //-----------------------------------------------------------------
    public static void main (String[] args)
    {
        Course math = new Course();
        Course physics = new Course();
        Course geometry = new Course();

        modifiedStudent john = new modifiedStudent("John", "Smith", 23, 32, 23); //First New student Object Created
        modifiedStudent marsha = new modifiedStudent("Marsha", "Jones", 70, 68, 74); //Second New student Object Created
        modifiedStudent mert = new modifiedStudent("Mert", "Saner",  100, 100, 96); //Third New student Object Created

        System.out.println(john);
        System.out.println();
        System.out.println(marsha);
        System.out.println();
        System.out.println(mert);
    }
}