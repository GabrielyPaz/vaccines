package br.com.bonnasys.vacinas.app.rest.controller;


import br.com.bonnasys.vacinas.app.dto.response.PatientResponse;
import br.com.bonnasys.vacinas.app.mapper.PatientMapper;
import br.com.bonnasys.vacinas.app.rest.PatientApi;
import br.com.bonnasys.vacinas.domain.model.Patient;
import br.com.bonnasys.vacinas.domain.usecase.patient.retrieve.get.GetPatientByIdUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PatientRestController implements PatientApi {

    private final GetPatientByIdUseCase getPatientByIdUseCase;
    private final PatientMapper patientMapper;

    @Override
    public ResponseEntity<PatientResponse> get(String id) {
        Patient patient = getPatientByIdUseCase.execute(id);
        PatientResponse response = patientMapper.toPatientResponse(patient);
        return ResponseEntity.ok(response);
    }
}
