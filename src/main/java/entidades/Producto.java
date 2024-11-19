package entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @Column(name = "PRODUCTOID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PROVEEDORID", nullable = false)
    private entidades.Proveedore proveedorid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CATEGORIAID", nullable = false)
    private Categoria categoriaid;

    @Column(name = "DESCRIPCION", length = 50)
    private String descripcion;

    @Column(name = "PRECIOUNIT", nullable = false)
    private Double preciounit;

    @Column(name = "EXISTENCIA", nullable = false)
    private Integer existencia;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public entidades.Proveedore getProveedorid() {
        return proveedorid;
    }

    public void setProveedorid(entidades.Proveedore proveedorid) {
        this.proveedorid = proveedorid;
    }

    public Categoria getCategoriaid() {
        return categoriaid;
    }

    public void setCategoriaid(Categoria categoriaid) {
        this.categoriaid = categoriaid;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPreciounit() {
        return preciounit;
    }

    public void setPreciounit(Double preciounit) {
        this.preciounit = preciounit;
    }

    public Integer getExistencia() {
        return existencia;
    }

    public void setExistencia(Integer existencia) {
        this.existencia = existencia;
    }

}