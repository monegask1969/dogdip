package dog.dip.repository;

import dog.dip.entity.DogShow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by moneg on 25.12.2016.
 */
public interface DogShowRepository extends JpaRepository<DogShow, Long> {

    @Query("select d from DogShow d where d.title = :title")
    DogShow findByTitle(@Param("title") String title);
}
