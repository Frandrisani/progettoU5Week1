package francescoandrisani.progettoU5Week1.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("application.properties")
public class AppConfig {

    // ------------------------ EDIFICI --------------------------
    @Bean(name = "Edificio1")
    public Edificio Edificio1() {
        return new Edificio("Edificio 1", "Via Roma 34", "Milano", "Lombardia", 11000, "Italia");
    }

    @Bean(name = "Edificio2")
    public Edificio Edificio2() {
        return new Edificio("Edificio 2", "Via Santa Maria 1234", "Roma", "Lombardia", 32484, "Italia");
    }

    @Bean(name = "Edificio3")
    public Edificio Edificio3() {
        return new Edificio("Edificio 3", "Alexanderplatz", "Berlino", "Berlino", 40000, "Germania");
    }

    // ------------------------ POSTAZIONI --------------------------
    @Bean(name = "Postazione1")
    public Postazione Postazione1() {
        return new Postazione("Postazione 1", TipoPostazione.OPENSPACE, 18, Edificio1());
    }

    @Bean(name = "Postazione2")
    public Postazione Postazione2() {
        return new Postazione("Postazione 2", TipoPostazione.PRIVATO, 6, Edificio1());
    }

    @Bean(name = "Postazione3")
    public Postazione Postazione3() {
        return new Postazione("Postazione 3", TipoPostazione.PRIVATO, 3, Edificio1());
    }

    @Bean(name = "Postazione4")
    public Postazione Postazione4() {
        return new Postazione("Postazione 4", TipoPostazione.SALA_RIUNIONI, 9, Edificio2());
    }

    @Bean(name = "Postazione5")
    public Postazione Postazione5() {
        return new Postazione("Postazione 5", TipoPostazione.OPENSPACE, 32, Edificio2());
    }

    @Bean(name = "Postazione6")
    public Postazione Postazione6() {
        return new Postazione("Postazione 6", TipoPostazione.SALA_RIUNIONI, 10, Edificio2());
    }

    @Bean(name = "Postazione7")
    public Postazione Postazione7() {
        return new Postazione("Postazione 7", TipoPostazione.PRIVATO, 4, Edificio2());
    }

    @Bean(name = "Postazione8")
    public Postazione Postazione8() {
        return new Postazione("Postazione 8", TipoPostazione.PRIVATO, 10, Edificio3());
    }
    @Bean(name = "Postazione9")
    public Postazione Postazione9() {
        return new Postazione("Postazione 9", TipoPostazione.SALA_RIUNIONI, 20, Edificio3());
    }
    @Bean(name = "Postazione10")
    public Postazione Postazione10() {
        return new Postazione("Postazione 10", TipoPostazione.OPENSPACE, 50, Edificio3());
    }
    @Bean(name = "Postazione11")
    public Postazione Postazione11() {
        return new Postazione("Postazione 11", TipoPostazione.PRIVATO, 10, Edificio3());
    }
}
