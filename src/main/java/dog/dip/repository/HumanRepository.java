package dog.dip.repository;

import dog.dip.entity.Human;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by moneg on 25.12.2016.
 */
public interface HumanRepository extends JpaRepository<Human, Long> {

    @Query("select h from Human h where h.fname = :fname")
    Human findByFname(@Param("fname") String fname);

    @Query("select h from Human h where h.country = :country")
    Human findByCountry(@Param("country") String country);

    @Query("select h from Human h where h.username = :username")
    Human findByUserName(@Param("username") String username);

    @Query("select h from Human h where h.password = :password")
    Human findByPassword(@Param("password") String password);
}
