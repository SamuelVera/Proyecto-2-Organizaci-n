package Controladores;

import UsuariosDatos.Pelicula;
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
    
    public static int getRegNum(){
        return RegNum;
    }
    
        //Añadir nuevo registro con información de un cliente C
    public static void ingresarReg(Pelicula p) throws IOException{
        long pos = RegTam*RegNum;
            //Posición del archivo
        flujo.seek(pos);
            //Escribir en la posición
        flujo.writeUTF(p.getTitulo());
        flujo.writeLong(p.getPrecioDia());
        flujo.writeInt(p.getRating());
        flujo.writeUTF(p.getGenero());
        flujo.writeInt(p.getStock());
        flujo.writeUTF(p.getDescripcion());
        flujo.writeLong(p.getFechaUlt());
        flujo.writeUTF(p.getUltimo());
        RegNum++;
    }
    
    public static void ingresarReg(Pelicula p, int pos1) throws IOException{
        long pos = RegTam*pos1;
            //Posición del archivo
        flujo.seek(pos);
            //Escribir en la posición
        flujo.writeUTF(p.getTitulo());
        flujo.writeLong(p.getPrecioDia());
        flujo.writeInt(p.getRating());
        flujo.writeUTF(p.getGenero());
        flujo.writeInt(p.getStock());
        flujo.writeUTF(p.getDescripcion());
        flujo.writeLong(p.getFechaUlt());
        flujo.writeUTF(p.getUltimo());
        
    }
    
        //Retrar toda la información del registro
    public static Pelicula buscarReg(int posReg) throws IOException{
        long pos = RegTam*posReg;
        flujo.seek(pos);
        return new Pelicula(flujo.readUTF(), flujo.readLong(), flujo.readInt(), flujo.readUTF(), flujo.readInt(), flujo.readUTF(), flujo.readLong(), flujo.readUTF());
    }
    
}