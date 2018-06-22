package Accesos;

public class Pelicula {
    private int stock, rating=0;
    private String titulo, genero, descripcion;
    private long precioDia;
    
    public Pelicula(String titulo, long precio, int rating, String genero, int stock, String descripcion){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.genero = genero;
        this.precioDia = precio;
        this.stock = stock;
        this.rating = rating;
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
