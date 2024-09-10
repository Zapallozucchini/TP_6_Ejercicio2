package tp_6_ejercicio2;

import javax.swing.DefaultComboBoxModel;


public class ListadoPorRubro extends javax.swing.JInternalFrame {
    
    
    public ListadoPorRubro() {
       initComponents();
        cargarModeloTabla();
        cargarRubros(); 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCBListadoPorRubro = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTListadoPorRubro = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Listado por Rubro");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Seleccionar el Rubro:");

        jCBListadoPorRubro.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jCBListadoPorRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBListadoPorRubroActionPerformed(evt);
            }
        });
        jCBListadoPorRubro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jCBListadoPorRubroKeyReleased(evt);
            }
        });

        jTListadoPorRubro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTListadoPorRubro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCBListadoPorRubro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBListadoPorRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBListadoPorRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBListadoPorRubroActionPerformed
  
    }//GEN-LAST:event_jCBListadoPorRubroActionPerformed

    private void jCBListadoPorRubroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCBListadoPorRubroKeyReleased
       String rubroSeleccionado = (String) jCBListadoPorRubro.getSelectedItem();
        borrarFilas();
        
        for (Producto p : Gestion_de_Productos.listadoProducto) {
            if (p.getRubro().toString().equalsIgnoreCase(rubroSeleccionado)) {
               DeTodo_SA.modelo.addRow(new Object[]{
                    p.getCodigo(), p.getDescripcion(), p.getPrecio(), p.getStock(), p.getRubro()
                });
            }
        }  
    }//GEN-LAST:event_jCBListadoPorRubroKeyReleased
  private void cargarModeloTabla() {
       if (DeTodo_SA.modelo.getColumnCount() == 0) {
        DeTodo_SA.modelo.addColumn("Codigo");
        DeTodo_SA.modelo.addColumn("Descripcion");
        DeTodo_SA.modelo.addColumn("Precio");
        DeTodo_SA.modelo.addColumn("Stock");
        DeTodo_SA.modelo.addColumn("Rubro");
    }
    jTListadoPorRubro.setModel(DeTodo_SA.modelo);
    
    }

    private void cargarRubros() {
        jCBListadoPorRubro.setModel(new DefaultComboBoxModel<>(Rubro.values()));
    }

    public static void borrarFilas() {
       DeTodo_SA.modelo.setRowCount(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Rubro> jCBListadoPorRubro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTListadoPorRubro;
    // End of variables declaration//GEN-END:variables

}
