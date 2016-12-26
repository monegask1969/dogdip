package dog.dip.entity;

/**
 * Created by moneg on 24.12.2016.
 */
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
@Table(name = "breed")
public class Breed {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long breed_id;
    @Column(name = "Title")
    private String title;
    @OneToOne(optional = false, mappedBy="dog")
    public Dog dog;

    public long getBreed_id() {
        return breed_id;
    }

    public void setBreed_id(long breed_id) {
        this.breed_id = breed_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
