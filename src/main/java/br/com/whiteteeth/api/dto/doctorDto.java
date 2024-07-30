package br.com.whiteteeth.api.dto;

import br.com.whiteteeth.api.enums.Speciality;

public record doctorDto(String name, String email, String cro, Speciality speciality, AddressDto address) {
}
