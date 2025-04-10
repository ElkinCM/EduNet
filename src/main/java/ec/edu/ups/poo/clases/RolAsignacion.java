package ec.edu.ups.poo.clases;

import java.time.LocalDate;
import ec.edu.ups.poo.enums.Rol;

public class RolAsignacion {
    private Institucion institucion;
    private LocalDate fechaInicio;
    private Rol rol;

    public RolAsignacion() {
    }

    public RolAsignacion(Institucion institucion, LocalDate fechaInicio, Rol rol) {
        this.institucion = institucion;
        this.fechaInicio = fechaInicio;
        this.rol = rol;
    }

    public Institucion getInstitucion() {
        return institucion;
    }

    public void setInstitucion(Institucion institucion) {
        this.institucion = institucion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "RolAsignacion{" +
                "institucion=" + (institucion != null ? institucion.getNombre() : "N/A") +
                ", fechaInicio=" + fechaInicio +
                ", rol=" + rol +
                '}';
    }
}
