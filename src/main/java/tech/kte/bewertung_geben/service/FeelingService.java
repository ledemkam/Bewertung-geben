package tech.kte.bewertung_geben.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tech.kte.bewertung_geben.enums.FeelingType;
import tech.kte.bewertung_geben.model.Client;
import tech.kte.bewertung_geben.model.Feeling;
import tech.kte.bewertung_geben.repository.FeelingRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class FeelingService {

  final FeelingRepository feelingRepository;
  final ClientService clientService;

  public void createFeeling(Feeling feeling) {
   Client clientInDB = clientService.getOrCreateClient(feeling.getClient());
   feeling.setClient(clientInDB);
   //analyzeFeeling(feeling);
      if(feeling.getText().contains("no")) {
          feeling.setType(FeelingType.BAD);
      } else {
          feeling.setType(FeelingType.GOOD);
      }
   feelingRepository.save(feeling);
  }

    public List<Feeling> getAllFeeling(FeelingType type) {
      if (type == null) {
          return feelingRepository.findAll();
      }else {
          return feelingRepository.findByType(type);
      }
    }

    public void deleteFeeling(int id) {
      feelingRepository.deleteById(id);
    }
}
