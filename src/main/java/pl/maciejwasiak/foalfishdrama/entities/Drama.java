package pl.maciejwasiak.foalfishdrama.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "drama")
@Entity
public class Drama {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String hMD;

    public Drama() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHMD() {
        return hMD;
    }

    public void setHMD(String howManyDaysFromLastDrama) {
        this.hMD = howManyDaysFromLastDrama;
    }
}
