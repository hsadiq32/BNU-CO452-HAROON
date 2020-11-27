
/**
 * Write a description of class Menu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Menu
{
    private static InputReader reader = new InputReader();
    
    /**
     * Outputs programmed choices 
     */
    public static String getMenuChoice(String [] choices)
    {
        boolean finished = false;
        String choice = null;
        
        while(!finished)
        {
            printChoices(choices);
            choice = reader.getInput().toLowerCase();
            
            
            finished = checkIfValid(choices, choice);
            
            if(!finished)
            {
                System.out.println(" Invalid choice");
            }    
        }
        
        return choice;
    }
    
    private static boolean checkIfValid(String [] choices, String choice)
    { 
        for(String validChoice : choices)
        {
            validChoice = validChoice.toLowerCase();
            if(validChoice.startsWith(choice))
                return true;
        }
        return false;
    }
    
    private static void printChoices(String [] choices)
    {
        System.out.println("Enter the first word, your choices are: \n");
        for(String choice: choices)
        {
            System.out.println("   " + choice);
        }
    }
}
