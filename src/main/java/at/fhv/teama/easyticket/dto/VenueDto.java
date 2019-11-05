package at.fhv.teama.easyticket.dto;

import at.fhv.teama.easyticket.interfaces.ObjectWithId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
public class VenueDto implements Serializable, ObjectWithId {
    private Long id;
    private LocalDateTime date;
    private AddressDto address;
    private ProgramDto program;
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<TicketDto> tickets = new HashSet<>();
}
