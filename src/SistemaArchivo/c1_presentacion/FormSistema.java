
package SistemaArchivo.c1_presentacion;

import SistemaArchivo.c2_aplicacion.CargoServicio;
import SistemaArchivo.c3_dominio.Cargo;
import java.awt.Color;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FormSistema extends javax.swing.JFrame {
    
    FormCargo formCargo = new FormCargo();
    FormUser formUser;
    FormArea formArea = new FormArea();
    FormTipoDocumento formTipoDocumento = new FormTipoDocumento();
    private JDesktopPane escritorio;
    
    
    public FormSistema() throws PropertyVetoException, Exception {
        initComponents();
        this.formUser = new FormUser();
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de Archivos MDCH");
        escritorio = new JDesktopPane();
        this.setContentPane(escritorio);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setExtendedState(MAXIMIZED_BOTH);
        
        formCargo.setMaximum(true);
        formUser.setMaximum(true);
        formTipoDocumento.setMaximum(true);
        formArea.setMaximum(true);
        this.getContentPane().setBackground(Color.DARK_GRAY);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuCargo = new javax.swing.JMenuItem();
        menuUsuarios = new javax.swing.JMenuItem();
        menuArea = new javax.swing.JMenuItem();
        menuTipoDocumento = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuBar1.setForeground(new java.awt.Color(204, 204, 204));

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(menuSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Mantenimiento");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        menuCargo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuCargo.setText("Cargo");
        menuCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCargoActionPerformed(evt);
            }
        });
        jMenu2.add(menuCargo);

        menuUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuUsuarios.setText("Usuarios");
        menuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUsuariosActionPerformed(evt);
            }
        });
        jMenu2.add(menuUsuarios);

        menuArea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuArea.setText("Área");
        menuArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAreaActionPerformed(evt);
            }
        });
        jMenu2.add(menuArea);

        menuTipoDocumento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuTipoDocumento.setText("Tipo Documento");
        menuTipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTipoDocumentoActionPerformed(evt);
            }
        });
        jMenu2.add(menuTipoDocumento);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1225, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void menuCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCargoActionPerformed
        //frmCargo formCargo = new FormCargo();
        escritorio.add(formCargo);
        formCargo.setVisible(true);
        
        
    }//GEN-LAST:event_menuCargoActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuSalirActionPerformed

    private void menuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUsuariosActionPerformed
        escritorio.add(formUser);
        formUser.setVisible(true);
    }//GEN-LAST:event_menuUsuariosActionPerformed

    private void menuAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAreaActionPerformed
        escritorio.add(formArea);
        formArea.setVisible(true);
    }//GEN-LAST:event_menuAreaActionPerformed

    private void menuTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTipoDocumentoActionPerformed
        escritorio.add(formTipoDocumento);
        formTipoDocumento.setVisible(true);
    }//GEN-LAST:event_menuTipoDocumentoActionPerformed

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
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FormSistema().setVisible(true);
                } catch (PropertyVetoException ex) {
                    Logger.getLogger(FormSistema.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(FormSistema.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem menuArea;
    private javax.swing.JMenuItem menuCargo;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JMenuItem menuTipoDocumento;
    private javax.swing.JMenuItem menuUsuarios;
    // End of variables declaration//GEN-END:variables
}
