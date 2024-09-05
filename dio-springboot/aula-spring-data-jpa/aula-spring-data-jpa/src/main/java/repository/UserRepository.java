package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	void saveAll(org.springframework.boot.autoconfigure.security.SecurityProperties.User user);


}
