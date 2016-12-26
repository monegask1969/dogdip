package dog.dip.service.Impl;

import dog.dip.entity.Breed;
import dog.dip.repository.BreedRepository;
import dog.dip.service.BreedService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by moneg on 25.12.2016.
 */
public class BreedServiceImpl implements BreedService{
    @Autowired
    BreedRepository breedRepository;

    @Override
    public Breed addBreed(Breed breed) {
        Breed savedBreed = breedRepository.saveAndFlush(breed);

        return savedBreed;
    }

    @Override
    public void delete(long id) {
        breedRepository.delete(id);
    }

    @Override
    public Breed getByTitle(String title) {
        return breedRepository.findByTitle(title);
    }

    @Override
    public Breed editBreed(Breed breed) {
        return breedRepository.saveAndFlush(breed);
    }

    @Override
    public List<Breed> getAll() {
        return breedRepository.findAll();
    }
}
