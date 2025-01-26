package be.icc.pid.reservationsspringboot.repository;


import be.icc.pid.reservationsspringboot.model.Type;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TypeRepository extends CrudRepository<Type, Long> {
    Type findByType(String type);
    Optional<Type> findById(Long id);
}

