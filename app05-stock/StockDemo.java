import java.util.*;
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @modified Haroon Sadiq
 * @version 2016.02.29
 */
public class StockDemo
{
    // The StockManager class dependencies.
    private StockManager manager;
    // Allows the demo to randomise structured test data
    private Random rand = new Random();
    /**
     * Create a StockManager and populate it with a few
     * sample products inside an arraylist with manager dependencies
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        manager.addProduct(new Product(12, "Google Pixel 5"));
        manager.addProduct(new Product(13, "GoPro HERO9 Black"));
        manager.addProduct(new Product(14, "Apple Watch Series 6"));
        manager.addProduct(new Product(15, "Oculus Quest 2"));
        manager.addProduct(new Product(16, "Dell 22-Inch Full HD Monitor"));
        manager.addProduct(new Product(17, "Canon EOS R5"));
        manager.addProduct(new Product(18, "Samsung 49-Inch Curved Gaming Monitor"));
        manager.addProduct(new Product(19, "SanDisk 1TB SD Card"));
        manager.addProduct(new Product(20, "Microsoft Surface Headphones 2"));
        manager.addProduct(new Product(21, "Fujifilm X100V"));
        manager.addProduct(new Product(22, "iPhone X"));
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown
     * Uses a for loop and iterates ID to go through all data
     * Gives a range of 1-12 new stock
     */
    public void demoDelivery()
    {
        for(int id =12; id <= 22; id++)
        {
            manager.deliverProduct(id, rand.nextInt(12) + 1);
        }
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown
     * Uses a for loop and iterates ID to go through all data
     * Scans for the IDs max quantity avoiding any overselling
     */
    public void demoSell()
    {
        for(int id =12; id <= 22; id++)
        {   
            int stockQuantity = manager.numberInStock(id);
            if(stockQuantity < 1)
            {
                stockQuantity = 1;
            }
            manager.sellProduct(id, rand.nextInt(stockQuantity) + 1);
        }
    }
    
    /**
     * Runs all key tasks with the demo data provided
     */
    public void runDemo(String findName)
    {
        manager.findProduct(findName);
        manager.printAllProducts();
        demoDelivery();
        demoSell();
    }
}
