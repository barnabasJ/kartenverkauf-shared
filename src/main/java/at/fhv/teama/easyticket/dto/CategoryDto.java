package at.fhv.teama.easyticket.dto;

import at.fhv.teama.easyticket.interfaces.ObjectWithId;
import lombok.Data;

import java.io.Serializable;

@Data
public class CategoryDto implements Serializable, ObjectWithId {
    private Long id;
    private Integer price;
}
