package del.ac.praktikum.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class PenggunaRepository {
    public PenggunaRepository(){

    }
    @GetMapping("/pengguna")
    public ModelAndView showPenggunaPage(){
        ModelAndView mv = new ModelAndView("pengguna");
        return mv;
    }
}
