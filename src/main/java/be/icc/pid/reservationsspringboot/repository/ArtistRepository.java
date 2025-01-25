package be.icc.pid.reservationsspringboot.repository;

import java.util.List;

import be.icc.pid.reservationsspringboot.model.Artist;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist, Long> {
    List<Artist> findByLastname(String lastname);

    Artist findById(long id);
}

