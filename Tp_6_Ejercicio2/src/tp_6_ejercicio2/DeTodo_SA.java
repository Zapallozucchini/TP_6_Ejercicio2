/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_6_ejercicio2;


import java.util.TreeSet;

/**
 *
 * @author Lenovo
 */
public class DeTodo_SA extends javax.swing.JFrame {
    static TreeSet<Producto> productos = new TreeSet<>();

    /**
     * Creates new form DeTodo_SA
     */
    public DeTodo_SA() {
        initComponents();
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
        jMConsulta.add(jMIConsultaNombre);

        jMIConsultaPrecio.setText("Consulta por Precio");
        jMIConsultaPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIConsultaPrecioActionPerformed(evt);
            }
        });
        jMConsulta.add(jMIConsultaPrecio);

        jMIConsultaRubro.setText("Consulta por Rubro");
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
}
