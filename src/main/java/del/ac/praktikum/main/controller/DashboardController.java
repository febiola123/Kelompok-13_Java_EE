package del.ac.praktikum.main.controller;

import del.ac.praktikum.main.model.Booking;
import del.ac.praktikum.main.model.Bandara;
import del.ac.praktikum.main.service.BandaraService;
import del.ac.praktikum.main.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class DashboardController {

    @Autowired
    private BookingService service;

    @Autowired
    private BandaraService bandaraService;

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public ModelAndView getListAdminOrder(@ModelAttribute("username") String username, Model model) {
        List<Booking> bookingList = service.listAll();
        model.addAttribute("getAllBooking", bookingList);

        ModelAndView adminView = new ModelAndView("admin");
        adminView.addObject("username", username);

        return adminView;
    }

    @RequestMapping(value = "/pengguna")
    public ModelAndView getListMemberOrder(Model model) {
        List<Booking> bookingList = service.listAll();
        model.addAttribute("getAllBooking", bookingList);
        return new ModelAndView("pengguna");
    }

    @RequestMapping(value = "/delete/{id}")
    public ModelAndView deleteBooking(@PathVariable(name = "id") long id) {
        ModelAndView adminView = new ModelAndView("redirect:/admin");
        service.delete(id);
        return adminView;
    }

    @RequestMapping(value = "/tambah_bandara")
    public ModelAndView viewTambahBandara(Model model){
        Bandara bandara = new Bandara();
        model.addAttribute("bandara", bandara);
        return new ModelAndView("tambah_bandara");
    }

    @RequestMapping(value = "/simpan_bandara", method = RequestMethod.POST)
    public ModelAndView tambahBandara(@ModelAttribute("bandara") Bandara bandara){
        bandaraService.create(bandara);
        return new ModelAndView("redirect:/admin");
    }


}
