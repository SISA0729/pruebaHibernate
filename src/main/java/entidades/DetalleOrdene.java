package entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "detalle_ordenes")
public class DetalleOrdene {
    @EmbeddedId
    private DetalleOrdeneId id;

    @MapsId("ordenid")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ORDENID", nullable = false)
    private entidades.Ordene ordenid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PRODUCTOID", nullable = false)
    private entidades.Producto productoid;

    @Column(name = "CANTIDAD", nullable = false)
    private Integer cantidad;

    public DetalleOrdeneId getId() {
        return id;
    }

    public void setId(DetalleOrdeneId id) {
        this.id = id;
    }

    public entidades.Ordene getOrdenid() {
        return ordenid;
    }

    public void setOrdenid(entidades.Ordene ordenid) {
        this.ordenid = ordenid;
    }

    public entidades.Producto getProductoid() {
        return productoid;
    }

    public void setProductoid(entidades.Producto productoid) {
        this.productoid = productoid;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

}