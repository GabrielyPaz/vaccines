//package br.com.bonnasys.vacinas.app.listener;
//
//
//import lombok.AllArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Component;
//import br.com.bonnasys.vacinas.domain.enums.Json;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.messaging.handler.annotation.Payload;
//import br.com.bonnasys.vacinas.app.listener.request.CreateVaccineRequest;
//import br.com.bonnasys.vacinas.domain.usecase.vaccine.create.CreateVaccineCommand;
//import br.com.bonnasys.vacinas.domain.usecase.vaccine.create.CreateVaccineUseCase;
//
//
//@Slf4j
//@Component
//@AllArgsConstructor
//public class CreateVaccineListener {
//
//    public static final String LISTENER_ID = "createVaccineListener";
//    private final CreateVaccineUseCase createVaccineUseCase;
//
//    @RabbitListener(id = LISTENER_ID, queues = "${amqp.queues.create-vaccines.queue}")
//    public void onCreateVaccine(@Payload final String message) {
//        CreateVaccineRequest aRequest = Json.readValue(message, CreateVaccineRequest.class);
//        CreateVaccineCommand command = new CreateVaccineCommand(aRequest.name(), aRequest.producer());
//        createVaccineUseCase.execute(command);
//    }
//}
