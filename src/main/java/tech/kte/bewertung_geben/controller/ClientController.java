package tech.kte.bewertung_geben.controller;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.kte.bewertung_geben.advice.ApplicationControllerAdvice;
import tech.kte.bewertung_geben.dto.ClientDTO;
import tech.kte.bewertung_geben.model.Client;
import tech.kte.bewertung_geben.service.ClientService;


import java.util.stream.Stream;


import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@AllArgsConstructor
@RestController
@RequestMapping(path = "client")
public class ClientController {

       ClientService  clientService;

      @ResponseStatus(value = HttpStatus.CREATED)
      @PostMapping(consumes = APPLICATION_JSON_VALUE)
      public void createClient(@RequestBody Client client) {
         clientService.createClient(client);
      }

      @GetMapping(produces = APPLICATION_JSON_VALUE)
      public Stream<ClientDTO> getAllClients() {
          return  clientService.getAllClients();
      }

      @GetMapping(path = "{id}", produces = APPLICATION_JSON_VALUE)
      public ResponseEntity getClientById(@PathVariable int id) {
          try {
              Client client = clientService.getOneClient(id);
              return ResponseEntity.ok(client);
          } catch (EntityNotFoundException exception) {
             return ResponseEntity.status(BAD_REQUEST).body(new ApplicationControllerAdvice.ErrorEntity(null,exception.getMessage()));
          }
      }

      @ResponseStatus(HttpStatus.NO_CONTENT)
      @PutMapping(path = "{id}", consumes = APPLICATION_JSON_VALUE)
      public void updateClient(@PathVariable int id, @RequestBody Client clientToUpdate) {
          clientService.updateClient(id, clientToUpdate);

      }


}
