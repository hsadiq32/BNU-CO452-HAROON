
/**
 * The Course class holds the pack of module details, and works out the overall grade
 *
 * @author Haroon Sadiq
 * @version 20/10/2020
 */
import java.util.*;  
public class Course
{
    // The course name
    public String courseName;
    // The overall mark of all modules
    public int overallMark;
    // The max capacity of modules in the course
    public int capacity;
    // The keeps track of capacity to ensure no errors occur
    public int capacityCounter;
    // The amount of credits the student earns
    public int credits;
    // The overall percentage
    public int percentage;
    // The overall grade
    public String grade;
    // Links module dependencies
    public Module module;
    // Links the module getTitle function
    public Module getTitle;
    // Uses an array to store the module data
    public ArrayList<Module> moduleArray;
    
    /**
     * Create a new Course with added functionality of modifying the max module capacity
     */
    public Course(String courseName, int NumberOfModules)
    {
        this.courseName = courseName;
        capacity = NumberOfModules;
        capacityCounter = 0;
        credits = 0;
        overallMark = 0;
        grade = "Pending";
        moduleArray = new ArrayList<Module>();
    }

    /**
     * Adds the entered module to the Course
     */
    public void addModule(Module module)
    {
        if(capacityCounter < capacity)
        {
            this.module = module;
            capacityCounter = capacityCounter + 1;
            credits = credits + 15;
            overallMark = overallMark + module.getMark();
            moduleArray.add(module);
            System.out.println(" ───────────────────");
            System.out.println(" Task Successful");
            System.out.println(" ───────────────────");
        }
        else if(capacityCounter >= capacity)
        {
            System.out.println(" ───────────────────");
            System.out.println("  Unable to add Module");
            System.out.println();
            System.out.println("  Max Course capacity");
            System.out.println("  reached");
            System.out.println(" ───────────────────");
        }
        else
        {
            System.out.println(" ───────────────────");
            System.out.println("  Unable to add Module");
            System.out.println();
            System.out.println("  Internal Error");
            System.out.println(" ───────────────────");
        }
    }
    
    /**
     * Detects if all modules are added to capacity then works out grade and grabs module data to stitch together and print
     */
    public void printFinalGrade()
    {
        if(capacityCounter == capacity)
        {
            percentage = overallMark/capacity;
            if(percentage <= 39)
            {
                grade = "F";
            }
            else if(percentage <= 49)
            {
                grade = "D";
            }
            else if(percentage <= 59)
            {
                grade = "C";
            }
            else if(percentage <= 69)
            {
                grade = "B";
            }
            else if(percentage <= 100)
            {
                grade = "A";
            }
            else
            {
                grade = "Ungradable";
            }
            System.out.println("││┌──────────────────────┐");
            System.out.println("││■ Course: " + courseName);
            System.out.println("││└─┬────────────────────┘");
            System.out.println("││  │ Grade: " + grade);
            System.out.println("││  │ Percentage: " + percentage + "%");
            System.out.println("││  │ Credits: " + credits);
            System.out.println("││  └───────────────────┘");
            for(Module module : moduleArray) 
            {
                module.print();
            }
        }
        else
        {
            System.out.println("││┌──────────────────────┐");
            System.out.println("││■ Course: " + courseName);
            System.out.println("││└─┬────────────────────┘");
            System.out.println("││  │ Error: No data");
            System.out.println("││  └───────────────────┘");
        }
    }
}
