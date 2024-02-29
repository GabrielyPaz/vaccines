package br.com.bonnasys.vacinas.domain.usecase.patient.retrieve.get;

import br.com.bonnasys.vacinas.domain.model.Patient;

public interface GetPatientByIdUseCase {

    Patient execute(String id);
}
