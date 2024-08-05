package br.com.whiteteeth.api.controllers;

import br.com.whiteteeth.api.dto.DoctorDto;
import br.com.whiteteeth.api.dto.DoctorListDto;
import br.com.whiteteeth.api.dto.DoctorUpdDto;
import br.com.whiteteeth.api.entities.Doctor;
import br.com.whiteteeth.api.repositories.DoctorRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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
    public Page<DoctorListDto> listDoctor(@PageableDefault(size = 1,page = 0, sort = {"name"}) Pageable pageable) {
        return doctorRepository.findAll(pageable).map(DoctorListDto::new);
    }

    @PutMapping
    @Transactional
    public void updateDoctor(@RequestBody @Valid DoctorUpdDto data) {
        var doctor = doctorRepository.getReferenceById(data.id());

        doctor.updateData(data);

    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deleteDoctor(@PathVariable Long id){
        doctorRepository.deleteById(id);
    }
}
