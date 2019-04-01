package com.example.usuario.contactos;

public class Contacto {

    private String nombre;
    private String telefono;
    private String correo;
    private String idFoto;

    public Contacto(String nombre, String telefono, String correo,String idFoto) {
        this.setNombre(nombre);
        this.setTelefono(telefono);
        this.setCorreo(correo);
        this.setIdFoto(idFoto);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
