//*********************************************************************
//  StudentBody.java        Author: Lewis/Loftus
//
//  Demonstrates the use of an aggregate class.
//*********************************************************************

public class StudentBody
{
    //-----------------------------------------------------------------
    //  Creates some Address and Student objects and prints them.
    //-----------------------------------------------------------------
    public static void main (String [] args)
    {
        Address school = new Address("800 Lancaster Ave.", "Villanova", "PA", 19085);
        Address school2 = new Address(" Straße des 17. Juni 135", "Berlin", "BE", 10623);

        Address jHome = new Address("21 Jump Street", "Blacksburg", "VA", 24551);

        Student john = new Student("John", "Smith", jHome, school, 23, 32, 23); //First New student Object Created

        Address mHome = new Address("123 Main Street", "Euclid", "OH", 44132);
        Address mHome2 = new Address("Kreuzberg", "Berlin", "BE", 10965);


        Student marsha = new Student("Marsha", "Jones", mHome, school, 70, 68, 74); //Second New student Object Created

        Student mert = new Student("Mert", "Saner", mHome2, school2,  100, 100, 96); //Third New student Object Created

        System.out.println(john);
        System.out.println();
        System.out.println(marsha);
        System.out.println();
        System.out.println(mert);

    }
}