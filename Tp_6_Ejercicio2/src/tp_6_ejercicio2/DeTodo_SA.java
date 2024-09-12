/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_6_ejercicio2;


import java.util.TreeSet;
import javax.swing.table.DefaultTableModel;

import static tp_6_ejercicio2.Rubro.COMESTIBLE;
import static tp_6_ejercicio2.Rubro.LIMPIEZA;
import static tp_6_ejercicio2.Rubro.PERFUMERIA;

/**
 *
 * @author Lenovo
 */
public class DeTodo_SA extends javax.swing.JFrame {
    public static TreeSet<Producto> productos = new TreeSet<>();
    public static DefaultTableModel modelo = new DefaultTableModel();
    /**
     * Creates new form DeTodo_SA
     */
    public DeTodo_SA() {
        initComponents();
        cargarProductosDefault();
        cargarModeloTabla();
        agregarProductoTablaPorDefault();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMAdministracion = new javax.swing.JMenu();
        jMIGestionDeProducto = new javax.swing.JMenuItem();
        jMConsulta = new javax.swing.JMenu();
        jMIConsultaNombre = new javax.swing.JMenuItem();
        jMIConsultaPrecio = new javax.swing.JMenuItem();
        jMIConsultaRubro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 813, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 692, Short.MAX_VALUE)
        );

        jMAdministracion.setText("Administracion");
        jMAdministracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAdministracionActionPerformed(evt);
            }
        });

        jMIGestionDeProducto.setText("Gestion de Producto");
        jMIGestionDeProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIGestionDeProductoActionPerformed(evt);
            }
        });
        jMAdministracion.add(jMIGestionDeProducto);

        jMenuBar1.add(jMAdministracion);

        jMConsulta.setText("Consulta");

        jMIConsultaNombre.setText("Consulta por Nombre");
        jMIConsultaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIConsultaNombreActionPerformed(evt);
            }
        });
        jMConsulta.add(jMIConsultaNombre);

        jMIConsultaPrecio.setText("Consulta por Precio");
        jMIConsultaPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIConsultaPrecioActionPerformed(evt);
            }
        });
        jMConsulta.add(jMIConsultaPrecio);

        jMIConsultaRubro.setText("Consulta por Rubro");
        jMIConsultaRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIConsultaRubroActionPerformed(evt);
            }
        });
        jMConsulta.add(jMIConsultaRubro);

        jMenuBar1.add(jMConsulta);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMAdministracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAdministracionActionPerformed
        
    }//GEN-LAST:event_jMAdministracionActionPerformed

    private void jMIGestionDeProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIGestionDeProductoActionPerformed
        Gestion_de_Productos gestionProducto = new Gestion_de_Productos(productos);
        escritorio.add(gestionProducto);
        gestionProducto.setVisible(true);
    }//GEN-LAST:event_jMIGestionDeProductoActionPerformed

    private void jMIConsultaPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIConsultaPrecioActionPerformed
        ListadoPorPrecio listadoPorPrecio = new ListadoPorPrecio();
        escritorio.add(listadoPorPrecio);
        listadoPorPrecio.setVisible(true);
    }//GEN-LAST:event_jMIConsultaPrecioActionPerformed

    private void jMIConsultaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIConsultaNombreActionPerformed
       ListadoPorNombre listadoPorNombre = new ListadoPorNombre();
        escritorio.add(listadoPorNombre);
        listadoPorNombre.setVisible(true);
    }//GEN-LAST:event_jMIConsultaNombreActionPerformed

    private void jMIConsultaRubroActionPerformed(java.awt.event.ActionEvent evt) {                                                  
       ListadoPorRubro listadoPorRubro = new ListadoPorRubro();
        escritorio.add(listadoPorRubro);
        listadoPorRubro.setVisible(true);
    }    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DeTodo_SA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeTodo_SA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeTodo_SA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeTodo_SA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeTodo_SA().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMAdministracion;
    private javax.swing.JMenu jMConsulta;
    private javax.swing.JMenuItem jMIConsultaNombre;
    private javax.swing.JMenuItem jMIConsultaPrecio;
    private javax.swing.JMenuItem jMIConsultaRubro;
    private javax.swing.JMenuItem jMIGestionDeProducto;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

    private void cargarProductosDefault(){
        Producto p1= new Producto(1,"Pan",150.50, 10,COMESTIBLE);
        Producto p2= new Producto(2,"Pan Medio Kilo",150.50, 10,COMESTIBLE);
        Producto p3= new Producto(3,"Lavandina", 10.5, 50, LIMPIEZA);
        Producto p4= new Producto(4, "Paco", 1540.5, 10, PERFUMERIA);
        
       productos.add(p1);
       productos.add(p2);
       productos.add(p3);
       productos.add(p4);
       
       
    }
    
    private void cargarModeloTabla(){
        if (DeTodo_SA.modelo.getColumnCount() == 0) {
        DeTodo_SA.modelo.addColumn("Codigo");
        DeTodo_SA.modelo.addColumn("Descripcion");
        DeTodo_SA.modelo.addColumn("Precio");
        DeTodo_SA.modelo.addColumn("Stock");
        DeTodo_SA.modelo.addColumn("Rubro");
    }
        
    }
    
    private void agregarProductoTablaPorDefault(){  
       
    boolean producto1Existe = false;
    boolean producto2Existe = false;
    boolean producto3Existe = false;
    boolean producto4Existe = false;

    for (int i = 0; i < DeTodo_SA.modelo.getRowCount(); i++) {
        int codigoProducto = (int) DeTodo_SA.modelo.getValueAt(i, 0);
        if (codigoProducto == 1) {
            producto1Existe = true;
        }
        if (codigoProducto == 2) {
            producto2Existe = true;
        }
         if (codigoProducto == 3) {
            producto3Existe = true;
        }
          if (codigoProducto == 4) {
            producto4Existe = true;
        }
    }

    if (!producto1Existe) {
        DeTodo_SA.modelo.addRow(new Object[]{1, "Pan", 150.5, 10,COMESTIBLE});
    }
    if (!producto2Existe) {
        DeTodo_SA.modelo.addRow(new Object[]{2, "Pan Medio Kilo", 150.5, 10, COMESTIBLE});
    }
    if (!producto3Existe) {
        DeTodo_SA.modelo.addRow(new Object[]{3, "Lavandina", 10.5, 50, LIMPIEZA});
    }
    if (!producto4Existe) {
        DeTodo_SA.modelo.addRow(new Object[]{4, "Paco", 1540.5, 10, PERFUMERIA});
    }
    }
    
    private void hola(){
        System.out.println("Hola");
    }
}
