/**
 * Exercise 7_2
 *
 * @author Mert Saner
 */

class Student
{
    private String firstName, lastName;
    private Address homeAddress, schoolAddress;
    private double testScore1, testScore2, testScore3, testScoreAverage;

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
        this.testScoreAverage = testScoreAverage;
    }

    public Student(String first, String last, Address home, Address school) {

        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
    }


    /**
     * Accept two parameters: the test number (1 through 3) and the score.
     * @param testScore   testNumber
     * @return setMethod(mutator) returns void
     */

    public void setTestScore (double testScore, int testNumber) {
        if (testNumber == 1){
            testScore1 = testScore;
        }
        if (testNumber == 2){
            testScore2 = testScore;
        }
        if (testNumber == 3){
            testScore3 = testScore;
        }
    }


    /**
     * Accepts the test number
     * @param testNumber
     * @return getMethod(Accessor) returns appropriate score
     */

    public double getTestScore (int testNumber) {
        if (testNumber == 1){
            return testScore1;
        }
        if (testNumber == 2){
            return testScore2;
        }
        if (testNumber == 3){
            return testScore3;
        }
       return 0;
    }

    /**
     * Compute average test score
     * @return average test score of the student
     */

    public double average () {
        double average = (this.testScore1 + this.testScore2 + this.testScore3)/3;
        return average;
    }

    //------------------------------------------------------------------
    // Returns a string representation of this Student object.
    // Modified to show TestScores of the Students
    //------------------------------------------------------------------
    public String toString()
    {
        String result;

        result = firstName + " " + lastName + "\n";
        result = result + "Home Address:\n" + homeAddress + "\n";
        result = result + "School Address:\n" + schoolAddress + "\n";
        result = result + "TestScore1: " + testScore1 + ", TestScore2: " + testScore2 + ", TestScore3: " + testScore3 + "\n";
        result = result + "Average of all exams: " + average();
        return result;
    }
}