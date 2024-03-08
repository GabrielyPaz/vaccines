package br.com.bonnasys.vacinas.domain.usecase.vaccine.create.impl;


import br.com.bonnasys.vacinas.domain.model.Vaccine;
import br.com.bonnasys.vacinas.domain.repository.VaccineRepository;
import br.com.bonnasys.vacinas.domain.usecase.vaccine.create.CreateVaccineCommand;
import br.com.bonnasys.vacinas.domain.usecase.vaccine.create.CreateVaccineUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateVaccineUseCaseImpl implements CreateVaccineUseCase {

    private final VaccineRepository vaccineRepository;

    @Override
    public Vaccine execute(CreateVaccineCommand command) {
        Vaccine vaccine = new Vaccine();
        vaccine.setName(command.name());
        vaccine.setProducer(command.producer());
        return vaccineRepository.save(vaccine);
    }
}
