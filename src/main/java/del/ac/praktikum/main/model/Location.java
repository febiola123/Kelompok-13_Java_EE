package del.ac.praktikum.main.model;

import javax.persistence.*;

@Entity
@Table(name = "t_bandara")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idbandara")
    private Long idbandara;
    @Column(name = "location")
    private String location;

    public Location() {
    }
    public Location(Long idbandara, String location) {
        this.idbandara = idbandara;
        this.location = location;
    }

    public Long getIdbandara() {
        return idbandara;
    }

    public void setIdbandara(Long idbandara) {
        this.idbandara = idbandara;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
