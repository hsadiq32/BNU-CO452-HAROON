
/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Course
{
    // instance variables - replace the example below with your own
    public String courseName;
    
    public int overallMark;
    
    public int capacity;
    
    public int capacityCounter;
    
    public int credits;
    
    public Module module;
    
    public Course(String courseName, int NumberOfModules)
    {
        this.courseName = courseName;
        capacity = NumberOfModules;
        capacityCounter = 0;
        credits = 0;
        overallMark = 0;
    }

    public void addModule(Module module)
    {
        if(capacityCounter < capacity)
        {
            this.module = module;
            capacityCounter = capacityCounter + 1;
            credits = credits + 15;
            overallMark = overallMark + module.getMark();
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
        }
        else
        {
            System.out.println("");
        }
    }
}
