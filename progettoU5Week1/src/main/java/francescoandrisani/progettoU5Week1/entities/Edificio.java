package francescoandrisani.progettoU5Week1.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "edifici")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Edificio {

    //Attributi
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int id_edificio;
    private String nome;
    private String indirizzo;
    private String citta;
    private String provincia;
    private int cap;
    private String stato;
    @OneToMany(mappedBy = "edificio")
    private List<Postazione> postazioni;

    //Costruttore
    public Edificio(String nome, String indirizzo, String citta, String provincia, int cap, String stato) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.citta = citta;
        this.provincia = provincia;
        this.cap = cap;
        this.stato = stato;

    }

}
