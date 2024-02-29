package br.com.bonnasys.vacinas.infrastructure.configuration;

import br.com.bonnasys.vacinas.app.mapper.PatientMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class MapStructConfiguration {

    @Bean
    public PatientMapper patientMapper(){
        log.info("[patientMapper]: Starting patient mapper");
        return PatientMapper.INSTANCE;
    }

}
