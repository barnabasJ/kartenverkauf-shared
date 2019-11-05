package at.fhv.teama.easyticket.dto;

import at.fhv.teama.easyticket.interfaces.ObjectWithId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.util.Set;

@Data
public class ProgramDto implements Serializable, ObjectWithId {
    private Long id;
    private String genre;
    private String description;
    private PersonDto organizer;
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<ArtistDto> artists;
}
