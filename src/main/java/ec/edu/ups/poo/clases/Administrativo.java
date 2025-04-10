package ec.edu.ups.poo.clases;

public class Administrativo extends Persona {
    private String cargo;
    private String responsabilidades;

    public Administrativo() {
        super();
    }

    public Administrativo(String cedula, String nombre, String apellido, String telefono, String correoElectronico, String cargo, String responsabilidades) {
        super(cedula, nombre, apellido, telefono, correoElectronico);
        this.cargo = cargo;
        this.responsabilidades = responsabilidades;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getResponsabilidades() {
        return responsabilidades;
    }

    public void setResponsabilidades(String responsabilidades) {
        this.responsabilidades = responsabilidades;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", cargo='" + cargo + "', responsabilidades='" + responsabilidades + "'}");
    }
}
