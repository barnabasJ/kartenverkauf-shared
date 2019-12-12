package at.fhv.teama.easyticket.rmi;

import at.fhv.teama.easyticket.dto.MessageDto;
import at.fhv.teama.easyticket.dto.PersonDto;
import at.fhv.teama.easyticket.dto.TicketDto;
import at.fhv.teama.easyticket.dto.VenueDto;

import javax.ejb.Remote;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Set;

@Remote
public interface EasyTicketService {
    Set<VenueDto> getAllVenues();

    Set<String> getAllGenres();

    /**
     * Search for venues, Strings which are empty or null will be ignored.
     * If no from date is set todays date will be used.
     * If no to date  is set a year from now will be used
     *
     * @param description program description
     * @param genre       program genre
     * @param artistName  artist name
     * @param from        date from
     * @param to          date to
     * @return returns all matching venues
     */
    Set<VenueDto> searchVenue(String description, String genre, String artistName, LocalDateTime from, LocalDateTime to);

    Set<PersonDto> getAllCustomer();

    /**
     * A Method to buy tickets for a Venue. The Ticket must not
     * necessarily contain a customer.
     *
     * @param tickets The tickets to buy
     * @return The tickets which where already bought or reserved
     */
    Set<TicketDto> buyTickets(Collection<TicketDto> tickets);


    /**
     * A Method to reserve tickets for a Venue. The Ticket must
     * necessarily contain a customer.
     *
     * @param tickets The tickets to reserve
     * @return The tickets which where already bought or reserved
     */
    Set<TicketDto> reserveTickets(Collection<TicketDto> tickets);

    /**
     * A Method to unreserve tickets for a Venue. The Ticket must
     * necessarily contain a customer.
     *
     * @param tickets The tickets to unreserve
     * @return
     */
    boolean unreserveTickets(Collection<TicketDto> tickets);

    void publishMessage(MessageDto message);

    void publishFeed(String url, String topic);

    Set<MessageDto> getAllUnreadMessages(String username);

    void acknowledgeMessage(MessageDto messageDto, String username);

    Set<String> login(String username, String password);


}
