package Controladores;

    //Imports I/O
import Accesos.Cliente;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.LinkedList;

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
    
        //Colocar condición para inhabilitar registro
    public static void eliminarReg(int posElim) throws IOException{
        flujo.seek(RegTam*posElim);
        Cliente c = buscarReg(posElim);
        c.setRegistroIsDisponible(false);
        ingresarReg(c);
    }
    
    
        //Añadir nuevo registro con datos
    public static void ingresarReg(Cliente c) throws IOException{
            //Posición del archivo
        flujo.seek(RegTam*c.getPosReg());
            //Escribir en la posición
        flujo.writeBoolean(c.registroIsDisponible());
        flujo.writeInt(c.getCi());
        flujo.writeUTF(c.getNomape());
        flujo.writeLong(c.getFechaAlq());
        flujo.writeUTF(c.getPelicula());
        flujo.writeLong(c.getFechaDevol());
        flujo.writeInt(c.getPosReg());
        RegNum++;
    }
    
        //Extraer toda la información del registro
    public static Cliente buscarReg(int posReg) throws IOException{
        long pos = posReg*RegTam;
        flujo.seek(pos);
        return new Cliente(flujo.readBoolean(),flujo.readInt(),flujo.readUTF(),flujo.readLong(),flujo.readUTF(),flujo.readLong(),flujo.readInt());
    }
    
        //Extraer toda la información de los registros
    public static Cliente[] ExtraerAllReg() throws IOException{
        Cliente[] aux = new Cliente[RegNum];
        for(int i=0;i<aux.length;i++){
            flujo.seek(i*RegTam);
            aux[i] = new Cliente(flujo.readBoolean(),flujo.readInt(),flujo.readUTF(),flujo.readLong(),flujo.readUTF(),flujo.readLong(),flujo.readInt());
        }
        return aux;
    }
}
