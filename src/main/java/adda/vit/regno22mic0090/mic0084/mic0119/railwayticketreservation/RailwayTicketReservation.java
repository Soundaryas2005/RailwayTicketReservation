/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package adda.vit.regno22mic0090.mic0084.mic0119.railwayticketreservation;

/**
 *
 * @author KEERTHANA
 */
public class RailwayTicketReservation {


    public static void main(String[] args) {
        // Create passenger
        Passenger passenger = new Passenger();
        passenger.name = "Keerthana,Soundarya,Aarthi";
        passenger.age = 25;
        passenger.address = "Chennai";

        // Create train
        Train train = new Train();
        train.model = "Superfast";
        train.trainId = "T123";

        // Create clerk
        TicketClerk clerk = new TicketClerk();
        clerk.name = "Kumar";
        clerk.location = "Central Station";

        // Create ticket
        Ticket ticket = new Ticket();
        ticket.ticketNo = "TK001";
        ticket.startingLocation = "Chennai";
        ticket.destinationLocation = "Bangalore";
        ticket.passengerNo = "P001";
        ticket.paymentAmount = 350.0;

        // Set relationships
        ticket.passenger= passenger;
        ticket.clerk = clerk;
        ticket.train = train;

        // Payment
        Payment payment = new Payment(350.0);
        ticket.payment = payment;

        // Simulate actions
        passenger.reserveSeat(ticket);
        passenger.makePayment(payment);
        clerk.receivePayment(payment);
        train.showDetails();

        // Database
        RailwayDatabase db = new RailwayDatabase();
        db.ID = "DB1";
        db.response = "Success";
        db.logData("Ticket booked for " + passenger.name);
    }
}


