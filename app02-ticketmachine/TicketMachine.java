/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 * 
 * Modified by Haroon Sadiq
 */
import java.util.Date;
import java.text.SimpleDateFormat;
public class TicketMachine
{
    // The price of a ticket from this machine in pence.
    private int price;
    
    // The amount of money entered by a customer so far in pence.
    private int balance;
    
    // The total amount of money collected by this machine in pence.
    private int total;
    
    // Links enum coin dependancies
    public Coin coin;
    
    //  Creates the three tickets to specification (station and price in pence)
    public Ticket highWycombeTicket = new Ticket("High Wycombe", 330);    
    public Ticket amershamTicket = new Ticket("Amersham", 300);
    public Ticket aylesburyTicket= new Ticket("Aylesbury", 220);
    /**
     * Create a machine that starts a new instance with the user balance at 0
     */
    public TicketMachine(Ticket ticket, String date)
    {
        balance = 0;
    }

    /**
     * @Return The price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }
    

    /**
     * Uses enum coin class dependancies to insert coins
     * Check if the inputted data is permissible
     */
    public void insertMoney(Coin coin)
    {
        System.out.println("Inserted: " + coin + " p");
        balance = balance + coin.getValue();
        System.out.println("Balance: "+ balance + " p");
    }

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        if(balance >= price) 
        {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Destination: " + ticket.getDestination());
            System.out.println("# " + price + " cents.");
            System.out.println("# " + date);
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more cents.");
                    
        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
}