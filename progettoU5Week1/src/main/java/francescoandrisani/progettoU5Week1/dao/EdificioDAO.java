package francescoandrisani.progettoU5Week1.dao;

import francescoandrisani.progettoU5Week1.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdificioDAO extends JpaRepository<Edificio, Integer> {

    boolean existByName(String name);
}
