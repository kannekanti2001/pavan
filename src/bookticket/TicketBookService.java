package bookticket;

import java.sql.Date;

public class TicketBookService {
    Ticket bookTicket(Row[] seats, String movieName, Date date){
        Ticket ticket = new Ticket();
        ticket.movieName="OG";
        ticket.price=250;
        return ticket;

    }
}
