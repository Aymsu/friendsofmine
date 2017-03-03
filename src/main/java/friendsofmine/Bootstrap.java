package friendsofmine;

import friendsofmine.domain.Activite;
import friendsofmine.domain.Utilisateur;
import friendsofmine.service.InitialisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

/**
 * Created by merli on 27/02/2017.
 */
@Component
public class Bootstrap {

    @Autowired
    private InitialisationService initialisationService;

    @PostConstruct
    public void init() {
        initialisationService.initDonnees();
    }

    public ArrayList<Utilisateur> getUtilisateurs() {
        return initialisationService.getUtilisateurs();
    }

    public ArrayList<Activite> getActivites() {
        return initialisationService.getActivites();
    }
}