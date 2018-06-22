package Interfaz;

import Accesos.Indice;
import Accesos.Pelicula;
import Controladores.RandomAccessPelicula;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ManejarPelicula extends javax.swing.JFrame {

    private Indice peliModi;
    
    public ManejarPelicula() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.comprar.setVisible(false);
        this.eliminar.setVisible(false);
        this.modificar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        volver = new javax.swing.JButton();
        texto1 = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        texto3 = new javax.swing.JLabel();
        campoTitulo = new javax.swing.JTextField();
        buscar1 = new javax.swing.JButton();
        campoGenero = new javax.swing.JTextField();
        buscar2 = new javax.swing.JButton();
        CampoRating = new javax.swing.JComboBox<>();
        buscar3 = new javax.swing.JButton();
        res1 = new javax.swing.JLabel();
        res2 = new javax.swing.JLabel();
        res4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        res3 = new javax.swing.JTextArea();
        eliminar = new javax.swing.JButton();
        IrAgregar = new javax.swing.JButton();
        res6 = new javax.swing.JLabel();
        res5 = new javax.swing.JLabel();
        comprar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        volver.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        volver.setText("Volver a Ventana Principal");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 170, 20));

        texto1.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        texto1.setText("Buscar por Género:");
        getContentPane().add(texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 160, -1));

        texto2.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        texto2.setText("Buscar por Rating:");
        getContentPane().add(texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 160, -1));

        texto3.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        texto3.setText("Buscar por Título:");
        getContentPane().add(texto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, -1));

        campoTitulo.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        getContentPane().add(campoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 420, 30));

        buscar1.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        buscar1.setText("Buscar");
        buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar1ActionPerformed(evt);
            }
        });
        getContentPane().add(buscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 80, 20));

        campoGenero.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        getContentPane().add(campoGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 420, 30));

        buscar2.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        buscar2.setText("Buscar");
        buscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar2ActionPerformed(evt);
            }
        });
        getContentPane().add(buscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 80, 20));

        CampoRating.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        CampoRating.setMaximumRowCount(6);
        CampoRating.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "4", "3", "2", "1", "0" }));
        getContentPane().add(CampoRating, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 70, -1));

        buscar3.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        buscar3.setText("Buscar");
        buscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar3ActionPerformed(evt);
            }
        });
        getContentPane().add(buscar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 70, -1));

        res1.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        res1.setText("Título: ");
        getContentPane().add(res1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 450, 30));

        res2.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        res2.setText("Género: ");
        getContentPane().add(res2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 450, 30));

        res4.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        res4.setText("Precio de alquiler: ");
        getContentPane().add(res4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 450, 30));

        res3.setEditable(false);
        res3.setColumns(20);
        res3.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        res3.setRows(5);
        res3.setText("Descripción:");
        jScrollPane1.setViewportView(res3);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 420, 110));

        eliminar.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        eliminar.setText("Eliminar Película");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 160, 20));

        IrAgregar.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        IrAgregar.setText("Agregar Película");
        IrAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IrAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(IrAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 160, 20));

        res6.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        res6.setText("Rating: ");
        getContentPane().add(res6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 150, 30));

        res5.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        res5.setText("Stock: ");
        getContentPane().add(res5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 310, 30));

        comprar.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        comprar.setText("Alquilar Película");
        getContentPane().add(comprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 160, 20));

        modificar.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        modificar.setText("Modificar Película");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        getContentPane().add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 160, 20));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar3ActionPerformed
        
    }//GEN-LAST:event_buscar3ActionPerformed

    private void IrAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrAgregarActionPerformed
        AgregarPelicula aux = new AgregarPelicula();
        aux.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_IrAgregarActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        VenInicio aux = new VenInicio();
        aux.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void buscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar1ActionPerformed
        if(this.campoTitulo.getText().trim().length()==0){
            JOptionPane.showMessageDialog(this, "¡No se ingreso un título!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int aux = VenInicio.BusBinString(this.campoTitulo.getText(),VenInicio.indPrimPeli);
        
        if(aux == -1){
            JOptionPane.showMessageDialog(this, "¡No existe película por ese título!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try {
            this.peliModi = VenInicio.indPrimPeliAcc.buscarRegString(aux);
        } catch (IOException ex) {
            Logger.getLogger(ManejarPelicula.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Pelicula p = RandomAccessPelicula.buscarReg(aux);
            this.res1.setText("Título: "+p.getTitulo());
            this.res2.setText("Género: "+p.getGenero());
            this.res3.setText("Descripción: "+p.getDescripcion());
            this.res4.setText("Precio de Alquiler: "+p.getPrecioDia()+" Bs/Día");
            this.res5.setText("Stock: "+p.getStock()+" Unidades");
            this.res6.setText("Rating: "+p.getRating());
        } catch (IOException ex) {
            Logger.getLogger(ManejarPelicula.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.comprar.setVisible(true);
        this.eliminar.setVisible(true);
        this.modificar.setVisible(true);
    }//GEN-LAST:event_buscar1ActionPerformed

    private void buscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar2ActionPerformed
        
    }//GEN-LAST:event_buscar2ActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        this.peliModi.setNumReg(-1);
        
        Object[] aux = VenInicio.indPrimPeli.toArray();
        int tope = 0, fondo = aux.length-1;
        int med = (tope+fondo)/2;
        
        while(!((Indice)aux[med]).getClave2().equals(this.peliModi.getClave2())){
            if(this.peliModi.getClave2().compareTo(((Indice)aux[med]).getClave2()) > 0){
                tope = med+1;
                if(((Indice)aux[med]).getClave2().equals(this.peliModi.getClave2())){
                    break;
                }
            }else{
                fondo = med-1;
                if(((Indice)aux[med]).getClave2().equals(this.peliModi.getClave2())){
                    break;
                }
            }
            med = (tope+fondo)/2;
        }
        
        VenInicio.indPrimPeli.remove(med);
        VenInicio.indPrimPeli.add(med, this.peliModi);
        
        this.res1.setText("Título: ");
            this.res2.setText("Género: ");
            this.res3.setText("Descripción: ");
            this.res4.setText("Precio de Alquiler: ");
            this.res5.setText("Stock: ");
            this.res6.setText("Rating: ");
    }//GEN-LAST:event_eliminarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        
    }//GEN-LAST:event_modificarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CampoRating;
    private javax.swing.JButton IrAgregar;
    private javax.swing.JButton buscar1;
    private javax.swing.JButton buscar2;
    private javax.swing.JButton buscar3;
    private javax.swing.JTextField campoGenero;
    private javax.swing.JTextField campoTitulo;
    private javax.swing.JButton comprar;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificar;
    private javax.swing.JLabel res1;
    private javax.swing.JLabel res2;
    private javax.swing.JTextArea res3;
    private javax.swing.JLabel res4;
    private javax.swing.JLabel res5;
    private javax.swing.JLabel res6;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel texto3;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
