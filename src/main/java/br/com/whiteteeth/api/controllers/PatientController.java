package br.com.whiteteeth.api.controllers;

import br.com.whiteteeth.api.dto.PatientDto;
import br.com.whiteteeth.api.entities.Patient;
import br.com.whiteteeth.api.repositories.PatientRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    PatientRepository patientRepository;

    @PostMapping
    public void insertPatient(@RequestBody @Valid PatientDto data){
        patientRepository.save(new Patient(data));
    }
}
