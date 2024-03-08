package br.com.bonnasys.vacinas.domain.usecase.vaccine.create;

import br.com.bonnasys.vacinas.domain.model.Vaccine;

public interface CreateVaccineUseCase {

    Vaccine execute (CreateVaccineCommand command);
}
