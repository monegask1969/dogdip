package dog.dip.service;

import dog.dip.entity.Breed;

import java.util.List;

/**
 * Created by moneg on 25.12.2016.
 */
public interface BreedService {
    Breed addBreed(Breed breed);
    void delete(long id);
    Breed getByTitle(String title);
    Breed editBreed(Breed breed);
    List<Breed> getAll();
}
