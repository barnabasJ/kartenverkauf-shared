package at.fhv.teama.easyticket.dto;

import at.fhv.teama.easyticket.interfaces.ObjectWithId;
import lombok.Data;

import java.io.Serializable;

@Data
public class PersonDto implements Serializable, ObjectWithId {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private AddressDto address;

    @Override
    public String toString() {
        return firstname+" "+lastname;
    }
}
