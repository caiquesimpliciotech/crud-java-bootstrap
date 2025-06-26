package tech.caique.crudusuarios.service;

import org.springframework.stereotype.Service;
import tech.caique.crudusuarios.model.User;
import tech.caique.crudusuarios.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> findAll() {
        return repository.findAll();
    }

    public Optional<User> findById(Long id) {
        return repository.findById(id);
    }

    public User save(User user) {
        return repository.save(user);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
