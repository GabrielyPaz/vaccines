package br.com.bonnasys.vacinas.domain.usecase.patient.create;

import java.time.LocalDate;

public record CreatePatientCommand (String name,
                                    String phone,
                                    String email,
                                    LocalDate birthdate) {

}
