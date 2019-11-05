package at.fhv.teama.easyticket.dto;

import at.fhv.teama.easyticket.interfaces.ObjectWithId;
import lombok.Data;

import java.io.Serializable;

@Data
public class TicketDto implements Serializable, ObjectWithId {
    private Long id;
    private Integer x;
    private Integer y;
    private TicketState state;
    private CategoryDto category;
    private VenueDto venue;
    private PersonDto person;


    @Override
    public String toString() {
        return venue.getProgram().getDescription()+", "+
                x+"/"+y+", \t"+category.getPrice()/100+" €";
    }
}
