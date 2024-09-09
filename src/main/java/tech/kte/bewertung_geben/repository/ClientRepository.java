package tech.kte.bewertung_geben.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.kte.bewertung_geben.model.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

    Client findByEmail(String email);
}
