package del.ac.praktikum.main.service;

import del.ac.praktikum.main.jpa.BookingRepository;
import del.ac.praktikum.main.model.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository repository;

    public List<Booking> listAll(){
        return repository.findAll();
    }

    public List<Booking> listAllByUsername(String username){
        return repository.findByUsername(username);
    }

    public void create(Booking booking){
        repository.save(booking);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }
}
