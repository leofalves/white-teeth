package br.com.whiteteeth.api.entities;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    private String line1;
    private String line2;
    private String zipcode;
    private String city;
    private String state;
    private Integer number;
}
