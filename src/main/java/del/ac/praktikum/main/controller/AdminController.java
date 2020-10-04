package del.ac.praktikum.main.controller;

import del.ac.praktikum.main.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AdminController {

    public AdminController() {
    }

    @GetMapping("/admin")
    public ModelAndView showAdminPage(){

        ModelAndView mv = new ModelAndView("admin");
        //mv.addObject("user", new User());
        return mv;
    }
}
