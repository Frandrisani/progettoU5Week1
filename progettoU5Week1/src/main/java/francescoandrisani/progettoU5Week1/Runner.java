package francescoandrisani.progettoU5Week1;
import francescoandrisani.progettoU5Week1.dao.EdificioService;
import francescoandrisani.progettoU5Week1.dao.PostazioneService;
import francescoandrisani.progettoU5Week1.entities.Edificio;
import francescoandrisani.progettoU5Week1.entities.Postazione;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Runner implements CommandLineRunner {

    @Autowired
    private EdificioService edificioService;
    @Autowired
    private PostazioneService postazioneService;

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ProgettoU5Week1Application.class);
        try {
            log.info("Salviamo i dati nel database");
            edificioService.save(ctx.getBean("Edificio1", Edificio.class));
            edificioService.save(ctx.getBean("Edificio2", Edificio.class));
            edificioService.save(ctx.getBean("Edificio3", Edificio.class));
            postazioneService.save(ctx.getBean("Postazione1", Postazione.class));
            postazioneService.save(ctx.getBean("Postazione2", Postazione.class));
            postazioneService.save(ctx.getBean("Postazione3", Postazione.class));
            postazioneService.save(ctx.getBean("Postazione4", Postazione.class));
            postazioneService.save(ctx.getBean("Postazione5", Postazione.class));
            postazioneService.save(ctx.getBean("Postazione6", Postazione.class));
            postazioneService.save(ctx.getBean("Postazione7", Postazione.class));
            postazioneService.save(ctx.getBean("Postazione8", Postazione.class));
            postazioneService.save(ctx.getBean("Postazione9", Postazione.class));
            postazioneService.save(ctx.getBean("Postazione10", Postazione.class));
            postazioneService.save(ctx.getBean("Postazione11", Postazione.class));
            log.info("I dati sono stati salvati nel database");


        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        finally {
            ctx.close();
        }

    }



}
