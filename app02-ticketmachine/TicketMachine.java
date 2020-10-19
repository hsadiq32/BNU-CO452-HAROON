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
    
    // Links enum coin dependancies
    public Ticket ticket;
    
    //  Creates the three tickets to specification (station and price in pence)
    private Ticket highWycombeTicket;
    private Ticket amershamTicket;
    private Ticket aylesburyTicket;
    
    /**
     * Create a machine that starts a new instance with the user balance at 0
     */
    public TicketMachine()
    {
        balance = 0;
        price = 0;
        total = 0;
        highWycombeTicket = new Ticket("High Wycombe", 330);    
        amershamTicket = new Ticket("Amersham", 300);
        aylesburyTicket = new Ticket("Aylesbury", 220);
    }

    /**
     * Prints out the available tickets
     */
    public void showAvailableTickets()
    {
        System.out.println("Our avaiblable tickets are: ");
        System.out.println();
        amershamTicket.printTicket();
        System.out.println();
        aylesburyTicket.printTicket();
        System.out.println();
        highWycombeTicket.printTicket();
    }
    
    /**
     * Uses enum Coin dependancies to input certain values of coin
     */
    public void insertCoin(Coin coin)
    {
        System.out.println("###########################");
        System.out.println("# INSERTED: " + coin + "p          #");
        System.out.println("#                         #");
        balance = balance + coin.getValue();
        System.out.println("# BALANCE: "+ balance + "p          #");
        System.out.println("###########################");
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public void printBalance()
    {
        System.out.println("###########################");
        System.out.println("# BALANCE: "+ balance + "p");
        System.out.println("###########################");
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
    public void printTicket(String destination)
    {
        if(destination.equals("High Wycombe"))
        {
            price = 330;
            if(price <= balance)
            {
                int refund = balance - price;
                highWycombeTicket.printTicket();
                System.out.println("#        VALID TICKET        #");
                System.out.println("##############################");
                System.out.println(" REFUNDED: " + refund + "p");
                balance = 0;
            }
            else
            {
                int amountLeft = price - balance;
                System.out.println("INSUFFICIENT FUNDS");
                System.out.println("You need " + amountLeft + "p more to buy a " + destination + " ticket");
            }
        }
        else if(destination.equals("Aylesbury"))
        {
            price = 220;
            if(price <= balance)
            {
                int refund = balance - price;
                aylesburyTicket.printTicket();
                System.out.println("#        VALID TICKET        #");
                System.out.println("##############################");
                System.out.println(" REFUNDED: " + refund + "p");
                balance = 0;
            }
            else
            {
                int amountLeft = price - balance;
                System.out.println("INSUFFICIENT FUNDS");
                System.out.println("You need " + amountLeft + "p more to buy a " + destination + " ticket");
            }
        }
        else if(destination.equals("Amersham"))
        {
            price = 300;
            if(price <= balance)
            {
                int refund = balance - price;
                amershamTicket.printTicket();
                System.out.println("#        VALID TICKET        #");
                System.out.println("##############################");
                System.out.println(" REFUNDED: " + refund + "p");
                balance = 0;
            }
            else
            {
                int amountLeft = price - balance;
                System.out.println("INSUFFICIENT FUNDS");
                System.out.println("You need " + amountLeft + "p more to buy a " + destination + " ticket");
            }
        }
        else
        {
            System.out.println("Invalid destination");
        }
    }

    public void insert10p()
    {
        balance = balance + 10;
        System.out.println("###########################");
        System.out.println("# INSERTED: 10p           #");
        System.out.println("#                         #");
        System.out.println("# BALANCE: "+ balance + "p");
        System.out.println("###########################");
    }
    
    public void insert20p()
    {
        balance = balance + 20;
        System.out.println("###########################");
        System.out.println("# INSERTED: 20p           #");
        System.out.println("#                         #");
        System.out.println("# BALANCE: "+ balance);
        System.out.println("###########################");
    }
    
    public void insert100p()
    {
        balance = balance + 100;
        System.out.println("###########################");
        System.out.println("# INSERTED: 100p          #");
        System.out.println("#                         #");
        System.out.println("# BALANCE: "+ balance);
        System.out.println("###########################");
    }
    
    public void insert200p()
    {
        balance = balance + 200;
        System.out.println("###########################");
        System.out.println("# INSERTED: 200p          #");
        System.out.println("#                         #");
        System.out.println("# BALANCE: "+ balance);
        System.out.println("###########################");
    }
}