package ec.edu.utpl.poo.parcial1.model;

import java.net.URI;
import java.time.LocalDateTime;

public class Actividad {
    private static int contador;
    private String nombre;
    private URI url;
    private LocalDateTime fechaCierre;

    public Actividad(String nombre, URI url, LocalDateTime fechaCierre) {
        contador ++;
        this.nombre = nombre;
        this.url = url;
        this.fechaCierre = fechaCierre;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Actividad.contador = contador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public LocalDateTime getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(LocalDateTime fechaCierre) {
        this.fechaCierre = fechaCierre;
    }
}
