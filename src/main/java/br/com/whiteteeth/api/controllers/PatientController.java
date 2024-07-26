package br.com.whiteteeth.api.controllers;

import br.com.whiteteeth.api.dto.PatientDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @PostMapping
    public void insertPatient(@RequestBody PatientDto data){
        System.out.println(data);
    }
}
