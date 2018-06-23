package Accesos;

public class Indice {
    private int numReg;
    private String apunta;
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
    public Indice(String clave, int dispose, String apunta){
        this.apunta = apunta;
        this.clave2 = clave;
    }
    
        //Clave secundaria rating
    public Indice(int clave, String apunta){
        this.apunta = apunta;
        this.clave = clave;
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
