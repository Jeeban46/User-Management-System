package USER.Management.User_Management.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import USER.Management.User_Management.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail (String email);
}
