package francescoandrisani.progettoU5Week1.dao;
import francescoandrisani.progettoU5Week1.entities.Postazione;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PostazioneService {
    @Autowired
    private PostazioneDAO postazioneDAO;

    public void save(Postazione newPostazione) {
        postazioneDAO.save(newPostazione);
        log.info("Postazione salvata con successo!");
    }
}
