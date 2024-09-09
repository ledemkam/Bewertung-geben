package tech.kte.bewertung_geben.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.kte.bewertung_geben.enums.FeelingType;

import static jakarta.persistence.CascadeType.MERGE;
import static jakarta.persistence.CascadeType.PERSIST;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "GEFÜHL")
public class Feeling {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String text;

    private FeelingType type;

    @ManyToOne(cascade = {PERSIST,MERGE})
    @JoinColumn(name = "KUNDE_ID")
    private Client client;



}
