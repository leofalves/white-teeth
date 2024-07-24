package br.com.whiteteeth.api.dto;

import br.com.whiteteeth.api.enums.Speciallity;

public record doctorDto(String name, String email, String cro, Speciallity speciality, AddressDto address) {
}
