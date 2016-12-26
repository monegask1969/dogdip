package dog.dip.service.Impl;

import dog.dip.entity.Dog;
import dog.dip.repository.DogRepository;
import dog.dip.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by moneg on 25.12.2016.
 */
public class DogServiceImpl implements DogService{
    @Autowired
    DogRepository dogRepository;


    @Override
    public Dog addDog(Dog dog) {
        Dog saveDog = dogRepository.saveAndFlush(dog);
        return saveDog;
    }

    @Override
    public void delete(long id) {
        dogRepository.delete(id);
    }

    @Override
    public Dog getByName(String name) {
        return dogRepository.findByName(name);
    }

    @Override
    public Dog getByChip(String chip) {
        return dogRepository.findByChip(chip);
    }

    @Override
    public Dog getByBrand(String brand) {
        return dogRepository.findByBrand(brand);
    }

    @Override
    public Dog getByPedigree(String pedigree) {
        return dogRepository.findByPedigree(pedigree);
    }

    @Override
    public Dog editDog(Dog dog) {
        return dogRepository.saveAndFlush(dog);
    }

    @Override
    public List<Dog> getAll() {
        return dogRepository.findAll();
    }
}
