package br.com.whiteteeth.api.entities;

import br.com.whiteteeth.api.dto.AddressDto;
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

    public Address(AddressDto data) {
        this.line1 = data.line1();
        this.line2 = data.line2();
        this.zipcode = data.zipCode();
        this.city = data.city();
        this.state = data.state();
        this.number = Integer.valueOf(data.number());
    }

    public void updateData(AddressDto addressDto) {
        if(addressDto.line1() != null){
            this.line1 = addressDto.line1();
        }
        if(addressDto.line2() != null){
            this.line2 = addressDto.line2();
        }
        if(addressDto.zipCode() != null){
            this.zipcode = addressDto.zipCode();
        }
        if(addressDto.city() != null){
            this.city = addressDto.city();
        }
        if(addressDto.state() != null){
            this.state = addressDto.state();
        }
        if(addressDto.number() != null){
            this.number = Integer.valueOf(addressDto.number());
        }
    }
}
