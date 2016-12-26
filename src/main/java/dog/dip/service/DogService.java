package dog.dip.service;

import dog.dip.entity.Dog;

import java.util.List;

/**
 * Created by moneg on 25.12.2016.
 */
public interface DogService {
    Dog addDog(Dog dog);
    void delete(long id);
    Dog getByName(String name);
    Dog getByChip(String chip);
    Dog getByBrand(String brand);
    Dog getByPedigree(String pedigree);
    Dog editDog(Dog dog);
    List<Dog> getAll();
}
