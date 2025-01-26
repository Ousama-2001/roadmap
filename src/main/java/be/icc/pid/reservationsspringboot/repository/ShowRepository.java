package be.icc.pid.reservationsspringboot.repository;


import be.icc.pid.reservationsspringboot.model.Location;

import be.icc.pid.reservationsspringboot.model.Show;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ShowRepository extends CrudRepository<Show, Long> {
    Show findBySlug(String slug);

    Show findByTitle(String title);

    List<Show> findByLocation(Location location);

}