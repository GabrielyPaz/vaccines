package br.com.bonnasys.vacinas.app.rest;


import br.com.bonnasys.vacinas.app.graphql.response.PatientResponse;
import br.com.bonnasys.vacinas.app.rest.controller.dto.request.CreatePatientRequest;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Patients")
@RequestMapping("patients")
public interface PatientApi {

    @GetMapping("{id}")
    ResponseEntity<PatientResponse> get(@PathVariable String id);

    @PostMapping
    ResponseEntity<Void> create(@RequestBody CreatePatientRequest request);
}
