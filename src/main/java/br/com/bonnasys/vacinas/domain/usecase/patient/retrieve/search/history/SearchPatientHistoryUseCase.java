package br.com.bonnasys.vacinas.domain.usecase.patient.retrieve.search.history;

import br.com.bonnasys.vacinas.domain.model.VaccineRegistration;

import java.util.List;

public interface SearchPatientHistoryUseCase {

    List<VaccineRegistration> execute (String id);
}
