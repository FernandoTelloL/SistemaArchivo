
package SistemaArchivo.c1_presentacion;

import java.awt.Color;
import java.beans.PropertyVetoException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FormLogin extends javax.swing.JFrame {

  
    public FormLogin() {
        initComponents();
        txtUserName.setText("");
        txtPassword.setText("");
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnIniciarSesion = new javax.swing.JButton();
        txtPassword = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIniciarSesion.setBackground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setForeground(new java.awt.Color(51, 51, 51));
        btnIniciarSesion.setText("Iniciar sesión");
        btnIniciarSesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 130, 30));

        txtPassword.setBackground(new java.awt.Color(204, 204, 204));
        txtPassword.setForeground(new java.awt.Color(51, 51, 51));
        txtPassword.setBorder(null);
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 260, 30));

        txtUserName.setBackground(new java.awt.Color(204, 204, 204));
        txtUserName.setForeground(new java.awt.Color(51, 51, 51));
        txtUserName.setBorder(null);
        jPanel1.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 260, 30));

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Contraseña: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, 20));

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nombre de usuario: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("BIENVENIDO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 230, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        
        try {
            ingresar();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FormLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(FormLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

 
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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    public Connection Conectar() {
        Connection con = null;
        try {
           con= DriverManager.getConnection("jdbc:mysql://localhost/mydb","fernando","fernando");
        } catch (SQLException e) {
            System.err.print(e.toString());
            JOptionPane.showMessageDialog(this, "ocurrió un error inesperado, comuniquese con el administrador");
        }
        return con;
    }
    
    public void ingresar() throws PropertyVetoException, Exception {
        Connection con1 = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String userName = txtUserName.getText();
        String pass = txtPassword.getText();
        if(userName.equals("") || pass.equals("")) {
            JOptionPane.showMessageDialog(this, "Uno o mas campos están vacios, por favor llenarlos.");
        } else {
            try {
                con1 = Conectar();
                pst = con1.prepareStatement("select username, password from user where username ='" + userName + "' and password = '" + pass+"'");
                rs = pst.executeQuery();
                if (rs.next()){
                    this.dispose();
                    FormSistema formSistema = new FormSistema();
                    formSistema.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this,"Credenciales incorrectas vuelve a intentar denuevo");
                }
            } catch (SQLException e) {
                
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
