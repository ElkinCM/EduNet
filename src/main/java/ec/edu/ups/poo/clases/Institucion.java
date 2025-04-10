package ec.edu.ups.poo.clases;

import java.util.ArrayList;
import java.util.List;
import ec.edu.ups.poo.enums.TipoDireccion;

public class Institucion {
    private int id;
    private String nombre;
    private List<String> sedes;
    private List<Persona> personas;
    private List<Direccion> direcciones;

    public Institucion() {
        this.sedes = new ArrayList<>();
        this.personas = new ArrayList<>();
        this.direcciones = new ArrayList<>();
    }

    public Institucion(int id, String nombre, List<String> sedes, List<Persona> personas) {
        this.id = id;
        this.nombre = nombre;
        this.sedes = sedes;
        this.personas = personas;
        this.direcciones = new ArrayList<>();
    }

    public void addPersona(Persona persona) {
        this.personas.add(persona);
    }

    public void addDireccion(String callePrincipal, String calleSecundaria, String numeracion,
                             String ciudad, String provincia, String pais, TipoDireccion tipoDireccion) {
        this.direcciones.add(new Direccion(callePrincipal, calleSecundaria, numeracion, ciudad, provincia, pais, tipoDireccion));
    }

    public void addDireccion(Direccion direccion) {
        this.direcciones.add(direccion);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSedes(List<String> sedes) {
        this.sedes = sedes;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getSedes() {
        return sedes;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    @Override
    public String toString() {
        return "Institucion{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", sedes=" + sedes +
                ", personas=" + personas +
                ", direcciones=" + direcciones +
                '}';
    }
}