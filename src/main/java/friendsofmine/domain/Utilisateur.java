package friendsofmine.domain;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

/**
 * Created by aymer on 27/02/2017.
 */
public class Utilisateur {

    @NotEmpty @NotNull
    private String nom;
    @NotEmpty @NotNull
    private String prenom;
    @Email @NotNull
    private String mail;
    @NotNull @Pattern(regexp = "M|F")
    private String sexe;
    private Date date;

    public Utilisateur(String nom, String prenom, String mail, String sexe, Date date) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.sexe = sexe;
        this.date = date;
    }

    public Utilisateur(String nom, String prenom, String mail, String sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.sexe = sexe;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMail() {
        return mail;
    }

    public String getSexe() {
        return sexe;
    }

    public Date getDate() {
        return date;
    }
}
