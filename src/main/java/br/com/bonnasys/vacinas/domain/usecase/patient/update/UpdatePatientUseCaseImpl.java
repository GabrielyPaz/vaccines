package br.com.bonnasys.vacinas.domain.usecase.patient.update;

import br.com.bonnasys.vacinas.domain.model.Patient;
import br.com.bonnasys.vacinas.domain.repository.PatientRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.Map;

import static org.springframework.data.util.ReflectionUtils.setField;
import static org.springframework.util.ReflectionUtils.findField;
import static org.springframework.util.ReflectionUtils.getField;

@Slf4j
@Service
@AllArgsConstructor

public class UpdatePatientUseCaseImpl implements UpdatePatientUseCase{
    private final PatientRepository patientRepository;
    private final ObjectMapper mapper;

    @Override
    public Patient execute(String id, Map<String, Object> fields) {
        Patient retrieverPatient = patientRepository.findById(id).orElseThrow();
        Patient request = mapper.convertValue(fields, Patient.class);

        fields.forEach((property,value) -> {
            Field field = findField(Patient.class ,property);
            if (field == null){
                log.error("field '%' not found in entity, i will skip it");
                return;
            }
            field.setAccessible(true);
            Object newValue = getField(field, request);
            setField(field, retrieverPatient, newValue);
        });

        return patientRepository.save(retrieverPatient);
    }
}
