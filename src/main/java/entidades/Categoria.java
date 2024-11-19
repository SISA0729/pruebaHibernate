package entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categorias")
public class Categoria {
    @Id
    @Column(name = "CATEGORIAID", nullable = false)
    private Integer id;

    @Column(name = "NOMBRECAT", nullable = false, length = 50)
    private String nombrecat;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombrecat() {
        return nombrecat;
    }

    public void setNombrecat(String nombrecat) {
        this.nombrecat = nombrecat;
    }

}