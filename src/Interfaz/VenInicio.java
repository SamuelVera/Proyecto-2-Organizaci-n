package Interfaz;

import Accesos.Cliente;
import Accesos.Indice;
import Accesos.Pelicula;
import Controladores.RandomAccessCliente;
import Controladores.RandomAccessIndex;
import Controladores.RandomAccessPelicula;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;



public class VenInicio extends javax.swing.JFrame {

    protected static LinkedList indClien = new LinkedList();
    protected static RandomAccessIndex indClienAcc = new RandomAccessIndex();
    protected static LinkedList indPrimPeli = new LinkedList();
    protected static RandomAccessIndex indPrimPeliAcc = new RandomAccessIndex();
    protected static LinkedList indSecGenPeli = new LinkedList();
    protected static LinkedList indSecRatPeli = new LinkedList();
        
    public VenInicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public static Object[] ordenarClavesString(LinkedList l){
        Object[] arreglo = l.toArray();
        l.clear();
        
            //Ordenar por cédulas en la estructura auxiliar
        for(int i=0; i<arreglo.length-1;i++){
                String menor = ((Indice)arreglo[i]).getClave2();
                int posMenor = i;
                Object aux;
                for(int j=i+1;j<arreglo.length;j++){
                    if(menor.compareTo(((Indice)(arreglo[j])).getClave2()) > 0){
                        posMenor = j;
                        menor = ((Indice)arreglo[j]).getClave2();
                    }
                aux = arreglo[i];
                arreglo[i] = arreglo[posMenor];
                arreglo[posMenor] = aux;
            }
        }
        
        return arreglo;
    }
    
    public static Object[] ordenarClaves(LinkedList l){
        
        Object[] arreglo = l.toArray();
        l.clear();
        
            //Ordenar por cédulas en la estructura auxiliar
        for(int i=0; i<arreglo.length-1;i++){
                int menor = ((Indice)arreglo[i]).getClave();
                int posMenor = i;
                Object aux;
                for(int j=i+1;j<arreglo.length;j++){
                    if(menor > ((Indice)arreglo[j]).getClave()){
                        posMenor = j;
                        menor = ((Indice)arreglo[j]).getClave();
                    }
                aux = arreglo[i];
                arreglo[i] = arreglo[posMenor];
                arreglo[posMenor] = aux;
            }
        }
        
        return arreglo;
        
    }
    
