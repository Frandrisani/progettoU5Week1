package francescoandrisani.progettoU5Week1.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "postazioni")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Postazione {

    //Attributi
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_postazione;
    private String descrizione;

    @Enumerated(EnumType.STRING)
    private TipoPostazione tipo;
    private int maxPersone;

    @Enumerated(EnumType.STRING)
    private StatoPostazione stato;
    @ManyToOne
    @JoinColumn(name = "id_edificio", nullable = false)
    private Edificio edificio;

    @ManyToMany(mappedBy = "categoriesList")
    private List<Prenotazione> prenotazioniList;

    //Costruttore
    public Postazione(String descrizione, TipoPostazione tipo, int maxPersone, Edificio edificio) {
        this.descrizione = descrizione;
        this.tipo = tipo;
        this.maxPersone = maxPersone;
        this.edificio = edificio;
    }

}
