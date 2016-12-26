package dog.dip.repository;

import dog.dip.entity.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by moneg on 25.12.2016.
 */
public interface DogRepository extends JpaRepository<Dog, Long> {

    @Query("select d from Dog d where d.name = :name")
    Dog findByName(@Param("name") String name);

    @Query("select d from Dog d where d.chip = :chip")
    Dog findByChip(@Param("chip") String chip);

    @Query("select d from Dog d where d.brand = :brand")
    Dog findByBrand(@Param("brand") String brand);

    @Query("select d from Dog d where d.pedigree = :pedigree")
    Dog findByPedigree(@Param("pedigree") String pedigree);
}
