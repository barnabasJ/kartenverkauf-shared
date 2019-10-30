package at.fhv.teama.easyticket.rmi;

import at.fhv.teama.easyticket.dto.PersonDto;
import at.fhv.teama.easyticket.dto.TicketDto;
import at.fhv.teama.easyticket.dto.VenueDto;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Set;

public interface EasyTicketService {
    Set<VenueDto> getAllVenues();

    Set<String> getAllGenres();

    /**
     * Search for venues, Strings which are empty or null will be ignored.
     * If no from date is set todays date will be used.
     * If no to date  is set a year from now will be used
     *
     * @param description program description
     * @param genre program genre
     * @param artistName artist name
     * @param from date from
     * @param to date to
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


}
