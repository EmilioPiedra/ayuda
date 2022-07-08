package ec.edu.utpl.poo.parcial1.model;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombres;
    private String correoElectronico;
    private List<Asignatura> asignaturas;

    public Estudiante(String nombres, String correoElectronico) {
        this.nombres = nombres;
        this.correoElectronico = correoElectronico;
        asignaturas = new ArrayList<>();
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void addAsignatura(String nombre, int ciclo) {
        Asignatura tmp = new Asignatura(nombre, ciclo);
        asignaturas.add(tmp);
    }
}