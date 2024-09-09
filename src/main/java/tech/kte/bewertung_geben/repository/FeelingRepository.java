package tech.kte.bewertung_geben.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.kte.bewertung_geben.enums.FeelingType;
import tech.kte.bewertung_geben.model.Feeling;

import java.util.List;

public interface FeelingRepository extends JpaRepository<Feeling, Integer> {
    List<Feeling> findByType(FeelingType type);
}
