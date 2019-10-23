package at.fhv.teama.easyticket.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProgramDto implements Serializable {
    private Long id;
    private String genre;
    private String description;
}