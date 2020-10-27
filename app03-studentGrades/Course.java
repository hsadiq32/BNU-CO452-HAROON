
/**
 * Write a description of class Course here.
 *
 * @author Haroon Sadiq
 * @version 20/10/2020
 */
import java.util.*;  
public class Course
{
    // instance variables - replace the example below with your own
    public String courseName;
    
    public int overallMark;
    
    public int capacity;
    
    public int capacityCounter;
    
    public int credits;
    
    public int percentage;
    
    public String grade;
    
    public Module module;
    
    public Module getTitle;
    
    public ArrayList<Module> moduleArray;
    
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

    public void addModule(Module module)
    {
        if(capacityCounter < capacity)
        {
            this.module = module;
            capacityCounter = capacityCounter + 1;
            credits = credits + 15;
            overallMark = overallMark + module.getMark();
            moduleArray.add(module);
            System.out.println(overallMark);
        }
        else
        {
            System.out.println("hh");
        }
    }
    
    public void printFinalGrade()
    {
        if(capacityCounter == capacity)
        {
            System.out.println("yes");
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
            System.out.println("");
        }
    }
}
