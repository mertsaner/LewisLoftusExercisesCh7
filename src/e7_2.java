//************************************************************
//  Student.java        Author: Lewis/Loftus
//
//  Represents a college student.
//************************************************************

class Student
{
    private String firstName, lastName;
    private Address homeAddress, schoolAddress;
    private double testScore1, testScore2, testScore3;

    //-------------------------------------------------------------
    // Constructor: Sets up this student with the specified values.
    //-------------------------------------------------------------
    public Student(String first, String last, Address home, Address school, double testScore1, double testScore2, double testScore3) {

        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        this.testScore1 = testScore1;
        this.testScore2 = testScore2;
        this.testScore3 = testScore3;
    }

    public Student(double testScore1, double testScore2, double testScore3) {

        this.testScore1 = 0;
        this.testScore2 = 0;
        this.testScore3 = 0;
    }

    //------------------------------------------------------------------
    // Returns a string representation of this Student object.
    //------------------------------------------------------------------
    public String toString()
    {
        String result;

        result = firstName + " " + lastName + "\n";
        result = result + "Home Address:\n" + homeAddress + "\n";
        result = result + "School Address:\n" + schoolAddress;
        result = result + "TestScore1: " + testScore1 + "TestScore2: " + testScore2 + "TestScore3: " + testScore3;
        return result;
    }
}