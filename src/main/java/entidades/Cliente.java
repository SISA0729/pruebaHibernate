package entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @Column(name = "CLIENTEID", nullable = false)
    private Integer id;

    @Column(name = "CEDULA_RUC", nullable = false, length = 10)
    private String cedulaRuc;

    @Column(name = "NOMBRECIA", nullable = false, length = 30)
    private String nombrecia;

    @Column(name = "NOMBRECONTACTO", nullable = false, length = 50)
    private String nombrecontacto;

    @Column(name = "DIRECCIONCLI", nullable = false, length = 50)
    private String direccioncli;

    @Column(name = "FAX", length = 12)
    private String fax;

    @Column(name = "EMAIL", length = 50)
    private String email;

    @Column(name = "CELULAR", length = 12)
    private String celular;

    @Column(name = "FIJO", length = 12)
    private String fijo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCedulaRuc() {
        return cedulaRuc;
    }

    public void setCedulaRuc(String cedulaRuc) {
        this.cedulaRuc = cedulaRuc;
    }

    public String getNombrecia() {
        return nombrecia;
    }

    public void setNombrecia(String nombrecia) {
        this.nombrecia = nombrecia;
    }

    public String getNombrecontacto() {
        return nombrecontacto;
    }

    public void setNombrecontacto(String nombrecontacto) {
        this.nombrecontacto = nombrecontacto;
    }

    public String getDireccioncli() {
        return direccioncli;
    }

    public void setDireccioncli(String direccioncli) {
        this.direccioncli = direccioncli;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFijo() {
        return fijo;
    }

    public void setFijo(String fijo) {
        this.fijo = fijo;
    }

}