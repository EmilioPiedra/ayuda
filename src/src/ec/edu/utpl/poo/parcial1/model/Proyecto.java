package ec.edu.utpl.poo.parcial1.model;

import ec.edu.utpl.poo.parcial1.util.UTPLValidator;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Proyecto {
    private static int contador;
    private String nombre;
    private String descripción;
    private boolean individual;
    private double calificacion;
    private LocalDate fechaAsignacion;
    private LocalDateTime fechaEntrega;
    private boolean entregado;

    public Proyecto(String nombre, String descripción, boolean individual, double calificacion) {
        contador++;
        this.nombre = nombre;
        this.descripción = descripción;
        this.individual = individual;
        UTPLValidator.validateNota(calificacion);
        this.calificacion = calificacion;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Proyecto.contador = contador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public boolean isIndividual() {
        return individual;
    }

    public void setIndividual(boolean individual) {
        this.individual = individual;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public LocalDate getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(LocalDate fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public LocalDateTime getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDateTime fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }
}
