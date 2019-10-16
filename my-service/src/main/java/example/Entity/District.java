package example.Entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

@Entity
//@Table(name = "district")
@XmlAccessorType(XmlAccessType.FIELD)
public class District {
    @Id
    private long id;
    private String name;
    @OneToMany(mappedBy = "district", cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, orphanRemoval = true)
    @XmlTransient
    private Set<Place> places = new HashSet<Place>();

    public District() {
        this.id = Calendar.getInstance().getTimeInMillis();
    }

    public District(long id, String name, long createdAt, long updatedAt, long deletedAt, int status, Set<Place> places) {
        this.id = id;
        this.name = name;
        this.places = places;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Place> getPlaces() {
        return places;
    }

    public void setPlaces(Set<Place> places) {
        this.places = places;
    }
}
