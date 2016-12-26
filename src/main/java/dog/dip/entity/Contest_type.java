package dog.dip.entity;

/**
 * Created by moneg on 24.12.2016.
 */
import javax.persistence.*;

@Entity
@Table(name = "contest_type")
public class Contest_type {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long contest_type_id;

    @Column(name = "Title")
    private Integer forWhom;

    @OneToOne(optional = false, mappedBy="contest")
    public Contest contest;

    public long getContest_type_id() {
        return contest_type_id;
    }

    public void setContest_type_id(long contest_type_id) {
        this.contest_type_id = contest_type_id;
    }

    public Integer getForWhom() {
        return forWhom;
    }

    public void setForWhom(Integer forWhom) {
        this.forWhom = forWhom;
    }

    public Contest getContest() {
        return contest;
    }

    public void setContest(Contest contest) {
        this.contest = contest;
    }
}
