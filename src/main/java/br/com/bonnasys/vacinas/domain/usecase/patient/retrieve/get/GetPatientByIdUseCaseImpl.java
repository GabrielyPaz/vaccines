package br.com.bonnasys.vacinas.domain.usecase.patient.retrieve.get;

import br.com.bonnasys.vacinas.domain.exception.PatientNotFoundException;
import br.com.bonnasys.vacinas.domain.model.Patient;
import br.com.bonnasys.vacinas.domain.repository.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class GetPatientByIdUseCaseImpl implements GetPatientByIdUseCase{

    private final PatientRepository repository;

    @Override
    public Patient execute(String id) {
        return repository.findById(id).orElseThrow(PatientNotFoundException::new);
    }
}
