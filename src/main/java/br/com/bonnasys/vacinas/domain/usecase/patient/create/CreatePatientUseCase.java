package br.com.bonnasys.vacinas.domain.usecase.patient.create;


import br.com.bonnasys.vacinas.domain.model.Patient;

public interface CreatePatientUseCase {

    Patient execute (CreatePatientCommand command);

}
