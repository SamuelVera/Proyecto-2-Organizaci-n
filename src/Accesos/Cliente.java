package Accesos;

import java.util.Date;

public class Cliente {
    
    private int ci;
    private String pelicula, nomape;
    private Date fechaAlq, fechaDevol;
    
    public Cliente(int ci, String nomape, long fechaAlq, String pelicula, long fechaDevol){
        this.ci = ci;
        this.nomape = nomape;
        this.pelicula = pelicula;
        this.fechaAlq = new Date(fechaAlq);
        this.fechaDevol = new Date(fechaDevol);
    }

    public void setCi(int ci){
        this.ci = ci;
    }
    
    public void setNomape(String nomape){
        this.nomape = nomape;
    }
        
    public int getCi() {
        return this.ci;
    }

    public String getNomape() {
        return this.nomape;
    }

    public String getPelicula() {
        return this.pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public void setFechaAlq(long fecha){
        this.fechaAlq = new Date(fecha);
    }
    
    public void setFechaVenc(long fecha){
        this.fechaDevol = new Date(fecha);
    }
    
    public long getFechaAlq() {
        if(this.pelicula.equals("0")){
            return 0;
        }else{
            return this.fechaAlq.getTime();
        }
    }

    public long getFechaDevol() {
        if(this.pelicula.equals("0")){
            return 0;
        }else{
            return this.fechaDevol.getTime();
        }
    }
    
}
