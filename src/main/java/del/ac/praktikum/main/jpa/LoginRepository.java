package del.ac.praktikum.main.jpa;

import del.ac.praktikum.main.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login, String> {
    Login findByUsername(String username);
}
