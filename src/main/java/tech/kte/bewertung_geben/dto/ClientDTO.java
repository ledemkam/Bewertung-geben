package tech.kte.bewertung_geben.dto;

import jakarta.persistence.Column;

public record ClientDTO(
        int id,
        String email,
        String telephon
) {

}
