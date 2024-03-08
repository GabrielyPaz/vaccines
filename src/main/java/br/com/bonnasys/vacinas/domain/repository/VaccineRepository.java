package br.com.bonnasys.vacinas.domain.repository;

import br.com.bonnasys.vacinas.domain.model.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccineRepository extends JpaRepository<Vaccine, String> {
}
