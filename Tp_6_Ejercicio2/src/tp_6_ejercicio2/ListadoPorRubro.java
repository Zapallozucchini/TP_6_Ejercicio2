package tp_6_ejercicio2;

import javax.swing.DefaultComboBoxModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import static tp_6_ejercicio2.DeTodo_SA.modelo;


public class ListadoPorRubro extends javax.swing.JInternalFrame {
    
    
    public ListadoPorRubro() {
       initComponents();
        cargarModeloTabla();
        cargarRubros();
        cargarProductos();
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
        jCBListadoPorRubro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBListadoPorRubroItemStateChanged(evt);
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

    private void jCBListadoPorRubroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBListadoPorRubroItemStateChanged
       
        // Obtener el rubro seleccionado del JComboBox (como Enum)
    Rubro rubroSeleccionado = (Rubro) jCBListadoPorRubro.getSelectedItem();
    
    // Inicializar TableRowSorter con el modelo de la tabla
    TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(DeTodo_SA.modelo);
    jTListadoPorRubro.setRowSorter(tr);

    if (rubroSeleccionado != null) {
        // Filtrar utilizando el nombre del Enum como cadena
        tr.setRowFilter(RowFilter.regexFilter(rubroSeleccionado.name()));
    } else {
        // Si no se seleccionó un rubro, restablecer el filtro
        jTListadoPorRubro.setRowSorter(tr);
    }
    }//GEN-LAST:event_jCBListadoPorRubroItemStateChanged
    
    
    private void cargarModeloTabla() {
       if(DeTodo_SA.modelo.getColumnCount() == 0) {
        DeTodo_SA.modelo.addColumn("Codigo");
        DeTodo_SA.modelo.addColumn("Descripcion");
        DeTodo_SA.modelo.addColumn("Precio");
        DeTodo_SA.modelo.addColumn("Stock");
        DeTodo_SA.modelo.addColumn("Rubro");
    }
    jTListadoPorRubro.setModel(DeTodo_SA.modelo);
    
    }
  private void cargarProductos() {
        // Asegúrate de tener una lista de productos (debería estar en DeTodo_SA o ser pasada al modelo)
        for (Producto producto : DeTodo_SA.productos) {
            Object[] fila = {
                producto.getCodigo(),
                producto.getDescripcion(),
                producto.getPrecio(),
                producto.getStock(),
                producto.getRubro()
            };
            DeTodo_SA.modelo.addRow(fila);
        }
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
