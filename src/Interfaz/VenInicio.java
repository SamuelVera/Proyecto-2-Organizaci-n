package Interfaz;

import Accesos.Cliente;
import Accesos.Pelicula;
import Controladores.RandomAccessCliente;
import Controladores.RandomAccessPelicula;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;



public class VenInicio extends javax.swing.JFrame {

    protected static LinkedList clientes = new LinkedList();
    protected static LinkedList peliculas = new LinkedList();
        
    public VenInicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
        //Ordenar los clientes por su clave principal
    public static void ordenarClien(){
        
        Object[] clientes = VenInicio.clientes.toArray();
        VenInicio.clientes.clear();
        
            //Ordenar por cédulas en la estructura auxiliar
        for(int i=0; i<clientes.length-1;i++){
            if(clientes[i] != null){
                int menor = ((Cliente)clientes[i]).getCi();
                int posMenor = i;
                Object aux;
                for(int j=i+1;j<clientes.length;j++){
                    if(menor > ((Cliente)clientes[j]).getCi()){
                        posMenor = j;
                        menor = ((Cliente)clientes[j]).getCi();
                    }
                }
                aux = clientes[i];
                clientes[i] = clientes[posMenor];
                clientes[posMenor] = aux;
            }
        }
        
            //Llenar la estructura con datos organizados
        for(int i=0;i<clientes.length;i++){
            VenInicio.clientes.addLast(clientes[i]);
        }
    }
    
        //Ordenar clave primaria películas
    public static void ordenarPeli(){
        Object[] aux = VenInicio.peliculas.toArray();
        VenInicio.peliculas.clear();
        
            //Ordenar la estructura
        for(int i=0;i<aux.length-1;i++){
            int posMenor = i;
            Object aux2 = aux[i];
            for(int j=i;j<aux.length;j++){
                if(((Pelicula)aux[posMenor]).getTitulo().compareTo(((Pelicula)aux[j]).getTitulo()) >= 0){
                   posMenor = j;
                }
            }
            aux2 = aux[i];
            aux[i] = aux[posMenor];
            aux[posMenor] = aux2;
        }
        
            //Estructura ordenada
        for(int i=0;i<aux.length;i++){
            VenInicio.peliculas.addLast(aux[i]);
        }
    }
    
        //Búsqueda binaria de película
    public static int BusBinTit(String buscando){
        Object[] arreglo = VenInicio.peliculas.toArray();
        int tope = 0;
        int fondo = arreglo.length-1;
        int med = (tope+fondo)/2;
        
        while((tope<=fondo) && !((Pelicula)arreglo[med]).getTitulo().equals(buscando)){
            if(buscando.compareTo(((Pelicula)arreglo[med]).getTitulo())>=0){
                tope = med+1;
                med = (fondo+tope)/2;
            }else{
                fondo = med-1;
                med = (fondo+tope)/2;
            }
        }
        if(tope>fondo){
            return -1;
        }else{
            return ((Pelicula)arreglo[med]).getRegPos();
        }
    }
        //Búsqueda binaria por cédula
    public static int BusBinCi(int buscando){
        Object[] arreglo = VenInicio.clientes.toArray();
        int tope = 0;
        int fondo = arreglo.length-1;
        int med = (tope+fondo)/2;
        
        while((tope <= fondo) && ((Cliente)arreglo[med]).getCi() != buscando){
            if(buscando >= ((Cliente)arreglo[med]).getCi()){
                tope = med+1;
                med = (tope+fondo)/2;
            }else{
                fondo = med-1;
                med = (tope+fondo)/2;
            }
        }
        
        if(tope > fondo){
            return -1; //No se encontró nada
        }else{
            return ((Cliente)arreglo[med]).getPosReg();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        irManejarClientes = new javax.swing.JButton();
        irManejarPeliculas = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        fecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        irManejarClientes.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        irManejarClientes.setText("Manejar Clientes");
        irManejarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irManejarClientesActionPerformed(evt);
            }
        });
        getContentPane().add(irManejarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 210, 40));

        irManejarPeliculas.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        irManejarPeliculas.setText("Manejar Peliculas");
        irManejarPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irManejarPeliculasActionPerformed(evt);
            }
        });
        getContentPane().add(irManejarPeliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 210, 40));

        Salir.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 210, 40));
        getContentPane().add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 100, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        this.dispose();
        try {
            RandomAccessCliente.cerrarFlujo();
            RandomAccessPelicula.cerrarFlujo();
        } catch (IOException ex) {
            Logger.getLogger(VenInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void irManejarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irManejarClientesActionPerformed
        ManejarCliente aux = new ManejarCliente();
        aux.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_irManejarClientesActionPerformed

    private void irManejarPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irManejarPeliculasActionPerformed
        ManejarPelicula aux = new ManejarPelicula();
        aux.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_irManejarPeliculasActionPerformed

    public static void main(String args[]) throws FileNotFoundException, IOException {
        
        File f = new File("Clientes.txt");
        File f2 = new File("Peliculas.txt");
        
        if(f.exists()){
            RandomAccessCliente.crearFlujo(f);
            Cliente[] auxp = RandomAccessCliente.ExtraerAllReg();
            
            for(int i=0;i<auxp.length;i++){
                VenInicio.clientes.add(auxp[i]);
            }
            
            VenInicio.ordenarClien();
            
        }else{
            RandomAccessCliente.crearFlujo(f);
        }
        
        if(f2.exists()){
            RandomAccessPelicula.crearFlujo(f2);
            Pelicula[] auxp = RandomAccessPelicula.ExtraerAllReg();
            
            for(int i=0;i<auxp.length;i++){
                VenInicio.peliculas.add(auxp[i]);
            }
            
            VenInicio.ordenarPeli();
            
        }else{
            RandomAccessPelicula.crearFlujo(f2);
        }
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VenInicio().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JLabel fecha;
    private javax.swing.JButton irManejarClientes;
    private javax.swing.JButton irManejarPeliculas;
    // End of variables declaration//GEN-END:variables

}