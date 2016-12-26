package dog.dip.service.Impl;

import dog.dip.entity.Contest;
import dog.dip.repository.ContestRepository;
import dog.dip.service.ContestService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by moneg on 25.12.2016.
 */
public class ContestServiceImpl implements ContestService{
    @Autowired
    ContestRepository contestRepository;

    @Override
    public Contest addContest(Contest contest) {
        Contest saveContest = contestRepository.saveAndFlush(contest);
        return saveContest;
    }

    @Override
    public void delete(long id) {
        contestRepository.delete(id);
    }

    @Override
    public Contest getByTitle(String title) {
        return contestRepository.findByTitle(title);
    }

    @Override
    public Contest editContest(Contest contest) {
        return contestRepository.saveAndFlush(contest);
    }

    @Override
    public List<Contest> getAll() {
        return contestRepository.findAll();
    }
}
