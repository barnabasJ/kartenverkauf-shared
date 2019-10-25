package at.fhv.teama.easyticket.dto;

import lombok.Data;

@Data
public class PersonDto {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private AddressDto addressDto;
}