        //Búsqueda binaria de película
    public static int BusBin(int clave, LinkedList l){
        Object[] arreglo =  l.toArray();
        int tope = 0;
        int fondo = arreglo.length-1;
        int med = (tope+fondo)/2;
        
        while((tope<=fondo) && clave != ((Indice)arreglo[med]).getClave()){
            if(clave > ((Indice)arreglo[med]).getClave()){
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
            return ((Indice)arreglo[med]).getNumReg();
        }
    }
    
        //Búsqueda binaria de película
    public static int BusBinString(String clave, LinkedList l){
        Object[] arreglo = l.toArray();
        int tope = 0;
        int fondo = arreglo.length-1;
        int med = (tope+fondo)/2;
        
        while((tope<=fondo) && !clave.equals(((Indice)arreglo[med]).getClave2())){
            if(clave.compareTo(((Indice)arreglo[med]).getClave2()) > 0){
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
            return ((Indice)arreglo[med]).getNumReg();
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
            VenInicio.indClienAcc.RespaldoFinalInt(VenInicio.indClien);
            VenInicio.indPrimPeliAcc.RespaldoFinalString(VenInicio.indPrimPeli);
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
        File f3 = new File("Llaves_Cliente.txt");
        File f4 = new File("Llaves_Principales_Peliculas.txt");

        
        RandomAccessCliente.crearFlujo(f);
        RandomAccessPelicula.crearFlujo(f2);
        
        if(f3.exists()){
            VenInicio.indClienAcc.crearFlujo(f3);
                //Cargar el respaldo clave de clientes
            Indice[] aux = VenInicio.indClienAcc.ExtraerAllRegInt();
            for(int i=0;i<aux.length;i++){
                VenInicio.indClien.addLast(aux[i]);
            }
            
        }else{
            VenInicio.indClienAcc.crearFlujo(f3);
        }
        
        if(f4.exists()){
            VenInicio.indPrimPeliAcc.crearFlujo(f4);
                //Cargar el respaldo clave primaria de películas
            Indice[] aux = VenInicio.indPrimPeliAcc.ExtraerAllRegString();
            
            LinkedList g1 = new LinkedList();
            LinkedList g2 = new LinkedList();
            LinkedList g3 = new LinkedList();
            LinkedList g4 = new LinkedList();
            LinkedList g5 = new LinkedList();
            LinkedList g6 = new LinkedList();
            
            LinkedList r0 = new LinkedList();
            LinkedList r1 = new LinkedList();
            LinkedList r2 = new LinkedList();
            LinkedList r3 = new LinkedList();
            LinkedList r4 = new LinkedList();
            LinkedList r5 = new LinkedList();
            
            Pelicula p;
            for(int i=0;i<aux.length;i++){
                
                if(aux[i].getNumReg() != -1){
                    p = RandomAccessPelicula.buscarReg(aux[i].getNumReg());
                
                    if(p.getRating() == 0){
                        r0.addLast(p.getTitulo());
                    }else if(p.getRating() == 1){
                        r1.addLast(p.getTitulo());
                    }else if(p.getRating() == 2){
                        r2.addLast(p.getTitulo());
                    }else if(p.getRating() == 3){
                        r3.addLast(p.getTitulo());
                    }else if(p.getRating() == 4){
                        r4.addLast(p.getTitulo());
                    }else if(p.getRating() == 5){
                        r5.addLast(p.getTitulo());
                    }
                
                    if("Accion".equals(p.getGenero())){
                        g1.addLast(p.getTitulo());
                    }else if("Comedia".equals(p.getGenero())){
                        g2.addLast(p.getTitulo());
                    }else if("Drama".equals(p.getGenero())){
                        g3.addLast(p.getTitulo());
                    }else if("Fantasia".equals(p.getGenero())){
                        g4.addLast(p.getTitulo());
                    }else if("Historia".equals(p.getGenero())){
                        g5.addLast(p.getTitulo());
                    }else if("Terror".equals(p.getGenero())){
                        g6.addLast(p.getTitulo());
                    }
                }
                VenInicio.indPrimPeli.addLast(aux[i]);
            }
            
            VenInicio.indSecGenPeli.addLast(new Indice("accion",g1));
            VenInicio.indSecGenPeli.addLast(new Indice("comedia",g2));
            VenInicio.indSecGenPeli.addLast(new Indice("drama",g3));
            VenInicio.indSecGenPeli.addLast(new Indice("fantasia",g4));
            VenInicio.indSecGenPeli.addLast(new Indice("historia",g5));
            VenInicio.indSecGenPeli.addLast(new Indice("terror",g6));
            
            VenInicio.indSecRatPeli.addLast(new Indice(0,r0));
            VenInicio.indSecRatPeli.addLast(new Indice(1,r1));
            VenInicio.indSecRatPeli.addLast(new Indice(2,r2));
            VenInicio.indSecRatPeli.addLast(new Indice(3,r3));
            VenInicio.indSecRatPeli.addLast(new Indice(4,r4));
            VenInicio.indSecRatPeli.addLast(new Indice(5,r5));
            
        }else{
            VenInicio.indSecGenPeli.addLast(new Indice("accion",new LinkedList()));
            VenInicio.indSecGenPeli.addLast(new Indice("comedia",new LinkedList()));
            VenInicio.indSecGenPeli.addLast(new Indice("drama",new LinkedList()));
            VenInicio.indSecGenPeli.addLast(new Indice("fantasia",new LinkedList()));
            VenInicio.indSecGenPeli.addLast(new Indice("historia",new LinkedList()));
            VenInicio.indSecGenPeli.addLast(new Indice("terror",new LinkedList()));
            
            VenInicio.indSecRatPeli.addLast(new Indice(0,new LinkedList()));
            VenInicio.indSecRatPeli.addLast(new Indice(1,new LinkedList()));
            VenInicio.indSecRatPeli.addLast(new Indice(2,new LinkedList()));
            VenInicio.indSecRatPeli.addLast(new Indice(3,new LinkedList()));
            VenInicio.indSecRatPeli.addLast(new Indice(4,new LinkedList()));
            VenInicio.indSecRatPeli.addLast(new Indice(5,new LinkedList()));
            
            VenInicio.indPrimPeliAcc.crearFlujo(f4);
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