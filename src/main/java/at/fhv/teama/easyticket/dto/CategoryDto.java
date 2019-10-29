package at.fhv.teama.easyticket.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class CategoryDto implements Serializable {
    private Long id;
    private Integer price;
}
