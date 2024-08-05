package br.com.whiteteeth.api.entities;

import br.com.whiteteeth.api.dto.DoctorDto;
import br.com.whiteteeth.api.dto.DoctorUpdDto;
import br.com.whiteteeth.api.enums.Speciality;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Doctor")
@Table(name = "doctors")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    private String cro;

    @Enumerated(EnumType.STRING)
    private Speciality speciality;

    @Embedded // no banco de dados o endereço será armazenado na mesma tabela de doctors
    private Address address;

    public Doctor(DoctorDto data) {
        this.name = data.name();
        this.email = data.email();
        this.phoneNumber = data.phoneNumber();
        this.cro = data.cro();
        this.speciality = data.speciality();
        this.address = new Address(data.address());
    }

    public void updateData(DoctorUpdDto data) {
        if(data.name() != null){
            this.name = data.name();
        }
        if(data.phoneNumber() != null){
            this.phoneNumber = data.phoneNumber();
        }
        if(data.address() != null){
            this.address.updateData(data.address());
        }
    }
}
