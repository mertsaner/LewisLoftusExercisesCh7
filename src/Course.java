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
     * @param student
     * @return void
     */
    public double average(modifiedStudent student){
        double allAverage = student.testScoreAverage();  //finds testScore Average per student
        return allAverage;
    }


    /**
     * Prints all students in the course
     * @param
     * @return result
     */
    public String roll() {
        // String participants = studentsParticipate

        for (int i = 0; i < studentsParticipate.size(); i++) {
            studentsParticipate = studentsParticipate.get(i);
            String result = "Course Name: " + courseName + ", Participants: " + studentsParticipate; // + studentsParticipate
            return result;
        }
        return "";
    }
}