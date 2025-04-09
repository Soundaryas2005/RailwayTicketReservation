/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adda.vit.regno22mic0090.mic0084.mic0119.railwayticketreservation;

/**
 *
 * @author KEERTHANA
 */
public class Ticket {
    
    public String ticketNo;
    public String startingLocation;
    public String destinationLocation;
    public String passengerNo;
    public double paymentAmount;

    public Passenger passenger;
    public TicketClerk clerk;
    public Train train;
    public Payment payment;

    public void cancelTicket() {
        System.out.println("Ticket " + ticketNo + " canceled.");
    }
}

    

