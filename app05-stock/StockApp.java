
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Haroon Sadiq
 * @version 0.1
 */
public class StockApp extends StockDemo {
    //Stored menu choice options as variables
    public final String ADD = "add";
    public final String REMOVE = "remove";
    public final String RENAME = "rename";
    public final String PRINTALL = "print";
    public final String DELIVER = "deliver";
    public final String SELL = "sell";
    public final String SEARCH = "search";
    public final String FIND = "find";
    public final String RESTOCK = "restock";
    
    //Sets the array for menu choice
    private String [] menuChoices;
    
    // Use to get user input
    private InputReader reader;
    
    // Imports StockManager dependencies
    private StockManager manager;
    
    // Imports StockDemo dependencies
    private StockDemo oldStock;
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        reader = new InputReader();
        manager = new StockManager();
        oldStock = new StockDemo(manager);
        menuSetup();
    }
    
    /**
     * Contains a string array for the menu text
     */
    private void menuSetup()
    {
        menuChoices = new String []
        {
            "Add a new product",
            "Remove a product",
            "Rename a product",
            "Print all products",
            "Deliver a product",
            "Sell a product",
            "Search for a product",
            "Find low-stock products",
            "Restock low-stock products",
            "Quit the program"   
        };
    }

    /**
     * A function which initialises the menu and starts the program
     */
    public void run()
    {
        getMenuChoice();
    }
    
    /**
     * Interprets user input at menu to execute a given task
     */
    public void getMenuChoice()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            String choice = Menu.getMenuChoice(menuChoices);
            executeMenuChoice(choice);
            
            if(choice.startsWith("quit"))
            {
                finished = true;
            }
        }
    }
    
    /**
     * Uses given choice to execute task linking set variables
     */
    private void executeMenuChoice(String choice)
    {
        if(choice.equals(ADD))
        {
            addProduct();
        }
        else if(choice.equals(REMOVE))
        {
            System.out.println("|─| Enter ID:\n");
            int id = Integer.parseInt(reader.getInput());
            removeProduct(id);
        }
        else if(choice.equals(RENAME))
        {
            System.out.println("|R| Enter ID:\n");
            int id = Integer.parseInt(reader.getInput());
            System.out.println("|R| Enter New Name:\n");
            String newName = reader.getInput();
            renameProduct(id, newName);
        }
        else if(choice.equals(PRINTALL))
        {
            printAllProducts();
        }
        else if(choice.equals(DELIVER))
        {
            System.out.println("|🚐| Enter ID:\n");
            int id = Integer.parseInt(reader.getInput());
            System.out.println("|🚐| Enter Delivery Amount:\n");
            int quantity = Integer.parseInt(reader.getInput());
            manager.deliverProduct(id, quantity);
        }
        else if(choice.equals(SELL))
        {
            System.out.println("|£| Enter ID:\n");
            int id = Integer.parseInt(reader.getInput());
            System.out.println("|£| Enter Sell Quantity:\n");
            int quantity = Integer.parseInt(reader.getInput());
            manager.sellProduct(id, quantity);
        }
        else if(choice.equals(SEARCH))
        {
            System.out.println("|🔍| Search for:\n");
            String search = reader.getInput();
            manager.findProduct(search);
        }
        else if(choice.equals(FIND))
        {
            System.out.println("|∀| Max Quantity Filter:\n");
            int amount = Integer.parseInt(reader.getInput());
            manager.lowStockFinder(amount);
        }
        else if(choice.equals(RESTOCK))
        {
            System.out.println("|∀| Max Quantity Restock Filter:\n");
            int amount = Integer.parseInt(reader.getInput());
            manager.restockProducts(amount);
        }
    }
    
    /**
     * Uses dependancies from StockManager to perform add task
     */
    private void addProduct()
    {
        System.out.println("|➕| Add new Product:\n");
        System.out.println("|➕| Enter ID\n");
        int id = Integer.parseInt(reader.getInput());
        System.out.println("|➕| Enter Name\n");
        String name = reader.getInput();
        manager.addProduct(id, name);
    }
    
    /**
     * Uses dependancies from StockManager to perform remove task
     */    
    private void removeProduct(int id)
    {
        manager.removeProduct(id);
    }
    
    /**
     * Uses dependancies from StockManager to perform remove task
     */    
    private void renameProduct(int id, String newName)
    {
        manager.renameProduct(id, newName);
    }
    
    /**
     * Uses dependancies from StockManager to perform printall task
     */
    private void printAllProducts()
    {
        manager.printAllProducts();
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("==============================================");
        System.out.println("          Stock Management Application        ");
        System.out.println("            App05: by Haroon Sadiq            ");
        System.out.println("==============================================");
    }
}
