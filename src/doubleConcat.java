/**
 * Exercise 7.4 from Lewis/Loftus Book
 * Author: Mert Saner
 */

public class doubleConcat {


    private static int count = 0;
    public static void main(String[] args) {

        System.out.println(doubleConcat("hello", 1));
        System.out.println("Repetition number: " + count);

    }

    /**
     * Takes a String and integer as a input
     * doubleConcat method return a string that consist of string parameter concanated with itself twice number(int) times
     * Ex; "hello" and 1 will print "hellohello"
     */
    public static String doubleConcat (String String1 , int int1){
        String result = "";

        if (int1 < 1) {       //Return the original string if the integer parameter is less than 1
            count = 1;
            return String1;
        }

        else
        {
            for (int i = 0; i < 2 * int1; i++) {
                result = result + String1;
                count++;
            }
            return result;
        }
    }
}