package br.com.bonnasys.vacinas.domain.repository;

import br.com.bonnasys.vacinas.domain.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PatientRepository extends JpaRepository <Patient, String>,
        JpaSpecificationExecutor<Patient> {
}
