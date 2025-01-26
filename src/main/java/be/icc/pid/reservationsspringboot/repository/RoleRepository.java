package be.icc.pid.reservationsspringboot.repository;

import be.icc.pid.reservationsspringboot.model.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByRole(String role);
}

