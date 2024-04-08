package francescoandrisani.progettoU5Week1.dao;

import francescoandrisani.progettoU5Week1.entities.Prenotazione;
import francescoandrisani.progettoU5Week1.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrenotazioneDAO extends JpaRepository<Prenotazione, Long> {
}
