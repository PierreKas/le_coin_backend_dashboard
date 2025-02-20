package coin.cuisiniers.dashboard_backend.repository;

import coin.cuisiniers.dashboard_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
