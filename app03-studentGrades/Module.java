
/**
 * Write a description of class Module here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Module
{
    // instance variables - replace the example below with your own
    public String title;
    
    public String moduleCode;
    
    public int mark;

    /**
     * Constructor for objects of class Module
     */
    public Module(String title,String moduleCode, int mark)
    {
        this.title = title;
        this.moduleCode = moduleCode;
        this.mark = mark;
    }

    public void printModule()
    {
        System.out.println("│││┌─────────────────────┐");
        System.out.println("│││■ Module:" + title);
        System.out.println("│││└─┬───────────────────┘");
        System.out.println("│││  │ Module ID:"+ moduleCode);
        System.out.println("│││  │ Mark: " + mark + "/100");
        System.out.println("│││  └──────────────────┘");
    }

    public String getTitle()
    {
        return title;
    }
    
    public String getmoduleCode()
    {
        return moduleCode;
    }
    
    public int getMark()
    {
        return mark;
    }
}
