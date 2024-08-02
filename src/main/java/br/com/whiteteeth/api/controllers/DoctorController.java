package br.com.whiteteeth.api.controllers;

import br.com.whiteteeth.api.dto.DoctorDto;
import br.com.whiteteeth.api.dto.DoctorListDto;
import br.com.whiteteeth.api.entities.Doctor;
import br.com.whiteteeth.api.repositories.DoctorRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
@Transactional
public class DoctorController {

    @Autowired
    DoctorRepository doctorRepository;

    @PostMapping
    public void insertDoctor(@RequestBody @Valid DoctorDto data){
        doctorRepository.save(new Doctor(data));
    }

    @GetMapping
    public List<DoctorListDto> listDoctor() {
        return doctorRepository.findAll().stream().map(DoctorListDto::new).toList();
    }
}
