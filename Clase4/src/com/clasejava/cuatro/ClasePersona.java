package com.clasejava.cuatro;

import java.util.Objects;

public class ClasePersona {

    private String nombre;
    private String apellido;

    public ClasePersona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return nombre + ' ' + apellido;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof ClasePersona persona)) return false;
        if (!super.equals(object)) return false;
        return java.util.Objects.equals(nombre, persona.nombre) && java.util.Objects.equals(apellido, persona.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nombre, apellido);
    }

}
