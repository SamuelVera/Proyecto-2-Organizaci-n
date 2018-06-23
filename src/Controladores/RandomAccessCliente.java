package Controladores;

    //Imports I/O
import Accesos.Cliente;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessCliente {
    
    private static RandomAccessFile flujo;
    private static int RegNum;
    private static int RegTam = 100;
    
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
    
        //Añadir nuevo registro con datos
    public static void ingresarReg(Cliente c) throws IOException{
            //Posición del archivo
        flujo.seek(RegTam*RegNum);
            //Escribir en la posición
        flujo.writeInt(c.getCi());
        flujo.writeUTF(c.getNomape());
        flujo.writeLong(c.getFechaAlq());
        flujo.writeUTF(c.getPelicula());
        flujo.writeLong(c.getFechaDevol());
        RegNum++;
    }
    
    public static void ingresarReg(Cliente c, int pos) throws IOException{
            //Posición del archivo
        flujo.seek(RegTam*pos);
            //Escribir en la posición
        flujo.writeInt(c.getCi());
        flujo.writeUTF(c.getNomape());
        flujo.writeLong(c.getFechaAlq());
        flujo.writeUTF(c.getPelicula());
        flujo.writeLong(c.getFechaDevol());
    }
    
        //Extraer toda la información del registro
    public static Cliente buscarReg(int posReg) throws IOException{
        long pos = posReg*RegTam;
        flujo.seek(pos);
        return new Cliente(flujo.readInt(),flujo.readUTF(),flujo.readLong(),flujo.readUTF(),flujo.readLong());
    }

}
