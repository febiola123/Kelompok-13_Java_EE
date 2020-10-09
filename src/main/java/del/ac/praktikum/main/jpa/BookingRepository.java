package del.ac.praktikum.main.jpa;

import del.ac.praktikum.main.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {

}
