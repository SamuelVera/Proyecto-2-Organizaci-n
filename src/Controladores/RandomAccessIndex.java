package Controladores;

import UsuariosDatos.Indice;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.LinkedList;

public class RandomAccessIndex {
    private RandomAccessFile flujo;
    private int RegNum;
    private int RegTam = 20;
    
    public void crearFlujo(File f) throws IOException{
            //Verificar si es un archivo
        if (f.exists() && !f.isFile()) {
            throw new IOException(f.getName() + " no es un archivo");
        }
            //Crear el flujo, de no existir el archivo se crea el flujo
        this.flujo = new RandomAccessFile(f, "rw");
        this.RegNum = (int) Math.ceil((double)this.flujo.length() / this.RegTam);
    }
    
    public void cerrarFlujo() throws IOException{
        this.flujo.close();
    }

    public void clear(File f) throws IOException{
        f.delete();
        this.crearFlujo(f);
    }
    
    public Indice buscarReg(int posReg) throws IOException{
        this.flujo.seek(posReg*RegTam);
        return new Indice(flujo.readInt(),flujo.readUTF(),flujo.readInt());
    }
    
    public Indice buscarRegString(int posReg) throws IOException{
        this.flujo.seek(posReg*RegTam);
        return new Indice(flujo.readUTF(),flujo.readInt());
    }
    
    public void ingresarRegInt(Indice i, int NumReg) throws IOException{
        this.flujo.seek(i.getNumReg()*this.RegTam);
        this.flujo.writeInt(i.getClave());
        this.flujo.writeUTF("%");
        this.flujo.writeInt(NumReg);
    }
    
    public void ingresarRegString(Indice i, int NumReg) throws IOException{
        this.flujo.seek(i.getNumReg()*this.RegTam);
        this.flujo.writeUTF(i.getClave2());
        this.flujo.writeInt(NumReg);
    }
    
        //Respaldar al finalizar la ejecución
    public void RespaldoFinalInt(LinkedList l, File f) throws IOException{
        Object[] arreglo =  l.toArray();
        this.clear(f);
        for(int i=0;i<arreglo.length;i++){
            this.flujo.seek(i*this.RegTam);
            this.flujo.writeInt(((Indice)arreglo[i]).getClave());
            this.flujo.writeUTF("%");
            this.flujo.writeInt(((Indice)arreglo[i]).getNumReg());
        }
    }
    
    public void RespaldoFinalString(LinkedList l, File f) throws IOException{
        Object[] arreglo = l.toArray();
        this.clear(f);
        for(int i=0;i<arreglo.length;i++){
            this.flujo.seek(i*this.RegTam);
            this.flujo.writeUTF(((Indice)arreglo[i]).getClave2());
            this.flujo.writeInt(((Indice)arreglo[i]).getNumReg());
        }
    }
    
        //Extraer todos los índices al comienzo de una ejecución
    public Object[] ExtraerAllRegInt() throws IOException{
        LinkedList aux = new LinkedList();
        for(int i=0;i<RegNum;i++){
            this.flujo.seek(i*RegTam);
            Indice j = new Indice(this.flujo.readInt(),this.flujo.readUTF(),this.flujo.readInt());
            if(j.getNumReg() != -1){
                aux.addLast(j);
            }
        }
        return aux.toArray();
    }
    
    public Object[] ExtraerAllRegString() throws IOException{
        LinkedList aux = new LinkedList();
        for(int i=0;i<RegNum;i++){
            this.flujo.seek(i*RegTam);
            Indice j = new Indice(this.flujo.readUTF(),this.flujo.readInt());
            if(j.getNumReg() != -1){
                aux.addLast(j);
            }
        }
        return aux.toArray();
    }
    
}
