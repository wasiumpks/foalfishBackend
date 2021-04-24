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

    private String zkim;

    private String powod;

    public Drama() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String gethMD() {
        return hMD;
    }

    public void sethMD(String hMD) {
        this.hMD = hMD;
    }

    public String getZkim() {
        return zkim;
    }

    public void setZkim(String zkim) {
        this.zkim = zkim;
    }

    public String getPowod() {
        return powod;
    }

    public void setPowod(String powod) {
        this.powod = powod;
    }
}
