package Accesos;

public class Pelicula {
    private int stock, rating=0;
    private String titulo, genero, descripcion;
    private long precioDia;
    private int RegPos;
    private boolean disponible;
    
    public Pelicula(boolean disponible ,String titulo, long precio, int rating, String genero, int stock, String descripcion, int RegPos){
        this.disponible = disponible;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.genero = genero;
        this.precioDia = precio;
        this.stock = stock;
        this.rating = rating;
        this.RegPos = RegPos;
    }

    public boolean registroIsDisponible(){
        return this.disponible;
    }
    
    public void setRegDisponible(boolean disponible){
        this.disponible = disponible;
    }
    
    public int getRegPos() {
        return this.RegPos;
    }

    public void setRegPos(int RegPos) {
        this.RegPos = RegPos;
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
