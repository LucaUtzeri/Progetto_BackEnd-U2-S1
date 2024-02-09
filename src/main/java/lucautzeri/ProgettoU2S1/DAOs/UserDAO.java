package lucautzeri.ProgettoU2S1.DAOs;

import lucautzeri.ProgettoU2S1.classes.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDAO extends JpaRepository<User, String> {
    @Query("SELECT u FROM User u")
    List<User>findUser();
}
