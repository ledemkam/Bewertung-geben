package tech.kte.bewertung_geben.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tech.kte.bewertung_geben.dto.ClientDTO;
import tech.kte.bewertung_geben.mapper.ClientDTOMapper;
import tech.kte.bewertung_geben.model.Client;
import tech.kte.bewertung_geben.repository.ClientRepository;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.stream.Stream;

@AllArgsConstructor
@Service
public class ClientService {

    final ClientRepository clientRepository;
    final ClientDTOMapper clientDTOMapper;

    public  void createClient(Client client) {
        Client clientInDB = clientRepository.findByEmail(client.getEmail());
        if (clientInDB == null) {
            clientRepository.save(client);
        }

    }

    public Stream<ClientDTO> getAllClients() {
        return  clientRepository.findAll()
                .stream()
                .map(clientDTOMapper);

    }

    public Client getOneClient(int id) {
        Optional<Client> existingsClient = clientRepository.findById(id);
        return existingsClient.orElseThrow(
                () -> new EntityNotFoundException("Client with id " + id + " not found")
        );
    }

    public Client getOrCreateClient(Client clientToCreate) {
        Client clientInDB = clientRepository.findByEmail(clientToCreate.getEmail());
        if (clientInDB == null) {
            clientInDB = clientRepository.save(clientToCreate);
        }
        return clientInDB;
    }

    public void updateClient(int id, Client clientToUpdate) {
      Client clientInDB = getOneClient(id);
      if (clientInDB.getId() == clientToUpdate.getId()) {
      clientInDB.setEmail(clientToUpdate.getEmail());
      clientInDB.setTelephon(clientToUpdate.getTelephon());

      clientRepository.save(clientToUpdate);
    }

    }
}
