/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        manager.addProduct(new Product(12, "Google Pixel 5"));
        manager.addProduct(new Product(13, "GoPro HERO9 Black"));
        manager.addProduct(new Product(14, "Apple Watch Series 6"));
        manager.addProduct(new Product(15, "Oculus Quest 2"));
        manager.addProduct(new Product(16, "2020 iPad Air"));
        manager.addProduct(new Product(17, "Canon EOS R5"));
        manager.addProduct(new Product(18, "Samsung 49-Inch Curved Gaming Monitor"));
        manager.addProduct(new Product(19, "SanDisk 1TB SD Card"));
        manager.addProduct(new Product(20, "Microsoft Surface Headphones 2"));
        manager.addProduct(new Product(21, "Fujifilm X100V"));
        manager.addProduct(new Product(22, "iPhone SE"));
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void demoDeliverProduct()
    {
        manager.deliverProduct(12, 6);
        manager.deliverProduct(13, 7);
        manager.deliverProduct(14, 2);
        manager.deliverProduct(15, 8);
        manager.deliverProduct(16, 5);
        manager.deliverProduct(17, 5);
        manager.deliverProduct(18, 6);
        manager.deliverProduct(19, 8);
        manager.deliverProduct(20, 7);
        manager.deliverProduct(21, 7);
        manager.deliverProduct(22, 9);
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
