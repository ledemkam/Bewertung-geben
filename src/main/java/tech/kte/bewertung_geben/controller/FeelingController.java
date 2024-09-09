package tech.kte.bewertung_geben.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import tech.kte.bewertung_geben.enums.FeelingType;
import tech.kte.bewertung_geben.model.Feeling;
import tech.kte.bewertung_geben.service.FeelingService;

import java.util.List;



@AllArgsConstructor
@RestController
@RequestMapping(path = "feeling", produces = MediaType.APPLICATION_JSON_VALUE)
public class FeelingController {

    final FeelingService feelingService;

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createFeeling(@RequestBody Feeling feeling) {
      feelingService.createFeeling(feeling);
    }

    @GetMapping
    public List<Feeling> getFeeling(@RequestParam(required = false) FeelingType type) {

        return feelingService.getAllFeeling(type);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "{id}")
    public void deleteFeeling(@PathVariable int id) {
        feelingService.deleteFeeling(id);

    }




}
