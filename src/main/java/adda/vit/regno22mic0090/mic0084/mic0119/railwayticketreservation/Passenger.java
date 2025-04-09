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

public class Passenger {
    
    public String name;
    public int age;
    public String address;

    private final List<Ticket> tickets;

    public Passenger() {
        this.tickets = new ArrayList<>();
    }

    public void searchTrains() {
        System.out.println(name + " is searching for trains.");
    }

    public void viewSchedule() {
        System.out.println(name + " is viewing train schedules.");
    }

    public void reserveSeat(Ticket ticket) {
        tickets.add(ticket);
        System.out.println(name + " reserved a seat.");
    }

    public void purchaseTicket(Ticket ticket) {
        tickets.add(ticket);
        System.out.println(name + " purchased a ticket.");
    }

    public void cancelTicket(Ticket ticket) {
        tickets.remove(ticket);
        System.out.println(name + " canceled a ticket.");
    }

    public void makePayment(Payment payment) {
        System.out.println(name + " made a payment of " + payment.amount);
    }
}

    
