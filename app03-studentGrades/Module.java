
/**
 * Stores the data required for a module
 *
 * @author Haroon Sadiq
 * @version 20/10/2020
 */

public class Module
{
    // The title of the module
    public String title;
    // The module ID
    public String moduleCode;
    // The module mark
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

    /**
     * Prints module data
     */
    public void print()
    {
        System.out.println("│││┌─────────────────────┐");
        System.out.println("│││■ Module:" + title);
        System.out.println("│││└─┬───────────────────┘");
        System.out.println("│││  │ Module ID:"+ moduleCode);
        System.out.println("│││  │ Mark: " + mark + "/100");
        System.out.println("│││  └──────────────────┘");
    }

    /**
     * Returns the title of the module
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Returns the ID of the module
     */
    public String getmoduleCode()
    {
        return moduleCode;
    }
    
    /**
     * Returns the mark of the module
     */
    public int getMark()
    {
        return mark;
    }
}
