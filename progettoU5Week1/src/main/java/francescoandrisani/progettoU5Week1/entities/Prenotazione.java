package francescoandrisani.progettoU5Week1.entities;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;


@Entity
@Table(name = "prenotazioni")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Prenotazione {

    //Attributi
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id_prenotazione;
    private LocalDateTime dataPrenotazione;
    private LocalTime oraInizio;
    private LocalTime oraFine;
    private int durata;
    private double costoOrario;
    private double costoTotale;
    @ManyToOne
    @JoinColumn(name = "id_utenti", nullable = false)
    private Utente utenti;
    @ManyToMany
    @JoinTable(name = "prenotazioni_postazioni",
            joinColumns = @JoinColumn(name = "prenotazioni_id"),
            inverseJoinColumns = @JoinColumn(name = "postazioni_id"))
    private List<Postazione> postazioneList;

    //Costruttore
    public Prenotazione(LocalDateTime dataPrenotazione, LocalTime oraInizio, LocalTime oraFine, Utente utenti) {
        this.dataPrenotazione = dataPrenotazione;
        this.oraInizio = oraInizio;
        this.oraFine = oraFine;
        this.utenti = utenti;
        this.durata = (int) oraFine.toSecondOfDay() - (int) oraInizio.toSecondOfDay();
        this.costoOrario = 12.0;
        this.costoTotale = this.costoOrario * this.durata;
    }

}
