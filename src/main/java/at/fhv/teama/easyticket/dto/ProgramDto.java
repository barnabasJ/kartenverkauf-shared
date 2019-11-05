package at.fhv.teama.easyticket.dto;

import at.fhv.teama.easyticket.interfaces.ObjectWithId;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

@Data
public class ProgramDto implements Serializable, ObjectWithId {
    private Long id;
    private String genre;
    private String description;
    private PersonDto organizer;
    private Set<ArtistDto> artists;
}
