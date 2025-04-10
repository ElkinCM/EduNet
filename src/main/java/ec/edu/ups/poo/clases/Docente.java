package ec.edu.ups.poo.clases;

import java.util.List;
import java.util.ArrayList;

public class Docente extends Persona {
    private List<String> titulos;
    private List<String> areasEspecializacion;

    public Docente() {
        super();
        this.titulos = new ArrayList<>();
        this.areasEspecializacion = new ArrayList<>();
    }

    public Docente(String cedula, String nombre, String apellido, String telefono, String correoElectronico, List<String> titulos, List<String> areasEspecializacion) {
        super(cedula, nombre, apellido, telefono, correoElectronico);
        this.titulos = titulos;
        this.areasEspecializacion = areasEspecializacion;
    }

    public List<String> getTitulos() {
        return titulos;
    }

    public void setTitulos(List<String> titulos) {
        this.titulos = titulos;
    }

    public List<String> getAreasEspecializacion() {
        return areasEspecializacion;
    }

    public void setAreasEspecializacion(List<String> areasEspecializacion) {
        this.areasEspecializacion = areasEspecializacion;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", titulos=" + titulos + ", areasEspecializacion=" + areasEspecializacion + "}");
    }
}
