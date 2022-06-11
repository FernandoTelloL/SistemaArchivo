
package SistemaArchivo.c1_presentacion;

import SistemaArchivo.c2_aplicacion.CargoServicio;
import SistemaArchivo.c2_aplicacion.UserServicio;
import SistemaArchivo.c3_dominio.Cargo;
import SistemaArchivo.c3_dominio.User;
import SistemaArchivo.c4_persistencia.CargoDAO;
import SistemaArchivo.c4_persistencia.GestorJDBC;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormUser extends javax.swing.JInternalFrame {
    GestorJDBC gestorJDBC;
    String idDeCombo;

    String nombreColumnaModeloUser[] = {"Id", "Username", "Contraseña", "Cargo", "Nombres", "Apellidos"};
    String nombreColumnaModeloEntrrada[] = {"Codigo", "Descripcion", "Precio", "Cantidad", "Importe"};
    String nombreColumnaModeloSalida[] = {"Codigo", "Descripcion", "Precio", "Cantidad", "Importe"};
    String nombreColumnaModeloOInventario[] = {"Codigo", "Descripcion", "Entrada", "Salida", "Stock"};
    DefaultTableModel modeloUser = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    
    public FormUser() throws Exception {
        initComponents();
        cbCargo.removeAllItems();
        llenarCargosCombo();
        mostrarUser();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnGuardarCargo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnCancelarCargo = new javax.swing.JButton();
        btnAgregarCargo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbUser = new javax.swing.JTable();
        btnEliminarCargo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        txtIdUser = new javax.swing.JTextField();
        txtUserNameUser = new javax.swing.JTextField();
        btnModificarCargo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbCargo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtNombresUser = new javax.swing.JTextField();
        txtApellidosUser = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtIdCombo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPasswordUser = new javax.swing.JTextField();

        jLabel2.setText("CARGO: ");

        btnGuardarCargo.setText("Guardar Usuario");
        btnGuardarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCargoActionPerformed(evt);
            }
        });

        jLabel3.setText("USERNAME:");

        btnCancelarCargo.setText("Cancelar");
        btnCancelarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCargoActionPerformed(evt);
            }
        });

        btnAgregarCargo.setText("Agregar Usuario");
        btnAgregarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCargoActionPerformed(evt);
            }
        });

        jtbUser.setModel(modeloUser);
        jtbUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbUser);

        btnEliminarCargo.setText("Eliminar Usuario");
        btnEliminarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCargoActionPerformed(evt);
            }
        });

        jLabel1.setText("ID:");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtUserNameUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameUserActionPerformed(evt);
            }
        });

        btnModificarCargo.setText("Modificar Usuario");
        btnModificarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCargoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        jLabel4.setText("FORMULARIO DE MANTENIMIENTO DE USUARIOS DE SISTEMA DE ARCHIVOS MDCH");

        cbCargo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbCargoFocusGained(evt);
            }
        });
        cbCargo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbCargoMouseClicked(evt);
            }
        });

        jLabel5.setText("NOMBRES:");

        txtNombresUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresUserActionPerformed(evt);
            }
        });

        txtApellidosUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosUserActionPerformed(evt);
            }
        });

        jLabel6.setText("APELLIDOS");

        txtIdCombo.setText("jLabel7");

        jLabel7.setText("CONTRASEÑA:");

        txtPasswordUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(53, 53, 53)
                        .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdCombo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtUserNameUser)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPasswordUser))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(41, 41, 41)
                                    .addComponent(txtNombresUser))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(40, 40, 40)
                                    .addComponent(txtApellidosUser))))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminarCargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModificarCargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuardarCargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelarCargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregarCargo)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnAgregarCargo)
                        .addGap(72, 72, 72)
                        .addComponent(btnGuardarCargo)
                        .addGap(12, 12, 12)
                        .addComponent(btnModificarCargo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarCargo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelarCargo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalir)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPasswordUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdCombo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNombresUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtApellidosUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCargoActionPerformed
      
        int registros_afectados = 0;
        
        //int id = cbCargo.getItemAt(cbCargo.getSelectedIndex()).getId();
        //txtIdCombo.setText(id+"");
        
       if ((txtUserNameUser.getText().compareTo("") != 0) && 
           (txtNombresUser.getText().compareTo("") != 0) && 
           (txtApellidosUser.getText().compareTo("") != 0) &&
           txtPasswordUser.getText().compareTo("") != 0) {
            try {
                User user = new User();
                user.setUsername(txtUserNameUser.getText().trim().toUpperCase());
                user.setPassword(txtPasswordUser.getText().trim());
                user.setCargo(cbCargo.getItemAt(cbCargo.getSelectedIndex()).getId());
                user.setNombres(txtNombresUser.getText().trim().toUpperCase());
                user.setApellidos(txtApellidosUser.getText().trim().toUpperCase());
                UserServicio userServicio = new UserServicio();
                registros_afectados = userServicio.guardarUser(user);
                if (registros_afectados == 1) {
                    JOptionPane.showMessageDialog(this, "Se guardo correctamente el usuario.", "Sistema Archivo MDCH: Error", JOptionPane.INFORMATION_MESSAGE);
                    //limpiarPanelCargo();
                    //activarInternalFrameInicio(true);
                    //mostrarCargo();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Sistema Archivo MDCH: Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Faltan llenar datos.", "Sistema Archivo MDCH: Advertencia", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnGuardarCargoActionPerformed

    private void btnCancelarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCargoActionPerformed
        /*txtIdCargo.setText("");
        txtNombreCargo.setText("");
        txtDescripcionCargo.setText("");
        activarInternalFrameInicio(true);*/
    }//GEN-LAST:event_btnCancelarCargoActionPerformed

    private void btnAgregarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCargoActionPerformed
      
         int idseleccionado;
        idseleccionado = cbCargo.getItemAt(cbCargo.getSelectedIndex()).getId();
         txtIdCombo.setText(idseleccionado+"");

    }//GEN-LAST:event_btnAgregarCargoActionPerformed

    private void jtbUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbUserMouseClicked

        User user=new User();
        int row = jtbUser.getSelectedRow();
        txtIdUser.setEnabled(false);
        txtUserNameUser.setEnabled(true);
        txtPasswordUser.setEnabled(true);
        cbCargo.setEnabled(true);
        txtNombresUser.setEnabled(true);
        txtApellidosUser.setEnabled(true);
        txtIdUser.setText(modeloUser.getValueAt(row, 0).toString());
        txtUserNameUser.setText(modeloUser.getValueAt(row, 1).toString());
        txtPasswordUser.setText(modeloUser.getValueAt(row, 2).toString());
        //cbCargo.setSelectedItem( modeloUser.getValueAt(row, 3).toString());
        txtNombresUser.setText(modeloUser.getValueAt(row, 4).toString());
        txtApellidosUser.setText(modeloUser.getValueAt(row, 5).toString());
        //activarInternalFrameModificarCargo(true);
        
    }//GEN-LAST:event_jtbUserMouseClicked

    private void btnEliminarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCargoActionPerformed

        int registros_afectados = 0;
        if (txtIdUser.getText().compareTo("") != 0) {
            try {
                int resp = JOptionPane.showConfirmDialog(this, "Estas seguro que deseas eliminar el USUARIO? ", "Sistema Archivo MDCH: Advertencia", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {
                    UserServicio userServicio = new UserServicio();
                    registros_afectados = userServicio.eliminarUser(Integer.parseInt(txtIdUser.getText().trim()));
                    if (registros_afectados == 1) {
                        JOptionPane.showMessageDialog(this, "Se eliminó correctamente el USUARIO.", "Sistema Archivo MDCH: Error", JOptionPane.INFORMATION_MESSAGE);
                        //limpiarPanelCargo();
                        //activarInternalFrameCargo(true);
                        //mostrarCargo();
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Sistema ARCHIVO MDCH: Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un USUARIO.", "Sistema ARCHIVO MDCH: Advertencia", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnEliminarCargoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        this.dispose();

    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtUserNameUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameUserActionPerformed

    private void btnModificarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCargoActionPerformed
     
        int registros_afectados = 0;
        if (txtUserNameUser.getText().compareTo("") != 0 && 
                txtPasswordUser.getText().compareTo("") != 0 &&
                txtNombresUser.getText().compareTo("") != 0 &&
                txtApellidosUser.getText().compareTo("") != 0
            ) {
            try {
                
                User user = new User();
                user.setId(Integer.parseInt(txtIdUser.getText().trim()));
                user.setUsername(txtUserNameUser.getText().trim());
                user.setPassword(txtPasswordUser.getText().trim());
                //user.setCargo(cbCargo.getSelectedItem());
                user.setNombres(txtNombresUser.getText().trim().toUpperCase());
                user.setApellidos(txtApellidosUser.getText().trim().toUpperCase());
                int resp = JOptionPane.showConfirmDialog(this, "Estas seguro que deseas actualizar la información de USUARIO? ", "Sistema Archivo MDCH: Advertencia", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {
                    UserServicio userServicio = new UserServicio();
                    registros_afectados = userServicio.actualizarUser(user);
                    if (registros_afectados == 1) {
                        JOptionPane.showMessageDialog(this, "Se actualizo correctamente el USUARIO.", "Sistema Archivo MDCH: Error", JOptionPane.INFORMATION_MESSAGE);
                        //limpiarPanelCargo();
                        //activarInternalFrameCargo(true);
                        //mostrarCargo();
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Sistema archivo MDCH: Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un CARGO y tener todos los campos con información.", "Sistema Archivo MDCH: Advertencia", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnModificarCargoActionPerformed

    private void txtNombresUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresUserActionPerformed

    private void txtApellidosUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosUserActionPerformed

    private void cbCargoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbCargoMouseClicked
       
    }//GEN-LAST:event_cbCargoMouseClicked

    private void cbCargoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbCargoFocusGained
        try {
            llenarCargosCombo();
        } catch (Exception ex) {
            Logger.getLogger(FormUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbCargoFocusGained

    private void txtPasswordUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordUserActionPerformed

    private void llenarCargosCombo() throws Exception {
        cbCargo.removeAllItems();
        CargoServicio cargoServicio=new CargoServicio();
        try {
            cbCargo.removeAllItems();
            ArrayList<Cargo> listaCargo = cargoServicio.mostrarCargo();
      
            for (int i = 0; i < listaCargo.size(); i++) {
                //cbCargo.addItem(listaCargo.get(i).getCargo());
                cbCargo.addItem(new Cargo(listaCargo.get(i).getId(), listaCargo.get(i).getCargo(), listaCargo.get(i).getDescripcion()));
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(FormUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void mostrarUser() {
        try {
            Cargo cargo=new Cargo();
            UserServicio userServicio = new UserServicio();
            ArrayList<User> lista = userServicio.mostrarUser();
            Object[][] fila = new Object[lista.size()][6];
            for (int i = 0; i < lista.size(); i++) {
                User user = lista.get(i);
                fila[i][0] = user.getId();
                fila[i][1] = user.getUsername();
                fila[i][2] = user.getPassword();
                fila[i][3] = user.getCargo();
                fila[i][4] = user.getNombres();
                fila[i][5] = user.getApellidos();
            }
            modeloUser.setDataVector(fila, nombreColumnaModeloUser);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Sistema Archivo MDCH: Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCargo;
    private javax.swing.JButton btnCancelarCargo;
    private javax.swing.JButton btnEliminarCargo;
    private javax.swing.JButton btnGuardarCargo;
    private javax.swing.JButton btnModificarCargo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<Cargo> cbCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbUser;
    private javax.swing.JTextField txtApellidosUser;
    private javax.swing.JLabel txtIdCombo;
    private javax.swing.JTextField txtIdUser;
    private javax.swing.JTextField txtNombresUser;
    private javax.swing.JTextField txtPasswordUser;
    private javax.swing.JTextField txtUserNameUser;
    // End of variables declaration//GEN-END:variables
}
