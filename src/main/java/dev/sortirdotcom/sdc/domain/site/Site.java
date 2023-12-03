package dev.sortirdotcom.sdc.domain.site;

import dev.sortirdotcom.sdc.domain.user.User;
import dev.sortirdotcom.sdc.domain.sortie.Sortie;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "site")
public class Site {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "site")
    private List<User> users;

    @OneToMany(mappedBy = "site")
    private List<Sortie> sorties;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Sortie> getSorties() {
        return sorties;
    }

    public void setSorties(List<Sortie> sorties) {
        this.sorties = sorties;
    }
}
