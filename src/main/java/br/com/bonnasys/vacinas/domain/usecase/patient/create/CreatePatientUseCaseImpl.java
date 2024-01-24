package br.com.bonnasys.vacinas.domain.usecase.patient.create;

import br.com.bonnasys.vacinas.domain.model.Patient;
import br.com.bonnasys.vacinas.domain.repository.PatientRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Slf4j
@Service
@AllArgsConstructor
public class CreatePatientUseCaseImpl implements CreatePatientUseCase{

    private final PatientRepository patientRepository;
    @Override
    public Patient execute(CreatePatientCommand command) {
        Patient patient = new Patient();

        patient.setName(command.name());
        patient.setEmail(command.email());
        patient.setPhone(command.phone());
        patient.setBirthdate(command.birthdate());


        informPatientRegistration(command);


        return patientRepository.save(patient);
    }

    private void informPatientRegistration(CreatePatientCommand command) {
        String[] fullName = command.name().split(" ");
        String firstName = fullName[0];
        String lastName = fullName[1];
        Integer years = LocalDate.now().getYear() - command.birthdate().getYear();
        String registration = """
                                
                ----------------------------------------
                Solicitação:            create
                Nome paciente:          %s
                Sobrenome paciente:     %s
                Telefone de contato:    %s
                Idade do paciente:      %d
                ----------------------------------------
                """.formatted(firstName, lastName, command.phone(), years);
        log.info(registration);

    }
}
