package br.com.bonnasys.vacinas.domain.usecase.patient.delete;

import br.com.bonnasys.vacinas.domain.exception.PatientNotFoundException;
import br.com.bonnasys.vacinas.domain.model.Patient;
import br.com.bonnasys.vacinas.domain.repository.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class DeletePatientUseCaseImpl implements DeletePatientUseCase{

    private final PatientRepository patientRepository;


    @Override
    public void execute(String id) {
        Patient patient= patientRepository.findById(id).orElseThrow(PatientNotFoundException::new);
        patientRepository.delete(patient);

    }
}
