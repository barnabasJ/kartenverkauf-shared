package at.fhv.teama.easyticket.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class TicketDto implements Serializable {
    private Long id;
    private Integer x;
    private Integer y;
    private TicketState state;
    private CategoryDto categoryDto;
    private VenueDto venueDto;
    private PersonDto personDto;

}
