import java.util.ArrayList;
import java.util.function.IntFunction;

/**
 * Exercise 7_2
 *  Uses an Arraylist in the Course to store students taking that course
 * @author Mert Saner
 */

class modifiedStudent extends ArrayList<modifiedStudent> {
    private String firstName, lastName;
    private double testScore1, testScore2, testScore3, testScoreAverage;

    //-------------------------------------------------------------
    // Constructor: Sets up this student with the specified values.
    //-------------------------------------------------------------
    public modifiedStudent(String first, String last, double testScore1, double testScore2, double testScore3) {
        firstName = first;
        lastName = last;
        this.testScore1 = testScore1;
        this.testScore2 = testScore2;
        this.testScore3 = testScore3;
    }

  /**
     * Accept two parameters: the test number (1 through 3) and the score.
     *
     * @param testScore testNumber
     * @return setMethod(mutator) returns void
     */
    public void setTestScore(double testScore, int testNumber) {
        if (testNumber == 1) {
            testScore1 = testScore;
        }
        if (testNumber == 2) {
            testScore2 = testScore;
        }
        if (testNumber == 3) {
            testScore3 = testScore;
        }
    }

    public double getTestScore(int testNumber) {
        if (testNumber == 1) {
            return testScore1;
        }
        if (testNumber == 2) {
            return testScore2;
        }
        if (testNumber == 3) {
            return testScore3;
        }
        return 0;
    }

    /**
     * Compute average test score
     *
     * @return average test score of the student
     */
    public double testScoreAverage() {
        double average = (this.testScore1 + this.testScore2 + this.testScore3) / 3;
        return average;
    }

    //------------------------------------------------------------------
    // Returns a string representation of this Student object.
    // Modified to show TestScores of the Students
    //------------------------------------------------------------------
    public String toString() {
        String result;
        result = firstName + " " + lastName + "\n";
        result = result + "TestScore1: " + testScore1 + ", TestScore2: " + testScore2 + ", TestScore3: " + testScore3 + "\n";
        result = result + "Average of all exams: " + testScoreAverage();
        return result;
    }
}