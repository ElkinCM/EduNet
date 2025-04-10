package ec.edu.ups.poo.clases;

import java.time.LocalDate;

public class Visitante extends Persona {
    private String motivoVisita;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;

    public Visitante() {
        super();
    }

    public Visitante(String cedula, String nombre, String apellido, String telefono, String correoElectronico, String motivoVisita, LocalDate fechaEntrada, LocalDate fechaSalida) {
        super(cedula, nombre, apellido, telefono, correoElectronico);
        this.motivoVisita = motivoVisita;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public String getMotivoVisita() {
        return motivoVisita;
    }

    public void setMotivoVisita(String motivoVisita) {
        this.motivoVisita = motivoVisita;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", motivoVisita='" + motivoVisita + "', fechaEntrada=" + fechaEntrada + ", fechaSalida=" + fechaSalida + "}");
    }
}
