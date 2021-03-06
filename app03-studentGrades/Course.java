
/**
 * The Course class holds the pack of module details, and works out the overall finalGrade
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
    public int finalMark;
    // The max capacity of modules in the course
    public int capacity;
    // The keeps track of capacity to ensure no errors occur
    public int capacityCounter;
    // The amount of credits the student earns
    public int credits;
    // The overall percentage
    public int percentage;
    // The overall finalGrade
    public String finalGrade;
    // Links module dependencies
    public Module module;
    // Links the module getTitle function
    public Module getTitle;
    // Uses an array to store the module data
    public ArrayList<Module> moduleArray;
    
    // Declares module variables
    private Module m1;
    private Module m2;
    private Module m3;
    private Module m4;
    
    
    /**
     * Create a new Course with added functionality of modifying the max module capacity
     */
    public Course(String courseName, int NumberOfModules)
    {
        this.courseName = courseName;
        capacity = NumberOfModules;
        capacityCounter = 0;
        this.finalMark = 0;
        this.finalGrade = "Pending";
        moduleArray = new ArrayList<Module>();
        createModules();
    }
    
    /**
     * Creates 4 new modules, assigned to the given variables
     */
    public void createModules()
    {
        m1 = new Module("Algorithms", "C1");
        m2 = new Module("Programming", "C2");
        m3 = new Module("Computer Systems", "C3");
        m4 = new Module("Computer Networks", "C4");
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
            finalMark = finalMark + module.getMark();
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
     * Detects if all modules are added to capacity then works out finalGrade and grabs module data to stitch together and print
     */
    public void printFinalfinalGrade()
    {
        if(capacityCounter == capacity)
        {
            percentage = finalMark/capacity;
            if(percentage <= 39)
            {
                finalGrade = "F";
            }
            else if(percentage <= 49)
            {
                finalGrade = "D";
            }
            else if(percentage <= 59)
            {
                finalGrade = "C";
            }
            else if(percentage <= 69)
            {
                finalGrade = "B";
            }
            else if(percentage <= 100)
            {
                finalGrade = "A";
            }
            else
            {
                finalGrade = "Ungradable";
            }
            System.out.println("││┌──────────────────────┐");
            System.out.println("││■ Course: " + courseName);
            System.out.println("││└─┬────────────────────┘");
            System.out.println("││  │ finalGrade: " + finalGrade);
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
