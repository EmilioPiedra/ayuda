package ec.edu.utpl.poo.parcial1.model;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Asignatura {
    private String nombre;
    private int ciclo;
    private List<Proyecto> proyectos = new ArrayList<>();
    private List<Actividad> actividades;

    public Asignatura(String nombre, int ciclo) {
        this.nombre = nombre;
        this.ciclo = ciclo;
        actividades = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public List<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(List<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    public List<Actividad> getActividades() {
        return actividades;
    }

    public void addActividad(String nombre, URI url, LocalDateTime fechaCierre) {
        actividades.add(new Actividad(nombre, url, fechaCierre));
    }
}
