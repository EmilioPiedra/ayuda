package ec.edu.utpl.poo.parcial1;

import ec.edu.utpl.poo.parcial1.model.Estudiante;
import ec.edu.utpl.poo.parcial1.model.Proyecto;

import java.net.URI;
import java.time.LocalDateTime;

public class RunDemo {
    public static void main(String[] args) throws Exception{
        Estudiante alumno = new Estudiante(
                "Lasso Rafael",
                "mashi@bancoguayaquil.com");
        alumno.addAsignatura("POO", 2);
        //¿Cómo obtener la asignatura?
        //alumno.getAsignaturas().get(0)
        alumno.getAsignaturas().get(0).addActividad("Parcial 1",
                new URI("http://abc.com"),
                LocalDateTime.now().plusDays(10));
        alumno.getAsignaturas().get(0).addActividad("Taller 1",
                new URI("http://123.com"),
                LocalDateTime.now().plusDays(20));
        Proyecto p1 = new Proyecto("Consulta",
                "Consultar..",
                true,
                10);
        alumno.getAsignaturas().get(0).getProyectos().add(p1);
        System.out.println(alumno.getAsignaturas());


    }
}
