package br.com.bonnasys.vacinas.domain.usecase.create;

import br.com.bonnasys.vacinas.domain.model.Patient;
import br.com.bonnasys.vacinas.domain.repository.PatientRepository;
import br.com.bonnasys.vacinas.domain.usecase.patient.create.CreatePatientCommand;
import br.com.bonnasys.vacinas.domain.usecase.patient.create.CreatePatientUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.time.LocalDate;

@SpringBootTest
@ActiveProfiles("test")
class CreatePatientUseCaseImplTest {

    @Autowired
    private CreatePatientUseCase createPatientUseCase;


    @Autowired
    private PatientRepository patientRepository;

    @Test
    void giveenValidCommandEhenCallsCreatePatientUseCaseThenAssertFields() {
        final String name = "Gabi Paz";
        final String email= "gabi@gmail.com";
        final String phone = "(99) 99999-9999";
        final LocalDate now = LocalDate.now();
        LocalDate birthdate = now
                .minusDays(12)
                .minusMonths(1)
                .minusYears(45);

        CreatePatientCommand command = new CreatePatientCommand(name, phone, email ,birthdate);

        Patient patient = createPatientUseCase.execute(command);
        String patientId = patient.getId();

        Patient createdPatient = patientRepository.findById(patientId).orElseThrow();

        Assertions.assertEquals(name, createdPatient.getName());
        Assertions.assertEquals(phone, createdPatient.getPhone());
        Assertions.assertEquals(email, createdPatient.getEmail());

        Assertions.assertTrue(createdPatient.getHistory().isEmpty());

        Assertions.assertNull(createdPatient.getUpdatedAt());
        Assertions.assertNull(createdPatient.getCreatedAt());
    }
}