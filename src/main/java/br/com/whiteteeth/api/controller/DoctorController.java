package br.com.whiteteeth.api.controller;

import br.com.whiteteeth.api.dto.doctorDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @PostMapping
    public void insertDoctor(@RequestBody doctorDto data){
        System.out.println(data);

    }
}
