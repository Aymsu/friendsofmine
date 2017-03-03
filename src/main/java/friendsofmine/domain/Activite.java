package friendsofmine.domain;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

/**
 * Created by aymer on 27/02/2017.
 */

public class Activite {

    @NotNull @NotEmpty
    private String titre;
    private String descriptif;

    public Activite(String t, String d){
        titre = t;
        descriptif = d;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescriptif() {
        return descriptif;
    }
}