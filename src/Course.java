import java.util.ArrayList;

/**
 *  Represents a course taken at a school
 *
 * @Author MERT SANER
 */

public class Course {

    private String courseName;
    ArrayList<modifiedStudent> studentsParticipate = new ArrayList<modifiedStudent>();

    //studentsParticipate.add(mert);
    /**
     *  Constructor of the Course class which only accept the name of the course
     *  @return nothing
     */

    public Course(String courseName){
        this.courseName = courseName;
    }

    /**
     * Add student to the current class
     * @param student
     * @return void
     */
    public void addStudent(modifiedStudent student){
        studentsParticipate.add(student);
    }

    /**
     * Compute and returns the average of all student's test score averages
     * @param
     * @return void
     */
    public double average(){
        modifiedStudent john = new modifiedStudent("John", "Smith", 23, 32, 23); //First New student Object Created
        modifiedStudent marsha = new modifiedStudent("Marsha", "Jones", 70, 68, 74); //Second New student Object Created
        modifiedStudent mert = new modifiedStudent("Mert", "Saner",  100, 100, 96); //Third New student Object Created


        double johnAverage = john.testScoreAverage();
        double marshaAverage = marsha.testScoreAverage();
        double mertAverage = mert.testScoreAverage();

        double allAverage = (johnAverage + marshaAverage + mertAverage) / 3;
        return allAverage;
    }

    /**
     * Prints all students in the course
     * @param
     * @return result
     */
    public String roll() {
        String result = "Course Name: " + courseName + ", Participants: " + studentsParticipate;
        result = result + ", AllAverage: " + average();

        return result;
    }
}