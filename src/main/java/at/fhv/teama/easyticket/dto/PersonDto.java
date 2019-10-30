package at.fhv.teama.easyticket.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class PersonDto implements Serializable {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private AddressDto address;
}
