package dog.dip.entity;

/**
 * Created by moneg on 24.12.2016.
 */
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "human")
public class Human {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long human_id;

    @Column(name = "Fname")
    private String fname;

    @Column(name = "Sname")
    private String sname;

    @Column(name = "Lname")
    private String Lname;

    @Column(name = "Country")
    private String country;

    @Column(name = "UserName")
    private String username;

    @Column(name = "Password")
    private String password;

    @OneToOne(optional = false)
    @JoinColumn(name="role_id", unique = true, nullable = false)
    private Role_type role_type;

    @OneToOne(optional = false, mappedBy="dog")
    public Dog dog;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "humans_contest")
    private Set<Contest> contests;

    public long getHuman_id() {
        return human_id;
    }

    public void setHuman_id(long human_id) {
        this.human_id = human_id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Role_type getRole_type() {
        return role_type;
    }

    public void setRole_type(Role_type role_type) {
        this.role_type = role_type;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
