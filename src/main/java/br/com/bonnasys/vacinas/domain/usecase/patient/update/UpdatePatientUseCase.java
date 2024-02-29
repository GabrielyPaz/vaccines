package br.com.bonnasys.vacinas.domain.usecase.patient.update;

import br.com.bonnasys.vacinas.domain.model.Patient;

import java.util.Map;
import java.util.Objects;

public interface UpdatePatientUseCase {

    Patient execute (String id, Map<String, Object> fields);
}
