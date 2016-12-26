package dog.dip.service;

import dog.dip.entity.Contest;

import java.util.List;

/**
 * Created by moneg on 25.12.2016.
 */
public interface ContestService {
    Contest addContest(Contest contest);
    void delete(long id);
    Contest getByTitle(String title);
    Contest editContest(Contest contest);
    List<Contest> getAll();
}
