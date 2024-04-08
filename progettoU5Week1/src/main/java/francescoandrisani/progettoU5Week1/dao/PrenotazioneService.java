package francescoandrisani.progettoU5Week1.dao;
import francescoandrisani.progettoU5Week1.entities.Prenotazione;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PrenotazioneService {

    @Autowired
    private PrenotazioneDAO prenotazioneDAO;

    public void save(Prenotazione newPrenotazione) {
        prenotazioneDAO.save(newPrenotazione);
        log.info("Utente salvato con successo!");
    }
}
