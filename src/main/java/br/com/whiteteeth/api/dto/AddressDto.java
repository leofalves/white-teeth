package br.com.whiteteeth.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record AddressDto(
        @NotBlank
        String line1,

        String line2,

        @NotBlank
        @Pattern(regexp = "\\d{8}") // CEP com 8 dígitos
        String zipCode,

        @NotBlank
        String city,

        @NotBlank
        String state,

        String number) {
}
