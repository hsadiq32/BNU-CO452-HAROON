
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
public class Ticket
{
    // The price of a ticket from this machine.
    private String destination;
    // The amount of money required to pay the ticket
    private int cost;
    // The date the ticket was issued/purchased
    private Date purchaseDate;

    /**
     * Create a machine that issues tickets of the given price, destination 
     * and date
     */
    public Ticket(String destination, int cost)
    {
        this.destination = destination;
        this.cost = cost;
        purchaseDate = new Date();
    }

     /**
     * A method which prints out the tickets details such as: destination, cost 
     * and date
     */
    public void printTicket()
    {
        System.out.println("##############################");
        System.out.println("# The BlueJ Line             #");
        System.out.println("# Destination: " + destination + "   ");
        System.out.println("# Price:       " + cost + "p          #");
        System.out.println("#" + purchaseDate + "#");
        System.out.println("##############################");      
    }
}