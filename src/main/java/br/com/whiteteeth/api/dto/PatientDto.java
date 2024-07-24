package br.com.whiteteeth.api.dto;

public record PatientDto(String name, String email, String phone, String cpf, AddressDto address) {
}
