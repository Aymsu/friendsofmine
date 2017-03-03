package friendsofmine.controller;

import friendsofmine.Bootstrap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Aymsu on 27/02/2017.
 */
@Controller
public class ActiviteController {
    @Autowired
    private Bootstrap boot;

    @RequestMapping(value = "/activites")
    public String list(Model model) {
        model.addAttribute("activites", boot.getActivites());
        return "activites";
    }
}