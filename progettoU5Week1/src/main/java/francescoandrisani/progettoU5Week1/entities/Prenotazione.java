package francescoandrisani.progettoU5Week1.entities;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.time.LocalTime;


@Entity
@Table(name = "prenotazioni")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id_prenotazione;
    private LocalDateTime dataPrenotazione;
    private LocalTime oraInizio;
    private LocalTime oraFine;
    @ManyToOne
    @JoinColumn(name = "id_utenti", nullable = false)
    private Utente utenti;


}
