/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package package_Interface;

/**
 *
 * @author Usuario Win10
 */
public class frm_inicio extends javax.swing.JFrame {

    private javax.swing.JMenuItem jMenuItemNuevoProducto;

    /**
     * Creates new form frm_inicio
     */
    public frm_inicio() {
        initComponents();
        agregarItemProductos();
    }

    private void agregarItemProductos() {
        jMenuItemNuevoProducto = new javax.swing.JMenuItem();
        jMenuItemNuevoProducto.setText("NuevoProducto");

        // Agregar el evento
        jMenuItemNuevoProducto.addActionListener((java.awt.event.ActionEvent evt) -> {
            this.setVisible(false);
            frm_nuevoProducto nuevoProducto = new frm_nuevoProducto();
            nuevoProducto.setVisible(true);
        });

        menu_Administracion.add(jMenuItemNuevoProducto);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_Administracion = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        menu_Salir = new javax.swing.JMenu();
        menu_Cerrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 733, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
        );

        jMenuBar1.setBorder(null);

        menu_Administracion.setText("Administracion");

        jMenuItem1.setFont(new java.awt.Font("Verdana", 2, 11)); // NOI18N
        jMenuItem1.setText("Productos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menu_Administracion.add(jMenuItem1);
        menu_Administracion.add(jSeparator1);

        jMenuBar1.add(menu_Administracion);

        jMenu2.setText("Movimientos");

        jMenuItem2.setFont(new java.awt.Font("Verdana", 2, 11)); // NOI18N
        jMenuItem2.setText("Ventas");
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        menu_Salir.setText("Salir");

        menu_Cerrar.setFont(new java.awt.Font("Verdana", 2, 11)); // NOI18N
        menu_Cerrar.setText("Cerrar Aplicacion");
        menu_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_CerrarActionPerformed(evt);
            }
        });
        menu_Salir.add(menu_Cerrar);

        jMenuBar1.add(menu_Salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menu_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_CerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_menu_CerrarActionPerformed

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
            java.util.logging.Logger.getLogger(frm_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frm_inicio().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menu_Administracion;
    private javax.swing.JMenuItem menu_Cerrar;
    private javax.swing.JMenu menu_Salir;
    // End of variables declaration//GEN-END:variables
}
