package dog.dip.entity;

/**
 * Created by moneg on 24.12.2016.
 */
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "dog")
public class Dog {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long dog_id;

    @Column(name = "Gender")
    private String gender;
    @Column(name = "Name")
    private String name;
    @Column(name = "Dob")
    private Date dob;
    @Column(name = "Chip")
    private String chip;
    @Column(name = "Brand")
    private String brand;
    @Column(name = "Pedigree")
    private String pedigree;
    @Column(name = "Sire")
    private String sire;
    @Column(name = "Dam")
    private String dam;

    @OneToOne(optional = false)
    @JoinColumn(name="breed_id", unique = true, nullable = false)
    private Breed breed;

    @OneToOne(optional = false)
    @JoinColumn(name="color_id", unique = true, nullable = false)
    private Color color;

    @OneToOne(optional = false)
    @JoinColumn(name="fcigroup_id", unique = true, nullable = false)
    private FciGroup fciGroup;

    @OneToOne(optional = false)
    @JoinColumn(name="human_id", unique = true, nullable = false)
    private Human human;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "dogs")
    private Set<DogShow> dogShows;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "dogs_contest")
    private Set<Contest> contests;

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public long getDog_id() {
        return dog_id;
    }

    public void setDog_id(long dog_id) {
        this.dog_id = dog_id;
    }

    public FciGroup getFciGroup() {
        return fciGroup;
    }

    public void setFciGroup(FciGroup fciGroup) {
        this.fciGroup = fciGroup;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPedigree() {
        return pedigree;
    }

    public void setPedigree(String pedigree) {
        this.pedigree = pedigree;
    }

    public String getSire() {
        return sire;
    }

    public void setSire(String sire) {
        this.sire = sire;
    }

    public String getDam() {
        return dam;
    }

    public void setDam(String dam) {
        this.dam = dam;
    }
}
