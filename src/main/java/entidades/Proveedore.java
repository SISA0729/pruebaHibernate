package entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "proveedores")
public class Proveedore {
    @Id
    @Column(name = "PROVEEDORID", nullable = false)
    private Integer id;

    @Column(name = "NOMBREPROV", nullable = false, length = 50)
    private String nombreprov;

    @Column(name = "CONTACTO", nullable = false, length = 50)
    private String contacto;

    @Column(name = "CELUPROV", length = 12)
    private String celuprov;

    @Column(name = "FIJOPROV", length = 12)
    private String fijoprov;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreprov() {
        return nombreprov;
    }

    public void setNombreprov(String nombreprov) {
        this.nombreprov = nombreprov;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getCeluprov() {
        return celuprov;
    }

    public void setCeluprov(String celuprov) {
        this.celuprov = celuprov;
    }

    public String getFijoprov() {
        return fijoprov;
    }

    public void setFijoprov(String fijoprov) {
        this.fijoprov = fijoprov;
    }

}