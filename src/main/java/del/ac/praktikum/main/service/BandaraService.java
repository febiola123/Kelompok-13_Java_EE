package del.ac.praktikum.main.service;

import del.ac.praktikum.main.jpa.BandaraRepository;
import del.ac.praktikum.main.model.Bandara;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BandaraService {

    @Autowired
    private BandaraRepository bandaraRepository;

    public void create(Bandara bandara) {
        bandaraRepository.save(bandara);
    }

}
