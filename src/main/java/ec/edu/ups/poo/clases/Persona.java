package ec.edu.ups.poo.clases;

import java.util.ArrayList;
import java.util.List;
import ec.edu.ups.poo.enums.TipoDireccion;

public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correoElectronico;
    private List<Direccion> direcciones;

    public Persona() {
        this.direcciones = new ArrayList<>();
    }

    public Persona(String cedula, String nombre, String apellido, String telefono, String correoElectronico) {
        this();
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    public void addDireccion(String callePrincipal, String calleSecundaria, String numeracion,
                             String ciudad, String provincia, String pais, TipoDireccion tipoDireccion) {
        this.direcciones.add(new Direccion(callePrincipal, calleSecundaria, numeracion, ciudad, provincia, pais, tipoDireccion));
    }

    public void addDireccion(Direccion direccion) {
        this.direcciones.add(direccion);
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", direcciones=" + direcciones +
                '}';
    }
}
