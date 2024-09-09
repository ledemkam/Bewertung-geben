package tech.kte.bewertung_geben.mapper;


import org.springframework.stereotype.Component;
import tech.kte.bewertung_geben.dto.ClientDTO;
import tech.kte.bewertung_geben.model.Client;

import java.util.function.Function;

@Component
public class ClientDTOMapper implements Function<Client, ClientDTO> {
    @Override
    public ClientDTO apply(Client client) {
        return new ClientDTO(client.getId(), client.getEmail(), client.getTelephon());
    }
}
