/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adda.vit.regno22mic0090.mic0084.mic0119.railwayticketreservation;

/**
 *
 * @author KEERTHANA
 */
 import java.util.ArrayList;
import java.util.List;
public class TicketClerk {
    
    public String name;
    public String location;

    private final List<Ticket> handledTickets;

    public TicketClerk() {
        this.handledTickets = new ArrayList<>();
    }

    public void reserveSeat(Ticket ticket) {
        handledTickets.add(ticket);
        System.out.println("Clerk " + name + " reserved a seat.");
    }

    public void reserveTicket(Ticket ticket) {
        handledTickets.add(ticket);
        System.out.println("Clerk " + name + " reserved a ticket.");
    }

    public void cancelTicket(Ticket ticket) {
        handledTickets.remove(ticket);
        System.out.println("Clerk " + name + " canceled a ticket.");
    }

    public void receivePayment(Payment payment) {
        System.out.println("Clerk " + name + " received payment: " + payment.amount);
    }
}

    

