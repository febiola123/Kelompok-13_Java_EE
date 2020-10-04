package del.ac.praktikum.main.controller;

import del.ac.praktikum.main.jpa.LoginRepository;
import del.ac.praktikum.main.jpa.RoleRepository;
import del.ac.praktikum.main.jpa.UserRepository;
import del.ac.praktikum.main.model.Role;
import del.ac.praktikum.main.model.User;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class LoginController {
    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private LoginRepository loginRepository;

    public LoginController(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @GetMapping("/login")
    public ModelAndView showLoginPage() {
        List<Role> listRoles = roleRepository.findAll();
        //System.out.println(listRoles.size());

        ModelAndView mv = new ModelAndView("login");
        mv.addObject("roles", listRoles);
        mv.addObject("user", new User());
        return mv;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView submitLogin(@ModelAttribute User user, BindingResult bindingResult, Model model){

        model.addAttribute("user", user);
        User userRole = userRepository.findByUsername(user.getUsername());

        System.out.println(userRole.getRoleid());

        if(userRole.getRoleid() == 1){
            return new ModelAndView("redirect:/admin");
        }
        if(userRole.getRoleid() == 2){
            return new ModelAndView("redirect:/pengguna");
        }else{
            return new ModelAndView("redirect:/login");
        }
    }
}
