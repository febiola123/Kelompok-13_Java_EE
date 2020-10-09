package del.ac.praktikum.main.jpa;

import del.ac.praktikum.main.model.Bandara;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BandaraRepository extends JpaRepository<Bandara, Long> {
}
