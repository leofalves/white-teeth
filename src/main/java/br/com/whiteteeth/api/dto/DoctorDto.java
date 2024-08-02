package br.com.whiteteeth.api.dto;

import br.com.whiteteeth.api.enums.Speciality;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DoctorDto(
        @NotBlank
        String name,

        @NotBlank
        @Email
        String email,

        @NotBlank
        String phoneNumber,

        @NotBlank
        @Pattern(regexp = "\\d{4,6}") //Expressão regular --> De 4 a 6 dígitos
        String cro,

        @NotNull
        Speciality speciality,

        @NotNull
        @Valid
        AddressDto address) {
}
