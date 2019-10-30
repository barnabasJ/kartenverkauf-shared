package at.fhv.teama.easyticket.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
public class VenueDto implements Serializable {
    private Long id;
    private LocalDateTime date;
    private AddressDto address;
    private ProgramDto program;
    private Set<TicketDto> tickets = new HashSet<>();
}
