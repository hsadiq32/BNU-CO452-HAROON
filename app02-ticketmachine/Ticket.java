
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
    // The date the ticket was issued
    private Date date;

    /**
     * Create a machine that issues tickets of the given price, destination 
     * and date
     */
    public Ticket(String destination, String date, int cost)
    {
        this.destination = destination;
        this.cost = cost;
        date = new Date();
    }

     /**
     * A method which prints out the tickets details such as: destination, cost 
     * and date
     */
    public void printTicketInfo ()
    {
        System.out.println("Destination: " + destination);
        System.out.println("Cost       : " + cost);
        System.out.println("Date       : " + date);
    }
}