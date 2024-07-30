package br.com.whiteteeth.api.repositories;

import br.com.whiteteeth.api.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
