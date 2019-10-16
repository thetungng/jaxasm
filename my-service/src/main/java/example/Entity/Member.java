package example.Entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Entity
//@Table(name = "member")
@XmlAccessorType(XmlAccessType.FIELD)
public class Member {
    @Id
    private long id;
    private String name;
    private String username;
    private String password;
    private int role;

    @OneToOne(mappedBy = "member", cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, orphanRemoval = true)
    @XmlTransient
    private Rating rating;
    @OneToMany(mappedBy = "member", cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, orphanRemoval = true)
    @XmlTransient
    private List<Comment> comments = new ArrayList<Comment>();
    @OneToMany(mappedBy = "member", cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, orphanRemoval = true)
    @XmlTransient
    private List<Place> places = new ArrayList<Place>();

    public Member() {
        this.id = Calendar.getInstance().getTimeInMillis();
    }

    public Member(long id, String name, String username, String password, int role, Rating rating, List<Comment> comments, List<Place> places) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.rating = rating;
        this.comments = comments;
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

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Place> getPlaces() {
        return places;
    }

    public void setPlaces(List<Place> places) {
        this.places = places;
    }
}
