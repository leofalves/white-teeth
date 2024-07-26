package br.com.whiteteeth.api.entities;

import br.com.whiteteeth.api.enums.Speciallity;
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
    private String cro;

    @Enumerated(EnumType.STRING)
    private Speciallity speciallity;

    @Embedded // no banco de dados o endereço será armazenado na mesma tabela de doctors
    private Address address;

}
