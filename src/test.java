// Java Program to add elements to List

// Importing ArrayList class from
// java.util package
import java.util.ArrayList;

/**
*   Creating an Arraylist that stores student objects
*
* @Author: Mert Saner
 * */

// Class
public class test {

    // Main driver method
    public static void main(String[] args)
    {
        // Creating an ArrayList object
        // (Declaring List of String type)
        ArrayList<modifiedStudent> names = new ArrayList<modifiedStudent>();

        modifiedStudent john = new modifiedStudent("John", "Smith", 23, 32, 23); //First New student Object Created
        modifiedStudent marsha = new modifiedStudent("Marsha", "Jones", 70, 68, 74); //Second New student Object Created
        modifiedStudent mert = new modifiedStudent("Mert", "Saner",  100, 100, 96); //Third New student Object Created

        // Adding (appending) elements to List
        // Custom inputs using add() method
        names.add(mert);
        names.add(marsha);
        names.add(john);


//        names.add("Computer");
//        names.add("Science");
//        names.add("Portal");

        // Printing all the elements of ArrayList
        // Declaring generic ArrayList of String type

        //names

        //System.out.print(myString);


        for (int i = 0; i < names.size(); i++){
            modifiedStudent myString = names.get(i);
        System.out.print(myString);
    }

    }
}