
/**
 * The Course class will be used to contain a code number and a title, e.g. G400, Computing..
 *
 * @author Haroon Sadiq
 * @version 07/10/2020
 */
public class Course
{
    // The course code
    private String course_number;
    // The title for the course
    private String course_title;
    /**
     * Constructor for creating objects of class Course
     */
    public Course(String course_number,String course_title)
    {
        this.course_number = course_number;
        this.course_title = course_title;
    }
    
    /**
     * Prints out course_title and course_number to the IDE interface
     */
    public void print ()
    {
        System.out.println("Course: " + course_number + ", " + course_title);
    }
    
}
