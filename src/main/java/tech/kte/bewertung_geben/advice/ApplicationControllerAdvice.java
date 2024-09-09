package tech.kte.bewertung_geben.advice;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;


import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


import static org.springframework.http.HttpStatus.BAD_REQUEST;

@ControllerAdvice
public class ApplicationControllerAdvice {

     @ResponseStatus(BAD_REQUEST)
     @ExceptionHandler({EntityNotFoundException.class})
     public  @ResponseBody ErrorEntity handleEntityNotFoundException(EntityNotFoundException exception) {
         return new ErrorEntity(null,exception.getMessage());
     }
     @ResponseStatus(BAD_REQUEST)
     @ExceptionHandler({RuntimeException.class})
     public  @ResponseBody ErrorEntity handleRuntimeException(RuntimeException exception) {
         return new ErrorEntity(null,exception.getMessage());
     }

    public static   record ErrorEntity(
            String message,
            String code
    ) {
    }



}
