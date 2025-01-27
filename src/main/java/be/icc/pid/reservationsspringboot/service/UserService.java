package be.icc.pid.reservationsspringboot.service;

import java.util.ArrayList;
import java.util.List;

import be.icc.pid.reservationsspringboot.model.User;
import be.icc.pid.reservationsspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();

        repository.findAll().forEach(users::add);

        return users;
    }

    public User getUser(String id) {
        int indice = Integer.parseInt(id);

        return repository.findById(indice);
    }

    public void addUser(User user) {
        repository.save(user);
    }

    public void updateUser(String id, User user) {
        repository.save(user);
    }

    public void deleteUser(String id) {
        Long indice = (long) Integer.parseInt(id);

        repository.deleteById(indice);
    }
}
