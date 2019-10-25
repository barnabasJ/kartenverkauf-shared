package at.fhv.teama.easyticket.dto;

import lombok.Data;

@Data
public class AddressDto {
    private Long id;
    private String line1;
    private String line2;
    private String line3;
    private String locality;
    private String region;
    private String postcode;
    private String country;
}
