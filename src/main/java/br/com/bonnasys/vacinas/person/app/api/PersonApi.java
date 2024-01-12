package br.com.bonnasys.vacinas.person.app.api;

import io.swagger.v3.oas.annotations.headers.Header;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Tag(name= "Person")
@RequestMapping("v1/person")
public interface PersonApi {


    @PostMapping
    @ApiResponse(responseCode ="201", headers = @Header(name = "Location", schema = @Schema(implementation = UUID.class)))
    ResponseEntity<Void> create();


    @GetMapping("{id}")
    ResponseEntity<?>findById (@PathVariable String id);


}
