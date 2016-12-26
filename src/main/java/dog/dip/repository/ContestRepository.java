package dog.dip.repository;

import dog.dip.entity.Contest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by moneg on 25.12.2016.
 */
public interface ContestRepository extends JpaRepository<Contest, Long> {

    @Query("select c from Contest c where c.title = :title")
    Contest findByTitle(@Param("title") String title);
}
