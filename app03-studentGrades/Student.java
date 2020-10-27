/**
 * The Student class represents a student in a student administration system.
 * It holds the student details relevant in our context.
 * 
 * @author Michael Kölling and David Barnes
 * @version 2016.02.29
 * @modified by Haroon Sadiq
 */
import java.util.*;
public class Student
{
    // the student's full name
    private String name;
    // the student ID
    private String id;
    // the amount of credits for study taken so far
    private int credits;
    //Links course dependencies
    public Course course;
    /**
     * Create a new student with a given name and ID number.
     */
    public Student(String fullName, String studentID)
    {
        name = fullName;
        id = studentID;
    }
    
    /**
     * Enrolls a Student to the given course
     */
    public void enrollStudent(Course course)
    {
        this.course = course;
    }
    
     /**
     * Prints their name and ID then their course, overall grade, overall percentage, credits, and finally their results for each module
     */
    public void printResults()
    {
        System.out.println("┌────────────────────────┐");
        System.out.println("│▌                           │");
        System.out.println("│▌ Name: " + name);
        System.out.println("│▌ ID : " + id);
        System.out.println("│▌                           │");
        System.out.println("├────────────────────────┘");
        course.printFinalGrade();
    }

    /**
     * Return the full name of this student.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Set a new name for this student.
     */
    public void changeName(String replacementName)
    {
        name = replacementName;
    }

    /**
     * Return the student ID of this student.
     */
    public String getStudentID()
    {
        return id;
    }

    /**
     * Add some credit points to the student's accumulated credits.
     */
    public void addCredits(int additionalPoints)
    {
        credits += additionalPoints;
    }

    
    /**
     * Return the number of credit points this student has accumulated.
     */
    public int getCredits()
    {
        return credits;
    }

    /**
     * Return the login name of this student. The login name is a combination
     * of the first four characters of the student's name and the first three
     * characters of the student's ID number.
     */
    public String getLoginName()
    {
        return name.substring(0,4) + id.substring(0,3);
    }
    
    /**
     * Print the student's name and ID number to the output terminal.
     */
    public void print()
    {
        System.out.println(name + ", student ID: " + id + ", credits: " + credits);
    }
}
