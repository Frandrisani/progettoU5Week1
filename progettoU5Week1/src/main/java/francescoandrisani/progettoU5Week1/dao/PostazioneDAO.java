package francescoandrisani.progettoU5Week1.dao;
import francescoandrisani.progettoU5Week1.entities.Postazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface PostazioneDAO extends JpaRepository<Postazione, UUID> {
}
