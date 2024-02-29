package br.com.bonnasys.vacinas.domain.usecase.patient.retrieve.search;

import br.com.bonnasys.vacinas.domain.model.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SearchPatientUseCase {

    Page<Patient> execute(SearchPatientCommand command, Pageable page);
}
