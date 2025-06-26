package tech.caique.crudusuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.caique.crudusuarios.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // traz todos os métodos básicos pra facilitar a vida: save, findById, findAll, deleteById ...
}
