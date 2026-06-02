package com.jannabitte.pendientesspringvet.modelo;

public class Pendiente {

    private String nombre;
    private String descripcion;
    private String fechaLimite;

    public Pendiente() {
    }

    public Pendiente(String nombre, String descripcion, String fechaLimite) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(String fechaLimite) {
        this.fechaLimite = fechaLimite;
    }
}