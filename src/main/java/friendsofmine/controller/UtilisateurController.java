package friendsofmine.controller;

import friendsofmine.Bootstrap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by aymer on 27/02/2017.
 */
@Controller
public class UtilisateurController {

    @Autowired
    private Bootstrap boot;

    @RequestMapping(value = "/utilisateurs")
    public String list(Model model) {
        model.addAttribute("utilisateurs", boot.getUtilisateurs());
        return "utilisateurs";
    }
}
