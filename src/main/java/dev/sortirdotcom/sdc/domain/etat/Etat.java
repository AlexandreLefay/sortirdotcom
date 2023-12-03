package dev.sortirdotcom.sdc.domain.etat;

import dev.sortirdotcom.sdc.domain.sortie.Sortie;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "etat")
public class Etat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String label;

    @OneToMany(mappedBy = "etat")
    private List<Sortie> sorties;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Sortie> getSorties() {
        return sorties;
    }

    public void setSorties(List<Sortie> sorties) {
        this.sorties = sorties;
    }
}