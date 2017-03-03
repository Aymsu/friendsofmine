package friendsofmine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by aymer on 27/02/2017.
 */

@Controller
public class IndexController {

    @RequestMapping("/")
    public String map(){
        return "index";
    }


}
