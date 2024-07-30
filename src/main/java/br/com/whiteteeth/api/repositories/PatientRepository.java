package br.com.whiteteeth.api.repositories;

import br.com.whiteteeth.api.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
