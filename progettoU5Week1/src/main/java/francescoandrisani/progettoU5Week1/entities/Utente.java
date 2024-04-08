package francescoandrisani.progettoU5Week1.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "utenti")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Utente {
    //Attributi
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id_utente;
    private String username;
    private String nome;
    private String cognome;
    private String email;
    @OneToMany(mappedBy = "utenti")
    private List<Prenotazione> prenotazioni;

    //Costruttore
    public Utente(String username,String nome, String cognome, String email) {
        this.username = username;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
    }
}
