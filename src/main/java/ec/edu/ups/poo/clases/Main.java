package ec.edu.ups.poo.clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ec.edu.ups.poo.enums.TipoDireccion;

public class Main {
    public static void main(String[] args) {

        Institucion institucion1 = new Institucion();
        Institucion institucion2 = new Institucion();

        institucion1.setNombre("Universidad UPS");
        institucion2.setNombre("Instituto Tecnológico");

        List<String> sedes1 = new ArrayList<>();
        sedes1.add("Sede Cuenca - Campus El Vecino");
        sedes1.add("Sede Quito");
        institucion1.setSedes(sedes1);

        List<String> sedes2 = new ArrayList<>();
        sedes2.add("Sede Guayaquil");
        institucion2.setSedes(sedes2);

        institucion1.addDireccion("Av. Americas", "12 de Abril", "123", "Cuenca", "Azuay", "Ecuador", TipoDireccion.INSTITUCION);
        institucion2.addDireccion("Av. Principal", "Calle Secundaria", "456", "Guayaquil", "Guayas", "Ecuador", TipoDireccion.INSTITUCION);


        Estudiante estudiante = new Estudiante("0102030405", "Juan", "Pérez", "0991234567", "juan@correo.com", "Ingeniería de Sistemas");


        Docente docente = new Docente(
                "0504030201", "Ana", "García", "0987654321", "ana@correo.com",
                Arrays.asList("Licenciada en Matemáticas", "Magíster en Educación"),
                Arrays.asList("Álgebra", "Cálculo")
        );

        Administrativo administrativo = new Administrativo(
                "0708091011", "Carlos", "Lopez", "0976543210", "carlos@correo.com",
                "Coordinador Académico", "Supervisión de procesos académicos"
        );

        Visitante visitante = new Visitante(
                "1110987654", "Lucia", "Mendoza", "0965432109", "lucia@correo.com",
                "Reunión institucional", LocalDate.of(2025, 4, 9), LocalDate.of(2025, 4, 9)
        );

        institucion1.addPersona(estudiante);
        institucion1.addPersona(docente);

        institucion2.addPersona(administrativo);
        institucion2.addPersona(visitante);


        System.out.println("==== INFORMACIÓN DE INSTITUCIONES ====");
        imprimirInstitucion(institucion1);
        System.out.println();
        imprimirInstitucion(institucion2);
    }

    private static void imprimirInstitucion(Institucion institucion) {
        System.out.println("Nombre de la institución: " + institucion.getNombre());
        System.out.println("Sedes:");
        for (String sede : institucion.getSedes()) {
            System.out.println("  - " + sede);
        }

        System.out.println("Direcciones:");
        for (Direccion direccion : institucion.getDirecciones()) {
            System.out.println("  - " + direccion);
        }

        System.out.println("Personas asignadas:");
        for (Persona persona : institucion.getPersonas()) {
            System.out.println("  - " + persona);
        }
    }
}
