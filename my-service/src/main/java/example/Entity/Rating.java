package example.Entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;
import java.util.Calendar;

@Entity
//@Table(name = "rating")
@XmlAccessorType(XmlAccessType.FIELD)
public class Rating {
    @Id
    private long id;
    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "member_id")
    @XmlTransient
    private Member member;
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "place_id")
    private Place place;
    private int value;

    public Rating() {
        this.id = Calendar.getInstance().getTimeInMillis();
    }

    public Rating(long id, Member member, Place place, int value) {
        this.id = id;
        this.member = member;
        this.place = place;
        this.value = value;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
