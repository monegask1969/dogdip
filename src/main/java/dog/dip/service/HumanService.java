package dog.dip.service;

import dog.dip.entity.Human;

import java.util.List;

/**
 * Created by moneg on 25.12.2016.
 */
public interface HumanService {
    Human addHuman(Human human);
    void delete(long id);
    Human getByFname(String fname);
    Human getByCountry(String country);
    Human getByUserName(String username);
    Human getByPassword(String password);
    Human editHuman(Human human);
    List<Human> getAll();
}
