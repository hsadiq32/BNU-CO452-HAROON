import java.util.*;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;
    
    private Product product;
   
    
    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Adds a product to the list.
     */
    public void addProduct(Product product)
    {
        stock.add(product);
    }
    
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
    {
    }
    
    public Product findProduct(int id)
    {
        return null;
    }
    
    /**
     * Sell one of the given item.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void sellProduct(int id)
    {
        Product product = findProduct(id);
        
        if(product != null) 
        {
            printProduct(id);
            product.sellOne();
            printProduct(id);
        }
    }     

    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {
        return 0;
    }

    /**
     * Print details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void printProduct(int id)
    {
        for(Product product : stock) 
        { 
            if(product.getID() == id)
            { 
                //found it!
                product.toString();
            }
            else
            { 
                //found it!
                System.out.println("Invalid ID");
            }
        }
    }
    
    /**
     * Print out each product in the stock
     * in the order they are in the stock list
     */
    public void printAllProducts()
    {
        System.out.println();
        System.out.println("Peacock's Stock List");
        System.out.println("====================");
        System.out.println();
        
        for(Product product : stock)
        {
            System.out.println(product);
        }

        System.out.println();
    }
    
    public void renameProduct(int id, String newName)
    {
        for(Product product : stock) 
        { 
            if(product.getID() == id)
            { 
                //found it!
                product.replaceName(newName);
            }
            else
            { 
                //found it!
                System.out.println("Invalid ID");
            }
        }
    }
}
    