package dog.dip.entity;

import javax.persistence.*;

/**
 * Created by moneg on 24.12.2016.
 */
@Entity
@Table(name = "color")
public class Color {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long color_id;

    @Column(name = "Title")
    private String title;
    @OneToOne(optional = false, mappedBy="dog")
    public Dog dog;

    public long getColor_id() {
        return color_id;
    }

    public void setColor_id(long color_id) {
        this.color_id = color_id;
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
