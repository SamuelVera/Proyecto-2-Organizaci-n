package UsuariosDatos;

import java.util.Date;

public class Pelicula {
    private int stock, rating=0;
    private String titulo, genero, descripcion, ultimo;
    private long precioDia;
    private Date fechaUlt;
    
    public Pelicula(String titulo, long precio, int rating, String genero, int stock, String descripcion, long fechaUlt, String ultimo){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.genero = genero;
        this.precioDia = precio;
        this.stock = stock;
        this.rating = rating;
        this.ultimo = ultimo;
        this.fechaUlt = new Date(fechaUlt);
    }

    public String getUltimo() {
        return this.ultimo;
    }

    public void setUltimo(String ultimo) {
        this.ultimo = ultimo;
    }

    public long getFechaUlt() {
        return this.fechaUlt.getTime();
    }

    public void setFechaUlt(long fechaUlt) {
        this.fechaUlt = new Date(fechaUlt);
    }
    
    public void setDesc(String desc){
        this.descripcion = desc;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setPrecioDia(long precioDia) {
        this.precioDia = precioDia;
    }
    
    public int getStock() {
        return this.stock;
    }

    public int getRating() {
        return this.rating;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public String getGenero() {
        return this.genero;
    }

    public long getPrecioDia() {
        return this.precioDia;
    }
}
