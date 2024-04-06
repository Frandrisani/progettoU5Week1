package francescoandrisani.progettoU5Week1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.util.UUID;

@Entity
@Table(name = "postazioni")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Postazione {

    //Attributi
    private UUID id_postazione;
    private String descrizione;
    private TipoPostazione tipo;
    private int maxPersone;
    private StatoPostazione stato;
    @ManyToOne
    @JoinColumn(name = "id_edificio", nullable = false)
    private Edificio edificio;

    //Costruttore
    public Postazione(String descrizione, TipoPostazione tipo, int maxPersone, StatoPostazione stato, Edificio edificio) {
        this.descrizione = descrizione;
        this.tipo = tipo;
        this.maxPersone = maxPersone;
        this.stato = stato;
        this.edificio = edificio;
    }

}
