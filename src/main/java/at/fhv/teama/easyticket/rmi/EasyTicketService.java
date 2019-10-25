package at.fhv.teama.easyticket.rmi;

import at.fhv.teama.easyticket.dto.VenueDto;

import java.util.Set;

public interface EasyTicketService {
    Set<VenueDto> getAllVenues();
}
