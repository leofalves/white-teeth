package br.com.whiteteeth.api.controllers;

import br.com.whiteteeth.api.dto.doctorDto;
import br.com.whiteteeth.api.entities.Doctor;
import br.com.whiteteeth.api.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctors")
@Transactional
public class DoctorController {

    @Autowired
    DoctorRepository doctorRepository;

    @PostMapping
    public void insertDoctor(@RequestBody doctorDto data){
        doctorRepository.save(new Doctor(data));
    }
}
