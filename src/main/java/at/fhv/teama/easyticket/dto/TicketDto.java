package at.fhv.teama.easyticket.dto;

import lombok.Data;

@Data
public class TicketDto {
    private Long id;
    private Integer x;
    private Integer y;
    private TicketState state;
    private CategoryDto categoryDto;
    private VenueDto venueDto;
    private PersonDto personDto;

}
