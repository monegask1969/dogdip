package dog.dip.service;

import dog.dip.entity.DogShow;

import java.util.List;

/**
 * Created by moneg on 25.12.2016.
 */
public interface DogShowService {
    DogShow addDogShow(DogShow dogShow);
    void delete(long id);
    DogShow getByTitle(String title);
    DogShow editDogShow(DogShow dogShow);
    List<DogShow> getAll();
}
