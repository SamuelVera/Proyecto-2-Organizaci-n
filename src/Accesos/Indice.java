package Accesos;

public class Indice {
    private int numReg;
    private int clave;
    private String clave2;
    
    public Indice(int clave, String dispose, int numReg){
        this.numReg = numReg;
        this.clave = clave;
    }
    
    public Indice(String clave, int numReg){
        this.numReg = numReg;
        this.clave2 = clave;
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
