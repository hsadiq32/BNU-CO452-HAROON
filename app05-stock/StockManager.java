import java.util.*;
/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author Haroon Sadiq 
 * @version 05/11/2020
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;
    // Links Product class dependencies
    private Product product;
    // The quantity of products sold
    private int sellQuantity;
    
    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Adds a product to the arraylist.
     */
    public void addProduct(int id, String name)
    {
        Product product = new Product(id, name);
        boolean check = checkID(product.getID());
        if(check == true)
        {
            System.out.println();
            System.out.println("ID conflict");
            System.out.println();
        }
        else
        {
            stock.add(product);
            System.out.println();
            System.out.println("Added Successfully");
            System.out.println();
        }
    }
    
    private boolean checkID(int id)
    {
        boolean check = false;
        for(Product product : stock) 
        { 
            if(product.getID() == id)
            { 
                check = true;
            }
        }
        if(check == true)
        {
            return true;
        }
        else
        {
            return false;
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
        int quantityAmount = 0;
        for(Product product : stock) 
        { 
            if(product.getID() == id)
            { 
                quantityAmount = product.getQuantity();
            }
        }
        return quantityAmount;
    }
    
    /**
     * Print details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     * Includes an error system using if and else statements for easy user troubleshooting
     */
    public void printProduct(int id)
    {
        boolean resultSearch = false;
        String productString = null;
        for(Product product : stock) 
        { 
            if(product.getID() == id)
            { 
                resultSearch =true;
                productString = product.toString();
            }
        }
        if(resultSearch  == true)
        {
            System.out.println(productString);
        }
        else
        {
            System.out.println("Invalid ID");
        }
    }
    
    /**
     * Print out each product in the stock
     * in the order they are in the stock list
     */
    public void printAllProducts()
    {
        System.out.println("======================================");
        System.out.println("         Peacock's Stock List         ");
        System.out.println("======================================");
        System.out.println();
        
        for(Product product : stock)
        {
            System.out.println(product);
        }
        System.out.println("======================================");
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
    
    /**
     * Sell a specified quantity of a product.
     * An error is reported if there appears to be no stock.
     */
    public void sellProduct(int id, int sellQuantity)
    {
        boolean resultSearch = false;
        boolean error = false;
        String productName = null;
        int oldQuantity = 0;
        int newQuantity = 0;
        for(Product product : stock) 
        {
            if(product.getID() == id)
            {
                int quantity = product.getQuantity();
                if(quantity >= sellQuantity) 
                {
                    resultSearch = true;
                    oldQuantity = product.getQuantity();
                    quantity = quantity - sellQuantity;
                    product.replaceQuantity(quantity);
                    newQuantity = product.getQuantity();
                    productName = product.getName();
                }
                else
                {
                    error = true;
                }
            }
            else
            {
                error = false;
            }
        }
        if(resultSearch  == true)
        {
            System.out.println("======================================");
            System.out.println("Sold: " + productName);
            System.out.println("======================================");
            System.out.println("Quantity Sold : " + sellQuantity);
            System.out.println("Stock level   : " + oldQuantity + " --> " + newQuantity);
            System.out.println("======================================");
        }
        else if(error = true)
        {
            System.out.println("Not enough stock available for inputted quantity");
        }
        else
        {
            System.out.println("Invalid ID");
        }
        System.out.println();
    }
    
    /**
     * Renames a product using its ID as an identifier
     * An error is reported if there appears to be no stock.
     * Includes an error system using if and else statements for easy user troubleshooting
     */
    public void renameProduct(int id, String newName)
    {
        boolean resultSearch = false;
        String oldName = null;
        for(Product product : stock) 
        { 
            if(product.getID() == id)
            { 
                resultSearch = true;
                oldName = product.getName();
                product.replaceName(newName);
            }
        }
        if(resultSearch  == true)
        {
            System.out.println("Replaced '" + oldName + "' with '" + newName + "'");
        }
        else
        {
            System.out.println("Invalid ID");
        }
        System.out.println();
    }
    
     /**
     * Removes data from array list using the ID to locate the data
     */
    public void removeProduct(int id)
    {
        boolean check = false;
        String removedProduct = null;
        for(Product product : stock) 
        { 
            if(product.getID() == id)
            {
                check = true;
                removedProduct = product.toString();
            }
        }
        
        if(check == true)
        {
            System.out.println("Removed: " + removedProduct);
            stock.removeIf(product -> product.getID() == id);
        }
        
        else
        {
            System.out.println("Invalid ID");
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
            if(product.getName().toLowerCase().contains(name.toLowerCase()))
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
    
    /**
     * Searches product quantity through a loop with if statement to filter low stock
     * Includes an error system using if and else statements for easy user troubleshooting
     */
    public void lowStockFinder()
    {
        boolean resultSearch = false;
        System.out.println("======================================");
        System.out.println("           Low Stock Products         ");
        System.out.println("======================================");
        System.out.println();
        for(Product product : stock) 
        { 
            if(product.getQuantity() <= 5)
            {
                resultSearch = true;
                System.out.println(product.toString());
            }
        }
        if(resultSearch == false)
        {
            System.out.println("No Low Stock Products found");
        }
        System.out.println("======================================");
        System.out.println();
    }
    
    public void restockProducts()
    {
        boolean resultSearch = false;
        System.out.println("======================================");
        System.out.println("           Low Stock Products         ");
        System.out.println("======================================");
        System.out.println();
        for(Product product : stock) 
        { 
            if(product.getQuantity() <= 5)
            {
                resultSearch = true;
                int id = product.getID();
                deliverProduct(id, 5);
            }
        }
        if(resultSearch == false)
        {
            System.out.println("No Low Stock Products found");
        }
        System.out.println("======================================");
        System.out.println();
    }
}