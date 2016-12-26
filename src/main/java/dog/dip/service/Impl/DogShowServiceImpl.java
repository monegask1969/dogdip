package dog.dip.service.Impl;

import dog.dip.entity.DogShow;
import dog.dip.repository.DogShowRepository;
import dog.dip.service.DogShowService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by moneg on 25.12.2016.
 */
public class DogShowServiceImpl implements DogShowService {
    @Autowired
    DogShowRepository dogShowRepository;

    @Override
    public DogShow addDogShow(DogShow dogShow) {
        DogShow saveDogShow = dogShowRepository.saveAndFlush(dogShow);
        return saveDogShow;
    }

    @Override
    public void delete(long id) {
    dogShowRepository.delete(id);
    }

    @Override
    public DogShow getByTitle(String title) {
        return dogShowRepository.findByTitle(title);
    }

    @Override
    public DogShow editDogShow(DogShow dogShow) {
        return dogShowRepository.saveAndFlush(dogShow);
    }

    @Override
    public List<DogShow> getAll() {
        return dogShowRepository.findAll();
    }
}
