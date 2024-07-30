package br.com.whiteteeth.api.entities;

import br.com.whiteteeth.api.dto.PatientDto;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Patient")
@Table(name = "patients")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    private String cpf;

    @Embedded
    private Address address;

    public Patient(PatientDto data) {
        this.name = data.name();
        this.email = data.email();
        this.phoneNumber = data.phoneNumber();
        this.cpf = data.cpf();
        this.address = new Address(data.address());
    }
}
