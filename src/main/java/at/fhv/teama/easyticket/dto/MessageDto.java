package at.fhv.teama.easyticket.dto;

import at.fhv.teama.easyticket.interfaces.ObjectWithId;
import lombok.Data;

import java.io.Serializable;

@Data
public class MessageDto implements Serializable, ObjectWithId {

    String id;
    String topic;
    String content;

    @Override
    public Object getId() {
        return null;
    }
}
