package p76.playground.rest;

import org.springframework.data.repository.CrudRepository;
import p76.playground.db.School;

import java.util.List;

public interface SchoolRepository extends CrudRepository<School, Long> {

    List<School> findByName(String name);
}
