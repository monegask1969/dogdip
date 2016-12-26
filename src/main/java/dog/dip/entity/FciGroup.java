package dog.dip.entity;

import javax.persistence.*;

/**
 * Created by moneg on 24.12.2016.
 */
@Entity
@Table(name = "fcigroup")
public class FciGroup {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long fciGroup_id;

    @Column(name = "Number")
    private Integer number;

    @OneToOne(optional = false, mappedBy="dog")
    public Dog dog;

    public long getFciGroup_id() {
        return fciGroup_id;
    }

    public void setFciGroup_id(long fciGroup_id) {
        this.fciGroup_id = fciGroup_id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
