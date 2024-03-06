package dio.rafael.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dio.rafael.springdatajpa.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    
}
