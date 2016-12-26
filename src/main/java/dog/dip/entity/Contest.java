package dog.dip.entity;

/**
 * Created by moneg on 24.12.2016.
 */
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "contest")
public class Contest {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long contest_id;

    @Column(name = "Title")
    private String title;

    @Column(name = "Description")
    private String Description;

    @OneToOne(optional = false)
    @JoinColumn(name="contest_type_id", unique = true, nullable = false)
    private Contest_type contestType;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "contest_id", nullable = false)
    private DogShow dogShow;

    @ManyToMany
    @JoinTable(name="Dog_Contest",
            joinColumns = @JoinColumn(name="contest_id", referencedColumnName="id"),
            inverseJoinColumns = @JoinColumn(name="dog_id", referencedColumnName="id")
    )
    private Set<Dog> dogs_contest;

    @ManyToMany
    @JoinTable(name="Dog_Contest",
            joinColumns = @JoinColumn(name="contest_id", referencedColumnName="id"),
            inverseJoinColumns = @JoinColumn(name="human_id", referencedColumnName="id")
    )
    private Set<Human> humans_contest;

    public Set<Dog> getDogs_contest() {
        return dogs_contest;
    }

    public void setDogs_contest(Set<Dog> dogs_contest) {
        this.dogs_contest = dogs_contest;
    }

    public Set<Human> getHumans_contest() {
        return humans_contest;
    }

    public void setHumans_contest(Set<Human> humans_contest) {
        this.humans_contest = humans_contest;
    }

    public DogShow getDogShow() {
        return dogShow;
    }

    public void setDogShow(DogShow dogShow) {
        this.dogShow = dogShow;
    }

    public long getContest_id() {
        return contest_id;
    }

    public void setContest_id(long contest_id) {
        this.contest_id = contest_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Contest_type getContestType() {
        return contestType;
    }

    public void setContestType(Contest_type contestType) {
        this.contestType = contestType;
    }
}
