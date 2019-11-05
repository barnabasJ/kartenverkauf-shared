package at.fhv.teama.easyticket.dto;

import at.fhv.teama.easyticket.interfaces.ObjectWithId;
import lombok.Data;

import java.io.Serializable;

@Data
public class ArtistDto implements Serializable, ObjectWithId {
    private String name;

    @Override
    public Object getId() {
        return name;
    }
}
