
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Haroon Sadiq
 * @version 0.1
 */
public class StockApp
{
    // Use to get user input
    private InputReader reader;
    
    private StockManager manager;
    
    private Product product;
    
    private StockDemo oldStock;
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        reader = new InputReader();
        manager = new StockManager();
        oldStock = new StockDemo(manager);
    }

    /**
     * 
     */
    public void run()
    {
        printHeading();
        getMenuChoice();
    }
    
    /**
     * 
     */
    public void getMenuChoice()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
           
            String choice = reader.getInput().toLowerCase();
            if(choice.equals("quit"))
            {
                finished = true;
            }
            
            else
            {
                executeMenuChoice(choice);
            }
        }
    }
    
    private void executeMenuChoice(String choice)
    {
        if(choice.equals("add"))
        {
            addProduct();
        }
        else if(choice.equals("remove"))
        {
            System.out.println("/nEnter ID\n");
            int id = Integer.parseInt(reader.getInput());
            removeProduct(id);
        }
        else if(choice.equals("printall"))
        {
            printAllProducts();
        }
        
    }
    
    private void addProduct()
    {
        System.out.println("/nAdd new Product:\n");
        
        System.out.println("/nID:\n");
        String value = reader.getInput();
        int id = Integer.parseInt(value);
        
        System.out.println("/nName:\n");
        String name = reader.getInput();
        
        Product product = new Product(id, name);
        System.out.println("Added:" + product);
        manager.addProduct(product);
    }
    
    private void removeProduct(int id)
    {
        manager.removeProduct(id);
    }
    
    private void printAllProducts()
    {
        manager.printAllProducts();
    }
   
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    PrintAll:   Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: by Haroon Sadiq");
        System.out.println("******************************");
    }
}
