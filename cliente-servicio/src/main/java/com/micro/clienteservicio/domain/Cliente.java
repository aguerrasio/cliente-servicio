package com.micro.clienteservicio.domain;

public class Cliente {
    private Integer id;
    private String apellido;
    private String nombre;
    private String compania;

   /* public Cliente(Integer id, String apellido, String nombre, String compania) {
        this.id = id;
        this.apellido = apellido;
        this.nombre = nombre;
        this.compania = compania;
    }*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }
}
