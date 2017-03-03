package friendsofmine.service;

import friendsofmine.domain.Activite;
import friendsofmine.domain.Utilisateur;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Aymsu on 27/02/2017.
 */
@Service
public class InitialisationService {
    private ArrayList<Activite> activites;
    private ArrayList<Utilisateur> utilisateurs;
    private Calendar cal;
    private Date date;

    public InitialisationService() {
    }

    public void initDonnees() {
        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 1988);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        date = cal.getTime();

        Utilisateur util = new Utilisateur("Dupont", "Jeanne", "jd@jd.com", "F", date);
        Activite act = new Activite("unTitre", "unDescriptif");

        activites = new ArrayList<>();
        utilisateurs = new ArrayList<>();

        utilisateurs.add(util);
        utilisateurs.add(util);
        utilisateurs.add(util);
        utilisateurs.add(util);

        activites.add(act);
        activites.add(act);
        activites.add(act);
        activites.add(act);
        activites.add(act);
    }

    public ArrayList<Activite> getActivites() {
        return activites;
    }

    public ArrayList<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }
}