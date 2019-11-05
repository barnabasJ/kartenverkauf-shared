package at.fhv.teama.easyticket.dto;

import at.fhv.teama.easyticket.interfaces.ObjectWithId;
import lombok.Data;

import java.io.Serializable;

@Data
public class AddressDto implements Serializable, ObjectWithId {
    private Long id;
    private String line1;
    private String line2;
    private String line3;
    private String locality;
    private String region;
    private String postcode;
    private String country;
}
