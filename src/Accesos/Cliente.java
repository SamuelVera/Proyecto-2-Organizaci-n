package Accesos;

import java.util.Date;

public class Cliente {
    
    private int ci;
    private String pelicula, nomape;
    private Date fechaAlq, fechaDevol;
    private int posReg;
    private boolean disponible;
    
    public Cliente(boolean dispon, int ci, String nomape, long fechaAlq, String pelicula, long fechaDevol, int posReg){
        this.disponible = dispon;
        this.ci = ci;
        this.nomape = nomape;
        this.pelicula = pelicula;
        this.fechaAlq = new Date(fechaAlq*1000);
        this.fechaDevol = new Date(fechaDevol*1000);
        this.posReg = posReg;
    }
    
    public void setRegistroIsDisponible(boolean disponible){
        this.disponible = disponible;
    }
    
    public boolean registroIsDisponible(){
        return this.disponible;
    }
    
    public int getPosReg() {
        return this.posReg;
    }

    public void setCi(int ci){
        this.ci = ci;
    }
    
    public void setNomape(String nomape){
        this.nomape = nomape;
    }
    
    public void setPosReg(int posReg) {
        this.posReg = posReg;
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
