package br.com.bonnasys.vacinas.app.mapper;

import br.com.bonnasys.vacinas.app.dto.response.PatientResponse;
import br.com.bonnasys.vacinas.app.dto.response.VaccineRegistrationResponse;
import br.com.bonnasys.vacinas.domain.model.Patient;
import br.com.bonnasys.vacinas.domain.model.VaccineRegistration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper

public interface PatientMapper {
    PatientMapper INSTANCE = Mappers.getMapper(PatientMapper.class);

    @Mapping(target = "history", ignore = true)
    PatientResponse toPatientResponse (Patient patient);

    VaccineRegistrationResponse toVaccineRegistrationResponse(VaccineRegistration vaccineRegistration);
}
