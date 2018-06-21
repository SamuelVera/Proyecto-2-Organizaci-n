package Controladores;

import Accesos.Pelicula;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessPelicula {
    
    private static RandomAccessFile flujo;
    private static int RegNum;
    private static int RegTam = 140;
    
    public static void crearFlujo(File f) throws IOException{
            //Verificar si es un archivo
        if (f.exists() && !f.isFile()) {
            throw new IOException(f.getName() + " no es un archivo");
        }
            //Crear el flujo, de no existir el archivo se crea el flujo
        flujo = new RandomAccessFile(f, "rw");
        RegNum = (int) Math.ceil((double)flujo.length() / RegTam);
    }
    
    public static void cerrarFlujo() throws IOException{
        flujo.close();
    }
    
    public static void eliminarReg(int regElim) throws IOException{
        long pos = RegTam*regElim;
        flujo.seek(pos);
        Pelicula p = buscarReg(regElim);
        p.setRegDisponible(false);
        ingresarReg(p);
    }
    
        //Añadir nuevo registro con información de un cliente C
    public static void ingresarReg(Pelicula p) throws IOException{
        long pos = RegTam*p.getRegPos();
            //Posición del archivo
        flujo.seek(pos);
            //Escribir en la posición
        flujo.writeBoolean(p.registroIsDisponible());
        flujo.writeUTF(p.getTitulo());
        flujo.writeLong(p.getPrecioDia());
        flujo.writeInt(p.getRating());
        flujo.writeUTF(p.getGenero());
        flujo.writeInt(p.getStock());
        flujo.writeUTF(p.getDescripcion());
        flujo.writeInt(p.getRegPos());
        
        RegNum++;
    }
    
        //Retrar toda la información del registro
    public static Pelicula buscarReg(int posReg) throws IOException{
        long pos = RegTam*posReg;
        flujo.seek(pos);
        return new Pelicula(flujo.readBoolean(),flujo.readUTF(), flujo.readLong(), flujo.readInt(), flujo.readUTF(), flujo.readInt(), flujo.readUTF(), flujo.readInt());
    }
    
        //Extraer la información de todos los registros
    public static Pelicula[] ExtraerAllReg() throws IOException{
        Pelicula[] aux = new Pelicula[RegNum];
        for(int i=0;i<aux.length;i++){
            flujo.seek(i*RegTam);
            aux[i] = new Pelicula(flujo.readBoolean(),flujo.readUTF(), flujo.readLong(), flujo.readInt(), flujo.readUTF(), flujo.readInt(), flujo.readUTF(), flujo.readInt());
        }
        return aux;
    }
}