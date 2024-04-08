package francescoandrisani.progettoU5Week1.dao;
import francescoandrisani.progettoU5Week1.entities.Utente;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class UtenteService {

    @Autowired
    private UtenteDAO utenteDAO;

    public void save(Utente newUtente) {
        utenteDAO.save(newUtente);
        log.info("Utente salvato con successo!");
    }
}
