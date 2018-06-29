package Interfaz;

import Accesos.Cliente;
import Accesos.Indice;
import Accesos.Pelicula;
import Controladores.RandomAccessCliente;
import Controladores.RandomAccessPelicula;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AgregarCliente extends javax.swing.JFrame {
    
    private Indice in;
    
        //Agregar a un cliente
    public AgregarCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.modificar.setVisible(false);
    }

        //Cambiar info del cliente
    public AgregarCliente(Indice in) throws IOException {
        initComponents();
        this.setLocationRelativeTo(null);
        this.agregar.setVisible(false);
        this.in = in;
        Cliente c = RandomAccessCliente.buscarReg(in.getNumReg());
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
        campo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo1ActionPerformed(evt);
            }
        });
        campo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo1KeyTyped(evt);
            }
        });
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
        
        int ci = Integer.parseInt(this.campo1.getText().trim());
        String nomape = this.campo2.getText() +"%"+ this.campo3.getText();
        
            //Verificar si ya se ha añadido esa cédula
        if(VenInicio.BusBin(ci,VenInicio.indClien)!= -1){
            JOptionPane.showMessageDialog(this, "¡Ya existe cliente con esa cédula!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
            //Nuevo cliente que agregar
        Cliente c = new Cliente(ci, nomape, 0, "0", 0);
        
            //Agregar clave principal del cliente
        Indice in = new Indice(c.getCi(),"",RandomAccessCliente.getRegNum());
        VenInicio.indClien.addLast(in);
        
            //Ordenar indices
        Object[] aux = VenInicio.ordenarClaves(VenInicio.indClien);
        VenInicio.indClien.clear();
        
        for(int i=0;i<aux.length;i++){
            VenInicio.indClien.addLast(aux[i]);
        }
        
            //Escritura de los datos en el archivo
        try {
            RandomAccessCliente.ingresarReg(c);
            VenInicio.indClienAcc.ingresarRegInt(in,in.getNumReg());
        } catch (IOException ex) {
            Logger.getLogger(AgregarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            //Salir
        ManejarCliente aux2 = new ManejarCliente();
        aux2.setVisible(true);
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
        
        try {
            
            String nomape = this.campo2.getText() +"%"+ this.campo3.getText();
            Cliente c = RandomAccessCliente.buscarReg(this.in.getNumReg());
            
                //Verificar si no existe cliente con esa cédula y distinto a la que se está buscando
            int ci = Integer.parseInt(this.campo1.getText().trim());
            if(VenInicio.BusBin(ci, VenInicio.indClien) != -1 && ci != c.getCi() ){
                JOptionPane.showMessageDialog(this, "¡Ya existe cliente con esa cédula!", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            c.setCi(ci);
            c.setNomape(nomape);
            
            Object[] aux = VenInicio.indClien.toArray();
            int tope = 0, fondo = aux.length-1;
            int med = (tope+fondo)/2;
            
                //Buscando en el índice el que reemplazar
            while(((Indice)aux[med]).getClave() != this.in.getClave()){
                if(this.in.getClave() > ((Indice)aux[med]).getClave()){
                    tope = med+1;
                    if(((Indice)aux[med]).getClave() == this.in.getClave()){
                        break;
                    }
                }else{
                    fondo = med-1;
                    if(((Indice)aux[med]).getClave() == this.in.getClave()){
                        break;
                   }
                }
                med = (tope+fondo)/2;
            }
            
                //Se actualiza el índice
            this.in.setClave(ci);
            VenInicio.indClien.remove(med);
            VenInicio.indClien.add(med,this.in);
            
            RandomAccessCliente.ingresarReg(c,this.in.getNumReg());
            
            if(!"0".equals(c.getPelicula())){
                int aux2 = VenInicio.BusBinString(c.getPelicula(), VenInicio.indPrimPeli);
                Pelicula p = RandomAccessPelicula.buscarReg(aux2);
                p.setUltimo(nomape);
                RandomAccessPelicula.ingresarReg(p,aux2);
            }
            
        } catch (IOException ex) {
            Logger.getLogger(AgregarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            //Salir
        ManejarCliente aux = new ManejarCliente();
        aux.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_modificarActionPerformed

    private void campo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo1ActionPerformed
        
    }//GEN-LAST:event_campo1ActionPerformed

    private void campo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo1KeyTyped
        char validar = evt.getKeyChar();
            //Sin espacios ni letras
        if(Character.isLetter(validar) || Character.isSpaceChar(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "INGRESAR SOLO NÚMEROS","    ¡¡ERROR!!",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_campo1KeyTyped

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
