package Accesos;

import java.util.LinkedList;

public class Indice {
    private int numReg;
    private LinkedList apunta;
    private int clave;
    private String clave2;
    
    
        //Clave principal de cliente
    public Indice(int clave, String dispose, int numReg){
        this.numReg = numReg;
        this.clave = clave;
    }
    
        //Clave principal de películas
    public Indice(String clave, int numReg){
        this.numReg = numReg;
        this.clave2 = clave;
    }
    
        //Clave secundaria género
    public Indice(String s, LinkedList l){
        this.clave2 = s;
        this.apunta = l;
    }
    
        //Clave secundaria rating
    public Indice(int r, LinkedList l){
        this.clave = r;
        this.apunta = l;
    }

    public LinkedList getApunta(){
        return this.apunta;
    }
    
    public void AddLast(String titulo){
        this.apunta.addLast(titulo);
    }
    
    public void setNumReg(int numReg){
        this.numReg = numReg;
    }
    
    public int getNumReg() {
        return numReg;
    }

    public int getClave() {
        return this.clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }
    
    public String getClave2() {
        return this.clave2;
    }

    public void setClave2(String clave) {
        this.clave2 = clave;
    }
    
}
