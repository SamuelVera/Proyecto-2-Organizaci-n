package Interfaz;

import Accesos.Indice;
import Accesos.Pelicula;
import Controladores.RandomAccessPelicula;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AgregarPelicula extends javax.swing.JFrame {

    private Indice in;
    
    public AgregarPelicula() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.modificar.setVisible(false);
    }
    
    public AgregarPelicula(Indice in) throws IOException{
        initComponents();
        this.setLocationRelativeTo(null);
        this.in = in;
        Pelicula p = RandomAccessPelicula.buscarReg(in.getNumReg());
        this.campo1.setText(p.getTitulo());
        if("Comedia".equals(p.getGenero())){
            this.comedia.getModel().setSelected(true);
        }else if("Drama".equals(p.getGenero())){
            this.drama.getModel().setSelected(true);
        }else if("Fantasia".equals(p.getGenero())){
            this.fantasia.getModel().setSelected(true);
        }else if("Historia".equals(p.getGenero())){
            this.historia.getModel().setSelected(true);
        }else if("Terror".equals(p.getGenero())){
            this.terror.getModel().setSelected(true);
        }else{
            this.accion.getModel().setSelected(true);
        }
        this.campo3.setText(p.getDescripcion());
        this.campo4.setText(""+p.getPrecioDia());
        this.campo6.setText(""+p.getStock());
        this.agregar.setVisible(false);
        this.rating.setSelectedIndex(p.getRating());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        generos = new javax.swing.ButtonGroup();
        texto1 = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        texto3 = new javax.swing.JLabel();
        texto4 = new javax.swing.JLabel();
        texto5 = new javax.swing.JLabel();
        campo6 = new javax.swing.JTextField();
        campo1 = new javax.swing.JTextField();
        campo4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        campo3 = new javax.swing.JTextArea();
        volver = new javax.swing.JButton();
        agregar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        texto6 = new javax.swing.JLabel();
        rating = new javax.swing.JComboBox<>();
        accion = new javax.swing.JRadioButton();
        comedia = new javax.swing.JRadioButton();
        drama = new javax.swing.JRadioButton();
        terror = new javax.swing.JRadioButton();
        fantasia = new javax.swing.JRadioButton();
        historia = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        texto1.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        texto1.setText("Título:");
        getContentPane().add(texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 30));

        texto2.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        texto2.setText("Género:");
        getContentPane().add(texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 70, 30));

        texto3.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        texto3.setText("Descripción:");
        getContentPane().add(texto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 100, 20));

        texto4.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        texto4.setText("Precio de alquiler por Día:");
        getContentPane().add(texto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 200, 30));

        texto5.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        texto5.setText("Stock:");
        getContentPane().add(texto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 60, 20));

        campo6.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        getContentPane().add(campo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 90, 20));

        campo1.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        getContentPane().add(campo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 320, 30));

        campo4.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        getContentPane().add(campo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 180, 30));

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        campo3.setColumns(20);
        campo3.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        campo3.setRows(5);
        jScrollPane1.setViewportView(campo3);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 380, 100));

        volver.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        volver.setText("Cancelar");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 90, 20));

        agregar.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        getContentPane().add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 90, 20));

        modificar.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        getContentPane().add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, 20));

        texto6.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        texto6.setText("Rating:");
        getContentPane().add(texto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 60, 20));

        rating.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
        getContentPane().add(rating, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 50, 20));

        generos.add(accion);
        accion.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        accion.setText("Acción");
        getContentPane().add(accion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        generos.add(comedia);
        comedia.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        comedia.setText("Comedia");
        getContentPane().add(comedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        generos.add(drama);
        drama.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        drama.setText("Drama");
        getContentPane().add(drama, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        generos.add(terror);
        terror.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        terror.setText("Terror");
        getContentPane().add(terror, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        generos.add(fantasia);
        fantasia.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        fantasia.setText("Fantasía");
        getContentPane().add(fantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        generos.add(historia);
        historia.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        historia.setText("Historia");
        getContentPane().add(historia, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        if(this.campo1.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(this, "¡No se ingreso el título!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(this.generos.isSelected(null)){
            JOptionPane.showMessageDialog(this, "¡No se seleccionó el género!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(this.campo3.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(this, "¡No se ingreso la descripción!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }else if(this.campo3.getText().trim().length() > 60){
            JOptionPane.showMessageDialog(this, "¡Se excedió la capacidad de caractares en la descripción(60)!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(this.campo4.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(this, "¡No se ingreso el precio de alquiler por día!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(this.campo6.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(this, "¡No se ingreso Stock de la película!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(this.rating.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(this, "¡Seleccione un rating válido!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
            //Verificar si hay una película por el mismo título
        if(VenInicio.BusBinString(this.campo1.getText(),VenInicio.indPrimPeli) != -1){
            JOptionPane.showMessageDialog(this, "¡Ya hay película por este nombre!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String genero;
        Object obj;
        
        if(this.generos.isSelected(this.comedia.getModel())){
            obj = VenInicio.indSecGenPeli.remove(1);
            genero = "Comedia";
            ((Indice)obj).AddLast(this.campo1.getText());
            VenInicio.indSecGenPeli.add(1, obj);
        }else if(this.generos.isSelected(this.drama.getModel())){
            obj = VenInicio.indSecGenPeli.remove(2);
            genero = "Drama";
            ((Indice)obj).AddLast(this.campo1.getText());
            VenInicio.indSecGenPeli.add(2, obj);
        }else if(this.generos.isSelected(this.fantasia.getModel())){
            obj = VenInicio.indSecGenPeli.remove(3);
            genero = "Fantasia";
            ((Indice)obj).AddLast(this.campo1.getText());
            VenInicio.indSecGenPeli.add(3, obj);
        }else if(this.generos.isSelected(this.historia.getModel())){
            obj = VenInicio.indSecGenPeli.remove(4);
            genero = "Historia";
            ((Indice)obj).AddLast(this.campo1.getText());
            VenInicio.indSecGenPeli.add(4, obj);
        }else if(this.generos.isSelected(this.terror.getModel())){
            obj = VenInicio.indSecGenPeli.remove(5);
            genero = "Terror";
            ((Indice)obj).AddLast(this.campo1.getText());
            VenInicio.indSecGenPeli.add(5, obj);
        }else{
            obj = VenInicio.indSecGenPeli.remove(0);
            genero = "Accion";
            ((Indice)obj).AddLast(this.campo1.getText());
            VenInicio.indSecGenPeli.add(0, obj);
        }
        
        if(this.rating.getSelectedIndex() == 0){
            obj = VenInicio.indSecRatPeli.remove(0);
            ((Indice)obj).AddLast(this.campo1.getText());
            VenInicio.indSecRatPeli.add(0, obj);
        }else if(this.rating.getSelectedIndex() == 1){
            obj = VenInicio.indSecRatPeli.remove(1);
            ((Indice)obj).AddLast(this.campo1.getText());
            VenInicio.indSecRatPeli.add(1, obj);
        }else if(this.rating.getSelectedIndex() == 2){
            obj = VenInicio.indSecRatPeli.remove(2);
            ((Indice)obj).AddLast(this.campo1.getText());
            VenInicio.indSecRatPeli.add(2, obj);
        }else if(this.rating.getSelectedIndex() == 3){
            obj = VenInicio.indSecRatPeli.remove(3);
            ((Indice)obj).AddLast(this.campo1.getText());
            VenInicio.indSecRatPeli.add(3, obj);
        }else if(this.rating.getSelectedIndex() == 4){
            obj = VenInicio.indSecRatPeli.remove(4);
            ((Indice)obj).AddLast(this.campo1.getText());
            VenInicio.indSecRatPeli.add(4, obj);
        }else if(this.rating.getSelectedIndex() == 5){
            obj = VenInicio.indSecRatPeli.remove(5);
            ((Indice)obj).AddLast(this.campo1.getText());
            VenInicio.indSecRatPeli.add(5, obj);
        }
        
            //Preparar datos para ingresar
        Pelicula p = new Pelicula(this.campo1.getText(), Long.parseLong(this.campo4.getText()), this.rating.getSelectedIndex(), genero, Integer.parseInt(this.campo6.getText()), this.campo3.getText(), 0, "");
        Indice in = new Indice(p.getTitulo(), RandomAccessPelicula.getRegNum());
        
        try {
            RandomAccessPelicula.ingresarReg(p);
            VenInicio.indPrimPeliAcc.ingresarRegString(in,in.getNumReg());
        } catch (IOException ex) {
            Logger.getLogger(AgregarPelicula.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            //Agregar y ordenar a la estructura auxiliar
        VenInicio.indPrimPeli.addLast(in);
        Object[] aux = VenInicio.ordenarClavesString(VenInicio.indPrimPeli);
        VenInicio.indPrimPeli.clear();
        
            //Recargar la estructura auxiliar ordenada
        for(int i=0;i<aux.length;i++){
            VenInicio.indPrimPeli.addLast(aux[i]);
        }
            
        ManejarPelicula aux3 = new ManejarPelicula();
        aux3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_agregarActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        ManejarPelicula aux = new ManejarPelicula();
        aux.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        if(this.campo1.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(this, "¡No se ingreso el título!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(this.generos.isSelected(null)){
            JOptionPane.showMessageDialog(this, "¡No se seleccionó el género!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(this.campo3.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(this, "¡No se ingreso la descripción!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }else if(this.campo3.getText().trim().length() > 60){
            JOptionPane.showMessageDialog(this, "¡Se excedió la capacidad de caractares en la descripción(60)!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(this.campo4.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(this, "¡No se ingreso el precio de alquiler por día!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(this.campo6.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(this, "¡No se ingreso Stock de la película!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(this.rating.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(this, "¡Ingrese un rating válido!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
            //Verificar si hay una película por el mismo título
        if(VenInicio.BusBinString(this.campo1.getText(),VenInicio.indPrimPeli) != -1){
            JOptionPane.showMessageDialog(this, "¡Ya hay película por este nombre!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try {
            String genero;
            Object obj;
            
            if(this.generos.isSelected(this.comedia.getModel())){
                obj = VenInicio.indSecGenPeli.remove(1);
                genero = "Comedia";
                ((Indice)obj).AddLast(this.campo1.getText());
                VenInicio.indSecGenPeli.add(1, obj);
            }else if(this.generos.isSelected(this.drama.getModel())){
                obj = VenInicio.indSecGenPeli.remove(2);
                genero = "Drama";
                ((Indice)obj).AddLast(this.campo1.getText());
                VenInicio.indSecGenPeli.add(2, obj);
            }else if(this.generos.isSelected(this.fantasia.getModel())){
                obj = VenInicio.indSecGenPeli.remove(3);
                genero = "Fantasia";
                ((Indice)obj).AddLast(this.campo1.getText());
                VenInicio.indSecGenPeli.add(3, obj);
            }else if(this.generos.isSelected(this.historia.getModel())){
                obj = VenInicio.indSecGenPeli.remove(4);
               genero = "Historia";
                ((Indice)obj).AddLast(this.campo1.getText());
                VenInicio.indSecGenPeli.add(4, obj);
            }else if(this.generos.isSelected(this.terror.getModel())){
                obj = VenInicio.indSecGenPeli.remove(5);
                genero = "Terror";
                ((Indice)obj).AddLast(this.campo1.getText());
                VenInicio.indSecGenPeli.add(5, obj);
            }else{
                obj = VenInicio.indSecGenPeli.remove(0);
                genero = "Accion";
                ((Indice)obj).AddLast(this.campo1.getText());
                VenInicio.indSecGenPeli.add(0, obj);
            }
            
            if(this.rating.getSelectedIndex() == 0){
                obj = VenInicio.indSecRatPeli.remove(0);
                ((Indice)obj).AddLast(this.campo1.getText());
                VenInicio.indSecRatPeli.add(0, obj);
            }else if(this.rating.getSelectedIndex() == 1){
                obj = VenInicio.indSecRatPeli.remove(1);
                ((Indice)obj).AddLast(this.campo1.getText());
                VenInicio.indSecRatPeli.add(1, obj);
            }else if(this.rating.getSelectedIndex() == 2){
                obj = VenInicio.indSecRatPeli.remove(2);
                ((Indice)obj).AddLast(this.campo1.getText());
                VenInicio.indSecRatPeli.add(2, obj);
            }else if(this.rating.getSelectedIndex() == 3){
                obj = VenInicio.indSecRatPeli.remove(3);
                ((Indice)obj).AddLast(this.campo1.getText());
                VenInicio.indSecRatPeli.add(3, obj);
            }else if(this.rating.getSelectedIndex() == 4){
                obj = VenInicio.indSecRatPeli.remove(4);
                ((Indice)obj).AddLast(this.campo1.getText());
                VenInicio.indSecRatPeli.add(4, obj);
            }else if(this.rating.getSelectedIndex() == 5){
                obj = VenInicio.indSecRatPeli.remove(5);
                ((Indice)obj).AddLast(this.campo1.getText());
                VenInicio.indSecRatPeli.add(5, obj);
            }
            
                //Preparar datos de modificación
            Pelicula p = RandomAccessPelicula.buscarReg(this.in.getNumReg());
            p.setPrecioDia(Long.parseLong(this.campo4.getText()));
            p.setStock(Integer.parseInt(this.campo6.getText()));
            p.setDesc(this.campo3.getText());
            p.setTitulo(this.campo1.getText());
            p.setGenero(genero);
            p.setRating(this.rating.getSelectedIndex());
            
            Object[] aux = VenInicio.indPrimPeli.toArray();
            int tope = 0, fondo = aux.length-1;
            int med = (tope+fondo)/2;
            
            while(!((Indice)aux[med]).getClave2().equals(this.in.getClave2())){
                if(this.in.getClave2().compareTo(((Indice)aux[med]).getClave2()) > 0){
                    tope = med+1;
                    if(((Indice)aux[med]).getClave2().equals(this.in.getClave2())){
                        break;
                    }
                }else{
                    fondo = med-1;
                    if(((Indice)aux[med]).getClave2().equals(this.in.getClave2())){
                        break;
                    }
                }
                med = (tope+fondo)/2;
            }
            
            this.in.setClave2(this.campo1.getText());
            VenInicio.indPrimPeli.remove(med);
            VenInicio.indPrimPeli.add(med,this.in);
            
            RandomAccessPelicula.ingresarReg(p,this.in.getNumReg());
            
        } catch (IOException ex) {
            Logger.getLogger(AgregarPelicula.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ManejarPelicula aux = new ManejarPelicula();
        aux.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_modificarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton accion;
    private javax.swing.JButton agregar;
    private javax.swing.JTextField campo1;
    private javax.swing.JTextArea campo3;
    private javax.swing.JTextField campo4;
    private javax.swing.JTextField campo6;
    private javax.swing.JRadioButton comedia;
    private javax.swing.JRadioButton drama;
    private javax.swing.JRadioButton fantasia;
    private javax.swing.ButtonGroup generos;
    private javax.swing.JRadioButton historia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificar;
    private javax.swing.JComboBox<String> rating;
    private javax.swing.JRadioButton terror;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel texto3;
    private javax.swing.JLabel texto4;
    private javax.swing.JLabel texto5;
    private javax.swing.JLabel texto6;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
