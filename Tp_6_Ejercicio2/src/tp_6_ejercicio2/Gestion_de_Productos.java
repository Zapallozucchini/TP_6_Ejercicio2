package tp_6_ejercicio2;

import java.util.TreeSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Gestion_de_Productos extends javax.swing.JInternalFrame {

    public Gestion_de_Productos(TreeSet<Producto> productos) {
        initComponents();
        cargarComboBox();
        cargarModeloTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTFiltrar = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTCodigo = new javax.swing.JTextField();
        jTPrecio = new javax.swing.JTextField();
        jTDescripcion = new javax.swing.JTextField();
        jCBRubro = new javax.swing.JComboBox<>();
        jSStock = new javax.swing.JSpinner();
        jBNuevo = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jBCerrar = new javax.swing.JButton();
        jBActualizar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestion de Productos");

        jTFiltrar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTFiltrar.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTFiltrar);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Descripcion:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Codigo:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Precio:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Rubro:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Stock:");

        jTCodigo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCodigoActionPerformed(evt);
            }
        });

        jTPrecio.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPrecioActionPerformed(evt);
            }
        });

        jTDescripcion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDescripcionActionPerformed(evt);
            }
        });

        jCBRubro.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jSStock.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTPrecio)
                    .addComponent(jTDescripcion)
                    .addComponent(jCBRubro, 0, 413, Short.MAX_VALUE)
                    .addComponent(jTCodigo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSStock, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jCBRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jSStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jBNuevo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBBuscar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBCerrar.setBackground(new java.awt.Color(225, 39, 39));
        jBCerrar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jBCerrar.setText("Cerrar");
        jBCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCerrarActionPerformed(evt);
            }
        });

        jBActualizar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jBActualizar.setText("Actualizar");
        jBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarActionPerformed(evt);
            }
        });

        jBEliminar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBGuardar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jBBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                    .addComponent(jBCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jBActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jBCerrar)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCodigoActionPerformed

    private void jTPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPrecioActionPerformed

    private void jTDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDescripcionActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
       jTCodigo.setText("");
       jTDescripcion.setText("");
       jTPrecio.setText("");
       jSStock.setValue(0);
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_jBCerrarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
    try {
    int codigo = Integer.parseInt(jTCodigo.getText());
    boolean productoEncontrado = false;
    int codigoMaximo = -1;

    for (Producto p : DeTodo_SA.productos) {
        if (p.getCodigo() > codigoMaximo) {
            codigoMaximo = p.getCodigo(); 
        }
        if (p.getCodigo() == codigo) {
            jTDescripcion.setText(p.getDescripcion());
            jTPrecio.setText(String.valueOf(p.getPrecio()));
            jCBRubro.setSelectedItem(p.getRubro());
            jSStock.setValue(p.getStock());
            productoEncontrado = true;
            break;
        }
    }

    if (!productoEncontrado) {
        JOptionPane.showMessageDialog(null, "No se encontró el producto, el código más alto es: " + codigoMaximo);
    }
    
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "El código debe ser un número válido.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActionPerformed
        try {
        // Obtener el código del producto a actualizar
        int codigo = Integer.parseInt(jTCodigo.getText());

        // Crear una variable para almacenar el producto a eliminar
        Producto productoAEliminar = null;

        // Buscar el producto en el TreeSet
        for (Producto p : DeTodo_SA.productos) {
            if (p.getCodigo() == codigo) {
                productoAEliminar = p;
                break;
            }
        }

        // Si se encontró el producto, lo eliminamos y actualizamos
        if (productoAEliminar != null) {
            // Obtener los valores del formulario
            String descripcion = jTDescripcion.getText();
            Rubro rubroSeleccionado = (Rubro) jCBRubro.getSelectedItem();
            double precio = Double.parseDouble(jTPrecio.getText());
            int stock = (Integer) jSStock.getValue();

            // Validar que la descripción no esté vacía y que el rubro no sea null
            if (descripcion.isEmpty() || rubroSeleccionado == null) {
                JOptionPane.showMessageDialog(null, "Por favor ingresa una descripción válida y selecciona un rubro.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Eliminar el producto actual del TreeSet
            DeTodo_SA.productos.remove(productoAEliminar);

            // Crear el producto actualizado con los nuevos valores
            Producto productoActualizado = new Producto(
                codigo,
                descripcion,
                precio,
                stock,
                rubroSeleccionado
            );

            // Agregar el producto actualizado al TreeSet
            DeTodo_SA.productos.add(productoActualizado);

            // Actualizar la tabla
            actualizarTabla();

            // Mostrar mensaje de confirmación
            JOptionPane.showMessageDialog(null, "Producto actualizado correctamente.");
        } else {
            // Si no se encontró el producto, mostrar mensaje de error
            JOptionPane.showMessageDialog(null, "No se encontró el producto para actualizar.");
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Datos inválidos. Asegúrate de ingresar un precio numérico válido.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jBActualizarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        
         int selectedRow = jTFiltrar.getSelectedRow();
                    if (selectedRow != -1) {
                        int codigo = (int) DeTodo_SA.modelo.getValueAt(selectedRow, 0);
                        Producto productoAEliminar = buscarProductoPorCodigo(codigo);
                        if (productoAEliminar != null) {
                            DeTodo_SA.productos.remove(productoAEliminar);
                            DeTodo_SA.modelo.removeRow(selectedRow);
                        }
                    }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        try {
        int codigo = Integer.parseInt(jTCodigo.getText().trim());
        Rubro rubro = (Rubro) jCBRubro.getSelectedItem();
        if (rubro == null) {
            throw new IllegalArgumentException("Por favor seleccione una categoría.");
        }
        String descripcion = jTDescripcion.getText().trim();
        if (descripcion.isEmpty()) {
            throw new IllegalArgumentException("La descripción del producto no puede estar vacía.");
        }
        double precio = Double.parseDouble(jTPrecio.getText().trim());
        int stock = (int) jSStock.getValue(); // Obtener el valor correcto del JSpinner
        
        Producto producto = new Producto(codigo, descripcion, precio, stock, rubro);

        // Usar TreeSet para evitar duplicados
        if (!DeTodo_SA.productos.add(producto)) {
            JOptionPane.showMessageDialog(null, "El producto ya existe.", "Error de duplicación", JOptionPane.WARNING_MESSAGE);
        } else {
            agregarProductoTabla(producto);
            JOptionPane.showMessageDialog(null, "Se cargó el producto correctamente.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "El precio debe ser un número válido.", "Error de formato", JOptionPane.ERROR_MESSAGE);
    } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(null, e.getMessage(), "Error de entrada", JOptionPane.WARNING_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Ocurrió un error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private static Producto buscarProductoPorCodigo(int codigo) {
        for (Producto p : DeTodo_SA.productos) {
            if (p.getCodigo() == codigo) {
                return p;
            }
        }
        return null;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBCerrar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JComboBox<Rubro> jCBRubro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSStock;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTCodigo;
    private javax.swing.JTextField jTDescripcion;
    private javax.swing.JTable jTFiltrar;
    private javax.swing.JTextField jTPrecio;
    // End of variables declaration//GEN-END:variables

    private void cargarComboBox(){
        jCBRubro.setModel(new DefaultComboBoxModel<>(Rubro.values()));
    }
    private void cargarModeloTabla(){
        jTFiltrar.setModel(DeTodo_SA.modelo);
    }
    
    private void actualizarTabla() {
    // Limpiar el modelo actual de la tabla
    DefaultTableModel modelo = (DefaultTableModel) jTFiltrar.getModel();
    modelo.setRowCount(0);  // Elimina todas las filas

    // Reemplazar con los productos actualizados
    for (Producto p : DeTodo_SA.productos) {
        modelo.addRow(new Object[]{
            p.getCodigo(),
            p.getDescripcion(),
            p.getRubro(),
            p.getPrecio(),
            p.getStock()
        });
    }
    }

    private void agregarProductoTabla(Producto producto){
        
        DeTodo_SA.modelo.addRow(new Object[]{producto.getCodigo(), producto.getDescripcion(),
            producto.getPrecio(), producto.getStock(), producto.getRubro()});
    }
    
    
}
