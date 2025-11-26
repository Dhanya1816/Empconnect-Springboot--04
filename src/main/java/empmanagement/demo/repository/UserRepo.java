package empmanagement.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import empmanagement.demo.model.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
