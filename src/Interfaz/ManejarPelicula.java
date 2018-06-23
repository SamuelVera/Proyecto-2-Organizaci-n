package Interfaz;

import Accesos.Cliente;
import Accesos.Indice;
import Accesos.Pelicula;
import Controladores.RandomAccessCliente;
import Controladores.RandomAccessPelicula;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedList;
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

        generos = new javax.swing.ButtonGroup();
        volver = new javax.swing.JButton();
        texto1 = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        texto3 = new javax.swing.JLabel();
        campoTitulo = new javax.swing.JTextField();
        buscar1 = new javax.swing.JButton();
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
        accion = new javax.swing.JRadioButton();
        terror = new javax.swing.JRadioButton();
        fantasia = new javax.swing.JRadioButton();
        comedia = new javax.swing.JRadioButton();
        drama = new javax.swing.JRadioButton();
        historia = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        volver.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 90, 20));

        texto1.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        texto1.setText("Buscar por Género:");
        getContentPane().add(texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 160, -1));

        texto2.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        texto2.setText("Buscar por Rating:");
        getContentPane().add(texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 160, -1));

        texto3.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        texto3.setText("Buscar por Título:");
        getContentPane().add(texto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, -1));

        campoTitulo.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        getContentPane().add(campoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 420, 30));

        buscar1.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        buscar1.setText("Buscar");
        buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar1ActionPerformed(evt);
            }
        });
        getContentPane().add(buscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 80, 20));

        buscar2.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        buscar2.setText("Buscar");
        buscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar2ActionPerformed(evt);
            }
        });
        getContentPane().add(buscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 80, 20));

        CampoRating.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        CampoRating.setMaximumRowCount(6);
        CampoRating.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
        getContentPane().add(CampoRating, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 80, -1));

        buscar3.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        buscar3.setText("Buscar");
        buscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar3ActionPerformed(evt);
            }
        });
        getContentPane().add(buscar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 80, 20));

        res1.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        res1.setText("Título: ");
        getContentPane().add(res1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 430, 30));

        res2.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        res2.setText("Género: ");
        getContentPane().add(res2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 430, 30));

        res4.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        res4.setText("Precio de alquiler: ");
        getContentPane().add(res4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 270, 30));

        res3.setEditable(false);
        res3.setColumns(20);
        res3.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        res3.setRows(5);
        res3.setText("Descripción:");
        jScrollPane1.setViewportView(res3);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 420, 110));

        eliminar.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        eliminar.setText("Eliminar Película");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 160, 20));

        IrAgregar.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        IrAgregar.setText("Agregar Película");
        IrAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IrAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(IrAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 160, 20));

        res6.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        res6.setText("Rating: ");
        getContentPane().add(res6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 150, 30));

        res5.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        res5.setText("Stock: ");
        getContentPane().add(res5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 430, 30));

        comprar.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        comprar.setText("Alquilar Película");
        comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarActionPerformed(evt);
            }
        });
        getContentPane().add(comprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 160, 20));

        modificar.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        modificar.setText("Modificar Película");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        getContentPane().add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 160, 20));

        generos.add(accion);
        accion.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        accion.setText("Acción");
        getContentPane().add(accion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        generos.add(terror);
        terror.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        terror.setText("Terror");
        getContentPane().add(terror, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        generos.add(fantasia);
        fantasia.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        fantasia.setText("Fantasía");
        getContentPane().add(fantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        generos.add(comedia);
        comedia.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        comedia.setText("Comedia");
        getContentPane().add(comedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        generos.add(drama);
        drama.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        drama.setText("Drama");
        getContentPane().add(drama, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        generos.add(historia);
        historia.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        historia.setText("Historia");
        getContentPane().add(historia, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar3ActionPerformed
        if(this.CampoRating.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(this, "¡Seleccione un rating!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Object o = null;
        
        if(this.CampoRating.getSelectedIndex() == 0){
            o = VenInicio.indSecRatPeli.get(0);
        }else if(this.CampoRating.getSelectedIndex() == 1){
            o = VenInicio.indSecRatPeli.get(1);
        }else if(this.CampoRating.getSelectedIndex() == 2){
            o = VenInicio.indSecRatPeli.get(2);
        }else if(this.CampoRating.getSelectedIndex() == 3){
            o = VenInicio.indSecRatPeli.get(3);
        }else if(this.CampoRating.getSelectedIndex() == 4){
            o = VenInicio.indSecRatPeli.get(4);
        }else if(this.CampoRating.getSelectedIndex() == 5){
            o = VenInicio.indSecRatPeli.get(5);
        }
        
        Object[] aux = ((Indice)o).getApunta().toArray();
        String aux2 = "";
        for(int i=0;i<aux.length;i++){
            aux2 = aux2+(String)aux[i]+". ";
        }
        
        JOptionPane.showMessageDialog(this, aux2, "Coincidencias encontradas: "+aux.length, HEIGHT);
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
            if(p.getStock() == 0){
                String auxNom = "", auxApe = "";
                char[] aux2 = p.getUltimo().toCharArray();
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
                Date s1 = new Date(p.getFechaUlt());
                this.res5.setText("Stock: 0, Último cliente en alquilar: "+auxNom+" "+auxApe+" Fecha de devolución: "+s1.toString());
            }else{
                this.res5.setText("Stock: "+p.getStock()+" Unidades");
            }
            this.res6.setText("Rating: "+p.getRating());
        } catch (IOException ex) {
            Logger.getLogger(ManejarPelicula.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.comprar.setVisible(true);
        this.eliminar.setVisible(true);
        this.modificar.setVisible(true);
    }//GEN-LAST:event_buscar1ActionPerformed

    private void buscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar2ActionPerformed
        if(this.generos.isSelected(null)){
            JOptionPane.showMessageDialog(this, "¡Seleccione un género!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Object o = null;
        
        if(this.generos.isSelected(this.accion.getModel())){
            o = VenInicio.indSecGenPeli.get(0);
        }else if(this.generos.isSelected(this.comedia.getModel())){
            o = VenInicio.indSecGenPeli.get(1);
        }else if(this.generos.isSelected(this.drama.getModel())){
            o = VenInicio.indSecGenPeli.get(2);
        }else if(this.generos.isSelected(this.fantasia.getModel())){
            o = VenInicio.indSecGenPeli.get(3);
        }else if(this.generos.isSelected(this.historia.getModel())){
            o = VenInicio.indSecGenPeli.get(4);
        }else if(this.generos.isSelected(this.terror.getModel())){
            o = VenInicio.indSecGenPeli.get(5);
        }
        
        Object[] aux = ((Indice)o).getApunta().toArray();
        String aux2 = "";
        for(int i=0;i<aux.length;i++){
            aux2 = aux2+(String)aux[i]+". ";
        }
        
        JOptionPane.showMessageDialog(this, aux2, "Coincidencias encontradas: "+aux.length, HEIGHT);
        
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
        AgregarPelicula aux;
        try {
            aux = new AgregarPelicula(this.peliModi);
            aux.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(ManejarPelicula.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_modificarActionPerformed

    private void comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarActionPerformed
        
        try {
            if(RandomAccessPelicula.buscarReg(this.peliModi.getNumReg()).getStock() == 0){
                JOptionPane.showMessageDialog(this, "¡No hay copias de la película en el stock!", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
            }
        } catch (IOException ex) {
            Logger.getLogger(ManejarPelicula.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String s = JOptionPane.showInputDialog(this, "CI: ", "Ingrese cédula del cliente que va a alquilar", JOptionPane.INFORMATION_MESSAGE);
        if(s.length() == 0){
            JOptionPane.showMessageDialog(this, "¡Se debe llenar el campo!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(Integer.parseInt(s) <= 0){
            JOptionPane.showMessageDialog(this, "¡No existe cédula negativa!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        
        int ci = Integer.parseInt(s.trim());
        int aux = VenInicio.BusBin(ci, VenInicio.indClien);
        
        if(aux == -1){
            JOptionPane.showMessageDialog(this, "¡No existe cliente registrado por esa cédula!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try {
                //Datos a manejar
            Cliente c = RandomAccessCliente.buscarReg(aux);
            Pelicula p = RandomAccessPelicula.buscarReg(this.peliModi.getNumReg());
            
                //Validaciones
            if(!"0".equals(c.getPelicula())){
                JOptionPane.showMessageDialog(this, "¡El cliente ya ha alquilado una película!", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            boolean pasa = false;
            int dias = 1;
            while(pasa == false){
                s = JOptionPane.showInputDialog(this, "Días: ", "Ingrese días de alquier (Máximo 9)", JOptionPane.INFORMATION_MESSAGE);
                dias = Integer.parseInt(s);
                if(dias <= 0 || dias > 9){
                    JOptionPane.showMessageDialog(this, "¡Ingresar entre 1 y 9 días!", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }else{
                    pasa = true;
                }
            }
            
                //Actualización de fecha
            Date alq = new Date();
            c.setPelicula(p.getTitulo());
            c.setFechaAlq(alq.getTime());
            c.setFechaVenc(alq.getTime()+(86400000*dias));
            
                //Actualización de stock
            p.setStock(p.getStock()-1);
            if(p.getStock() == 0){
                p.setUltimo(c.getNomape());
                p.setFechaUlt(c.getFechaDevol());
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
                Date s1 = new Date(p.getFechaUlt());
                this.res5.setText("Stock: 0, Último cliente en alquilar: "+auxNom+" "+auxApe+" Fecha de devolución: "+s1.toString());
            }else{
                this.res5.setText("Stock: "+p.getStock()+" Unidades");
            }
                //Actualización de los archivos
            RandomAccessCliente.ingresarReg(c, aux);
            RandomAccessPelicula.ingresarReg(p, this.peliModi.getNumReg());
            
            
        } catch (IOException ex) {
            Logger.getLogger(ManejarPelicula.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_comprarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CampoRating;
    private javax.swing.JButton IrAgregar;
    private javax.swing.JRadioButton accion;
    private javax.swing.JButton buscar1;
    private javax.swing.JButton buscar2;
    private javax.swing.JButton buscar3;
    private javax.swing.JTextField campoTitulo;
    private javax.swing.JRadioButton comedia;
    private javax.swing.JButton comprar;
    private javax.swing.JRadioButton drama;
    private javax.swing.JButton eliminar;
    private javax.swing.JRadioButton fantasia;
    private javax.swing.ButtonGroup generos;
    private javax.swing.JRadioButton historia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificar;
    private javax.swing.JLabel res1;
    private javax.swing.JLabel res2;
    private javax.swing.JTextArea res3;
    private javax.swing.JLabel res4;
    private javax.swing.JLabel res5;
    private javax.swing.JLabel res6;
    private javax.swing.JRadioButton terror;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel texto3;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
