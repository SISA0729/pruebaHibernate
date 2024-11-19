package entidades;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "empleados")
public class Empleado {
    @Id
    @Column(name = "EMPLEADOID", nullable = false)
    private Integer id;

    @Column(name = "NOMBRE", length = 30)
    private String nombre;

    @Column(name = "APELLIDO", length = 30)
    private String apellido;

    @Column(name = "FECHA_NAC")
    private LocalDate fechaNac;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "REPORTA_A")
    private Empleado reportaA;

    @Column(name = "EXTENSION")
    private Integer extension;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Empleado getReportaA() {
        return reportaA;
    }

    public void setReportaA(Empleado reportaA) {
        this.reportaA = reportaA;
    }

    public Integer getExtension() {
        return extension;
    }

    public void setExtension(Integer extension) {
        this.extension = extension;
    }

}