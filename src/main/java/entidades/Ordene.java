package entidades;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "ordenes")
public class Ordene {
    @Id
    @Column(name = "ORDENID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "EMPLEADOID", nullable = false)
    private Empleado empleadoid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CLIENTEID", nullable = false)
    private Cliente clienteid;

    @Column(name = "FECHAORDEN", nullable = false)
    private LocalDate fechaorden;

    @Column(name = "DESCUENTO")
    private Integer descuento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Empleado getEmpleadoid() {
        return empleadoid;
    }

    public void setEmpleadoid(Empleado empleadoid) {
        this.empleadoid = empleadoid;
    }

    public Cliente getClienteid() {
        return clienteid;
    }

    public void setClienteid(Cliente clienteid) {
        this.clienteid = clienteid;
    }

    public LocalDate getFechaorden() {
        return fechaorden;
    }

    public void setFechaorden(LocalDate fechaorden) {
        this.fechaorden = fechaorden;
    }

    public Integer getDescuento() {
        return descuento;
    }

    public void setDescuento(Integer descuento) {
        this.descuento = descuento;
    }

}