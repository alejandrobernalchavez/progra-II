package com.example.calculadora;
public class Peliculas {
    String _id;
    String _rev;
    String actorPelicula;
    String titulo;
    String duracion;
    String sinopsis;
    String presentacion;
    String precio;
    String foto;

    public Peliculas(String idPelicula, String titulo, String duracion, String sinopsis, String presentacion, String precio, String foto, String _id, String _rev) {
        this._id=_id;
        this._rev= _rev;
        this.actorPelicula = idPelicula;
        this.titulo = titulo;
        this.duracion = duracion;
        this.sinopsis = sinopsis;
        this.presentacion = presentacion;
        this.precio = precio;
        this.foto = foto;
    }
    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }
    public String get_rev() {
        return _rev;
    }
    public void set_rev(String _rev) {
        this._rev = _rev;
    }


    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getActorPelicula() {
        return actorPelicula;
    }

    public void setIdPelicula(String idPelicula) {
        this.actorPelicula = idPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String direccion) {
        this.duracion = direccion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String telefono) {
        this.sinopsis = telefono;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String email) {
        this.presentacion = email;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String dui) {
        this.precio = dui;
    }
}
