package dog.dip.repository;

import dog.dip.entity.Breed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by moneg on 25.12.2016.
 */
public interface BreedRepository extends JpaRepository<Breed, Long> {

    @Query("select b from Breed b where b.title = :title")
    Breed findByTitle(@Param("title") String title);
}
