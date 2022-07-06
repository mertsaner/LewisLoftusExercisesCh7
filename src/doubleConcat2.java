/**
 * Exercise 7.4 from Lewis/Loftus Book
 * Author: Mert Saner
 */

public class doubleConcat2 {

    public static void main(String[] args) {

        System.out.println(doubleConcat("hi there, hello world"));
    }

    /**
     *  The method overloads earlier version
     *  It returns the string itself without concatenation.
     */
    public static String doubleConcat (String String1){
            return String1;
    }
}