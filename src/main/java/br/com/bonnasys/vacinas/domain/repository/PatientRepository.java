package br.com.bonnasys.vacinas.domain.repository;

import br.com.bonnasys.vacinas.domain.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository <Patient, String> {
}
