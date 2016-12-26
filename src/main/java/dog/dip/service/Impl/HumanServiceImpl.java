package dog.dip.service.Impl;

import dog.dip.entity.Human;
import dog.dip.repository.HumanRepository;
import dog.dip.service.HumanService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by moneg on 25.12.2016.
 */
public class HumanServiceImpl implements HumanService {
    @Autowired
    HumanRepository humanRepository;

    @Override
    public Human addHuman(Human human) {
        Human saveHuman = humanRepository.saveAndFlush(human);
        return saveHuman;
    }

    @Override
    public void delete(long id) {
    humanRepository.delete(id);
    }

    @Override
    public Human getByFname(String fname) {
        return humanRepository.findByFname(fname);
    }

    @Override
    public Human getByCountry(String country) {
        return humanRepository.findByCountry(country);
    }

    @Override
    public Human getByUserName(String username) {
        return humanRepository.findByUserName(username);
    }

    @Override
    public Human getByPassword(String password) {
        return humanRepository.findByPassword(password);
    }

    @Override
    public Human editHuman(Human human) {
        return humanRepository.saveAndFlush(human);
    }

    @Override
    public List<Human> getAll() {
        return humanRepository.findAll();
    }
}
