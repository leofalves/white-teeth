package br.com.whiteteeth.api.dto;

import jakarta.validation.constraints.NotNull;

public record DoctorUpdDto(
        @NotNull
        Long id,
        String phoneNumber,
        String name,
        AddressDto address) {
}
