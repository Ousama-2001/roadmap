package be.icc.pid.reservationsspringboot.repository;

import java.time.LocalDateTime;
import java.util.List;

import be.icc.pid.reservationsspringboot.model.Location;
import be.icc.pid.reservationsspringboot.model.Representation;
import be.icc.pid.reservationsspringboot.model.Show;
import org.springframework.data.repository.CrudRepository;

public interface RepresentationRepository extends CrudRepository<Representation, Long> {
    List<Representation> findByShow(Show show);
    List<Representation> findByLocation(Location location);
    List<Representation> findByWhen(LocalDateTime when);
}

