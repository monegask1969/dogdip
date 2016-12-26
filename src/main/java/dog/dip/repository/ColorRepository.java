package dog.dip.repository;

/**
 * Created by moneg on 25.12.2016.
 */
import dog.dip.entity.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ColorRepository extends JpaRepository<Color, Long> {

    @Query("select c from Color c where c.title = :title")
    Color findByTitle(@Param("title") String title);
}
