package Interfaz;

import Accesos.Cliente;
import Controladores.RandomAccessCliente;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AgregarCliente extends javax.swing.JFrame {
    
    private Cliente clienModi;
    
        //Agregar a un cliente
    public AgregarCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.modificar.setVisible(false);
    }

        //Cambiar info del cliente
    public AgregarCliente(Cliente c) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.agregar.setVisible(false);
        this.clienModi = c;
        this.campo1.setText(((Integer)c.getCi()).toString());
        String auxNom = "", auxApe = "";
        char[] aux = c.getNomape().toCharArray();
        int j=0;
        for(int i=0;i<aux.length;i++){
            if(aux[i]==37){
                j++;
            }else{
                if(j==0){
                    auxNom = auxNom+aux[i];
                }else{
                    auxApe = auxApe+aux[i];
                }
            }
        }
        this.campo2.setText(auxNom);
        this.campo3.setText(auxApe);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        volver = new javax.swing.JButton();
        agregar = new javax.swing.JButton();
        texto1 = new javax.swing.JLabel();
        campo1 = new javax.swing.JTextField();
        texto2 = new javax.swing.JLabel();
        texto3 = new javax.swing.JLabel();
        campo2 = new javax.swing.JTextField();
        campo3 = new javax.swing.JTextField();
        modificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        volver.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        volver.setText("Cancelar");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 90, 20));

        agregar.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        getContentPane().add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 80, 20));

        texto1.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        texto1.setText("Cédula de Identidad:");
        getContentPane().add(texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 20));

        campo1.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        getContentPane().add(campo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 380, 30));

        texto2.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        texto2.setText("Nombre:");
        getContentPane().add(texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 280, 20));

        texto3.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        texto3.setText("Apellido:");
        getContentPane().add(texto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 280, 20));

        campo2.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        getContentPane().add(campo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 380, 30));

        campo3.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        getContentPane().add(campo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 380, 30));

        modificar.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        getContentPane().add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 100, 20));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        ManejarCliente aux = new ManejarCliente();
        aux.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
            //Validaciones
        if(this.campo1.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(this, "¡No se ingreso la cédula!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(this.campo2.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(this, "¡No se ingreso el nombre del cliente!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(this.campo3.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(this, "¡No se ingreso Apellido!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if((this.campo2.getText().trim().length()+this.campo3.getText().trim().length()) > 40){
            JOptionPane.showMessageDialog(this, "¡Exece los 40 caractéres de campo!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
            //Validación de números
        
        int ci = Integer.parseInt(this.campo1.getText());
        String nomape = this.campo2.getText() +"%"+ this.campo3.getText();
        
            //Verificar si ya se ha añadido esa cédula
        if(VenInicio.BusBinCi(ci)!= -1){
            JOptionPane.showMessageDialog(this, "¡Ya existe cliente con esa cédula!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Cliente c = new Cliente(true, ci, nomape, 0, "0", 0, VenInicio.clientes.size());
        VenInicio.clientes.add(c);
        
        
            //Escritura de los datos en el archivo
        try {
            RandomAccessCliente.ingresarReg(c);
        } catch (IOException ex) {
            Logger.getLogger(AgregarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        VenInicio.ordenarClien();
        
            //Salir
        ManejarCliente aux = new ManejarCliente();
        aux.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_agregarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        
            //Validaciones
        if(this.campo1.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(this, "¡No se ingreso la cédula!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(Integer.parseInt(this.campo1.getText()) < 0){
            JOptionPane.showMessageDialog(this, "¡No existen cédulas negativas!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(this.campo2.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(this, "¡No se ingreso el nombre del cliente!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(this.campo3.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(this, "¡No se ingreso Apellido!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if((this.campo2.getText().trim().length()+this.campo3.getText().trim().length()) > 40){
            JOptionPane.showMessageDialog(this, "¡Exece los 40 caractéres de campo!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
            //Validación de números
        
        this.clienModi.setCi(Integer.parseInt(this.campo1.getText()));
        this.clienModi.setNomape(this.campo2.getText()+"%"+this.campo3.getText());
        
        try {
            
            RandomAccessCliente.eliminarReg(this.clienModi.getPosReg());
            
            this.clienModi.setPosReg(VenInicio.clientes.size());
            RandomAccessCliente.ingresarReg(this.clienModi);
            VenInicio.clientes.add(this.clienModi);
            
            
        } catch (IOException ex) {
            Logger.getLogger(AgregarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        VenInicio.ordenarClien();
        
            //Salir
        ManejarCliente aux = new ManejarCliente();
        aux.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_modificarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JTextField campo1;
    private javax.swing.JTextField campo2;
    private javax.swing.JTextField campo3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton modificar;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel texto3;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
