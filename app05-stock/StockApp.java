
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
        else if(choice.equals("deliver"))
        {
            int id = Integer.parseInt(reader.getInput());
            int quantity = Integer.parseInt(reader.getInput());
            manager.deliverProduct(id, quantity);
        }
        else if(choice.equals("sell"))
        {
            int id = Integer.parseInt(reader.getInput());
            int quantity = Integer.parseInt(reader.getInput());
            manager.sellProduct(id, quantity);
        }
        else if(choice.equals("search"))
        {
            String search = reader.getInput();
            manager.findProduct(search);
        }
        else if(choice.equals("lowstock"))
        {
            manager.lowStockFinder();
        }
        else if(choice.equals("restock"))
        {
            manager.restockProducts();
        }
    }
    
    private void addProduct()
    {
        System.out.println("/nAdd new Product:\n");
        System.out.println("Enter ID\n");
        int id = Integer.parseInt(reader.getInput());
        System.out.println("Enter Name\n");
        String name = reader.getInput();
        manager.addProduct(id, name);
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
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove a product");
        System.out.println("    PrintAll:   Print all products");
        System.out.println("    Deliver:    Deliver a product");
        System.out.println("    Sell:       Sell a product");
        System.out.println("    Search:     Search for a product");
        System.out.println("    LowStock:   Find products with low stock");
        System.out.println("    ReStock:    Restocks low-stock products");
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
