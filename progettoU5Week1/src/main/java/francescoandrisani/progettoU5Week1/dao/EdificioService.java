package francescoandrisani.progettoU5Week1.dao;
import francescoandrisani.progettoU5Week1.entities.Edificio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EdificioService {

    @Autowired
    private EdificioDAO edificioDAO;

    public void save(Edificio newEdificio) {


        edificioDAO.save(newEdificio);
        log.info("Edificio salvato con successo!");
    }


}
