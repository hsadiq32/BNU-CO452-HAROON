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
    
    private int productQuantity;
   
    
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
                System.out.println(product.toString());
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
    
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void deliverProduct(int id, int quantity)   
    {
        boolean resultSearch = false;
        String productName = null;
        int oldQuantity = 0;
        int newQuantity = 0;
        for(Product product : stock) 
        { 
            if(product.getID() == id)
            { 
                resultSearch = true;
                oldQuantity = product.getQuantity();
                quantity = product.getQuantity() + quantity;
                productName = product.getName();
                product.replaceQuantity(quantity);
                newQuantity = product.getQuantity();
            }
        }
        if(resultSearch  == true)
        {
            System.out.println("======================================");
            System.out.println("Delivered: " + productName);
            System.out.println("======================================");
            System.out.println("Quantity Delivered : " + quantity);
            System.out.println("Stock level        : " + oldQuantity + " --> " + newQuantity);
            System.out.println("======================================");
        }
        else
        {
            System.out.println("Invalid ID");
        }
        System.out.println();
    }
            }
            else
            { 
                //found it!
                System.out.println("Invalid ID");
            }
        }
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
    
    public void removeProduct(int id)
    {
        stock.removeIf(product -> product.getID() == id);
    }
}
        
    /**
     * Finds a product using syntax similar to arraylist items
     * Includes an error system using if and else statements for easy user troubleshooting
     */
    public void findProduct(String name)
    {
        boolean resultSearch = false;
        System.out.println("======================================");
        System.out.println("            Product Search            ");
        System.out.println("======================================");
        System.out.println();
        for(Product product : stock) 
        { 
            if(product.getName().contains(name))
            {
                resultSearch = true;
                System.out.println(product.toString());
            }
        }
        if(resultSearch == false)
        {
            System.out.println("No Products found");
        }
        System.out.println();
        System.out.println("======================================");
        System.out.println("You searched: '" + name + "'");
        System.out.println("======================================");
        System.out.println();
    }
