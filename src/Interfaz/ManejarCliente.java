package Interfaz;

import Accesos.Cliente;
import Accesos.Indice;
import Controladores.RandomAccessCliente;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ManejarCliente extends javax.swing.JFrame {

    private Indice clienModi;
    
    public ManejarCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.modificar.setVisible(false);
        this.eliminar.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoCi = new javax.swing.JTextField();
        texto1 = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        irAgregarCliente = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        texto2 = new javax.swing.JLabel();
        texto3 = new javax.swing.JLabel();
        texto4 = new javax.swing.JLabel();
        texto5 = new javax.swing.JLabel();
        texto6 = new javax.swing.JLabel();
        modificar = new javax.swing.JButton();
        devolver = new javax.swing.JButton();
        texto7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoCi.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        campoCi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCiActionPerformed(evt);
            }
        });
        campoCi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoCiKeyTyped(evt);
            }
        });
        getContentPane().add(campoCi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 350, 30));

        texto1.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        texto1.setText("Cédula del cliente: ");
        getContentPane().add(texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, -1));

        botonBuscar.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 80, -1));

        volver.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 80, 20));

        irAgregarCliente.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        irAgregarCliente.setText("Agregar Cliente");
        irAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irAgregarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(irAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 130, -1));

        eliminar.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        eliminar.setText("Eliminar Cliente");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 140, 20));

        texto2.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        texto2.setText("CI:");
        getContentPane().add(texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 104, 350, 20));

        texto3.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        texto3.setText("Nombre y Apellido:");
        getContentPane().add(texto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 350, 20));

        texto4.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        texto4.setText("Película alquilada:");
        getContentPane().add(texto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 350, 20));

        texto5.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        texto5.setText("Fecha de Alquiler:");
        getContentPane().add(texto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 350, 20));

        texto6.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        texto6.setText("Fecha máxima de devolución:");
        getContentPane().add(texto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 350, 20));

        modificar.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        modificar.setText("Modificar Datos");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        getContentPane().add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 140, 20));

        devolver.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        devolver.setText("Devolver Película");
        getContentPane().add(devolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 150, 20));
        getContentPane().add(texto7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        
        this.clienModi.setNumReg(-1);
        
        Object[] aux = VenInicio.indClien.toArray();
        int tope = 0, fondo = aux.length-1;
        int med = (tope+fondo)/2;
        
        while(((Indice)aux[med]).getClave() != this.clienModi.getClave()){
            if(this.clienModi.getClave() > ((Indice)aux[med]).getClave()){
                tope = med+1;
                if(((Indice)aux[med]).getClave() == this.clienModi.getClave()){
                    break;
                }
            }else{
                fondo = med-1;
                if(((Indice)aux[med]).getClave() == this.clienModi.getClave()){
                    break;
                }
            }
            med = (tope+fondo)/2;
        }
        
        VenInicio.indClien.remove(med);
        VenInicio.indClien.add(med, this.clienModi);
        
        this.eliminar.setVisible(false);
        this.modificar.setVisible(false);
        this.texto2.setText("CI:");
        this.texto3.setText("Nombre y Apellido: ");
        this.texto4.setText("Película alquilada: ");
        this.texto5.setText("Fecha de alquiler: ");
        this.texto6.setText("Fecha máxima de devolución: ");
    }//GEN-LAST:event_eliminarActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        VenInicio aux = new VenInicio();
        aux.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
            //Validación de un campo vacio
        if(this.campoCi.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(this, "¡No se ingreso una cédula para buscar!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
            //Validación letras y números
        
        int ci = Integer.parseInt(this.campoCi.getText());
        
            //Buscar si existe el cliente
        int aux = VenInicio.BusBin(ci,VenInicio.indClien);
        if(aux == -1){
            JOptionPane.showMessageDialog(this, "¡No hay cliente que posea esa cédula!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
            //Extrar los datos del archivo
        try {
            
            Indice in = VenInicio.indClienAcc.buscarReg(aux);
            this.clienModi = in;
            
            Cliente c = RandomAccessCliente.buscarReg(in.getNumReg());
            
            String auxNom = "", auxApe = "";
            char[] aux2 = c.getNomape().toCharArray();
            int j=0;
            for(int i=0;i<aux2.length;i++){
                if(aux2[i]==37){
                    j++;
                }else{
                    if(j==0){
                        auxNom = auxNom+aux2[i];
                    }else{
                        auxApe = auxApe+aux2[i];
                    }
                }
            }
            
            this.texto2.setText("CI: "+c.getCi());
            this.texto3.setText("Nombre y Apellido: "+auxNom+" "+auxApe);
            if("0".equals(c.getPelicula())){
                this.texto4.setText("Película alquilada: 0");
                this.texto5.setText("Fecha de Alquiler: NA");
                this.texto6.setText("Fecha máxima de Devolución: NA");
            }else{
                this.texto4.setText("Película alquilada: "+c.getPelicula());
                Date fechaA = new Date(c.getFechaAlq());
                this.texto5.setText("Fecha de Alquiler: "+ fechaA.toString());
                fechaA = new Date(c.getFechaDevol());
                this.texto6.setText("Fecha máxima de Devolución: "+ fechaA.toString());
            }
            
        } catch (IOException ex) {
            Logger.getLogger(ManejarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.eliminar.setVisible(true);
        this.modificar.setVisible(true);
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void irAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irAgregarClienteActionPerformed
        AgregarCliente aux = new AgregarCliente();
        aux.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_irAgregarClienteActionPerformed

    private void campoCiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCiActionPerformed
        this.campoCi.setText("");
    }//GEN-LAST:event_campoCiActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        AgregarCliente aux;
        try {
            aux = new AgregarCliente(this.clienModi);
            aux.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(ManejarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_modificarActionPerformed

    private void campoCiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCiKeyTyped
        char validar = evt.getKeyChar();
            //Sin espacios ni letras
        if(Character.isLetter(validar) || Character.isSpaceChar(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "INGRESAR SOLO NÚMEROS","    ¡¡ERROR!!",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_campoCiKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JTextField campoCi;
    private javax.swing.JButton devolver;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton irAgregarCliente;
    private javax.swing.JButton modificar;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel texto3;
    private javax.swing.JLabel texto4;
    private javax.swing.JLabel texto5;
    private javax.swing.JLabel texto6;
    private javax.swing.JLabel texto7;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
