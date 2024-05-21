package com.example.calculadora;

public class amigos {
    String idAmigo;
    String nombre;
    String direccion;
    String telefono;
    String email;
    String dui;
    String foto;
    String urlCompletaFotoFirestore;
    String token;
    public amigos(){}
    public amigos(String idAmigo, String nombre, String direccion, String telefono, String email, String dui, String foto, String urlCompletaFotoFirestore,String token) {
        this.idAmigo = idAmigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.dui = dui;
        this.foto = foto;
        this.urlCompletaFotoFirestore = urlCompletaFotoFirestore;
        this.token = token;
    }
    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
