package dog.dip.entity;

/**
 * Created by moneg on 24.12.2016.
 */
import javax.persistence.*;

@Entity
@Table(name = "role_type")
public class Role_type {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long role_id;

    @Column(name = "Type")
    private Integer type;   // if 0 - admin  ||   1 - user  ||  2 - owner  ||  3 - breeder  || 4 - expert

    @OneToOne(optional = false, mappedBy="human")
    public Human human;

    public long getRole_id() {
        return role_id;
    }

    public void setRole_id(long role_id) {
        this.role_id = role_id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }
}
