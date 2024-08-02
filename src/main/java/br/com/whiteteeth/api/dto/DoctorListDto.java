package br.com.whiteteeth.api.dto;

import br.com.whiteteeth.api.entities.Doctor;
import br.com.whiteteeth.api.enums.Speciality;

public record DoctorListDto(String name, String email, String cro, Speciality speciality) {

    public DoctorListDto(Doctor doctor) {
        this(doctor.getName(), doctor.getEmail(), doctor.getCro(), doctor.getSpeciality());
    }
}
