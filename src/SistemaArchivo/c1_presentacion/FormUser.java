
package SistemaArchivo.c1_presentacion;

import SistemaArchivo.c2_aplicacion.CargoServicio;
import SistemaArchivo.c2_aplicacion.UserServicio;
import SistemaArchivo.c3_dominio.Cargo;
import SistemaArchivo.c3_dominio.User;
import SistemaArchivo.c4_persistencia.CargoDAO;
import SistemaArchivo.c4_persistencia.GestorJDBC;
import java.awt.Color;
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
        this.getContentPane().setBackground(Color.DARK_GRAY);
        //cbCargo.removeAllItems();
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
        jLabel7 = new javax.swing.JLabel();
        txtPasswordUser = new javax.swing.JTextField();

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("CARGO: ");

        btnGuardarCargo.setBackground(new java.awt.Color(51, 51, 51));
        btnGuardarCargo.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnGuardarCargo.setForeground(new java.awt.Color(204, 204, 204));
        btnGuardarCargo.setText("Guardar Usuario");
        btnGuardarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCargoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("USERNAME:");

        btnCancelarCargo.setBackground(new java.awt.Color(51, 51, 51));
        btnCancelarCargo.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnCancelarCargo.setForeground(new java.awt.Color(204, 204, 204));
        btnCancelarCargo.setText("Cancelar");
        btnCancelarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCargoActionPerformed(evt);
            }
        });

        btnAgregarCargo.setBackground(new java.awt.Color(51, 51, 51));
        btnAgregarCargo.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnAgregarCargo.setForeground(new java.awt.Color(204, 204, 204));
        btnAgregarCargo.setText("Agregar Usuario");
        btnAgregarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCargoActionPerformed(evt);
            }
        });

        jtbUser.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jtbUser.setModel(modeloUser);
        jtbUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbUser);

        btnEliminarCargo.setBackground(new java.awt.Color(51, 51, 51));
        btnEliminarCargo.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnEliminarCargo.setForeground(new java.awt.Color(204, 204, 204));
        btnEliminarCargo.setText("Eliminar Usuario");
        btnEliminarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCargoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("ID:");

        btnSalir.setBackground(new java.awt.Color(51, 51, 51));
        btnSalir.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(204, 204, 204));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtIdUser.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N

        txtUserNameUser.setBackground(new java.awt.Color(51, 51, 51));
        txtUserNameUser.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txtUserNameUser.setForeground(new java.awt.Color(204, 204, 204));
        txtUserNameUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameUserActionPerformed(evt);
            }
        });

        btnModificarCargo.setBackground(new java.awt.Color(51, 51, 51));
        btnModificarCargo.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnModificarCargo.setForeground(new java.awt.Color(204, 204, 204));
        btnModificarCargo.setText("Modificar Usuario");
        btnModificarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCargoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Montserrat Black", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("FORMULARIO DE MANTENIMIENTO DE USUARIOS DE SISTEMA DE ARCHIVOS MDCH");

        cbCargo.setBackground(new java.awt.Color(51, 51, 51));
        cbCargo.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        cbCargo.setForeground(new java.awt.Color(204, 204, 204));
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

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("NOMBRES:");

        txtNombresUser.setBackground(new java.awt.Color(51, 51, 51));
        txtNombresUser.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txtNombresUser.setForeground(new java.awt.Color(204, 204, 204));
        txtNombresUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresUserActionPerformed(evt);
            }
        });

        txtApellidosUser.setBackground(new java.awt.Color(51, 51, 51));
        txtApellidosUser.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txtApellidosUser.setForeground(new java.awt.Color(204, 204, 204));
        txtApellidosUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosUserActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("APELLIDOS");

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("CONTRASEÑA:");

        txtPasswordUser.setBackground(new java.awt.Color(51, 51, 51));
        txtPasswordUser.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txtPasswordUser.setForeground(new java.awt.Color(204, 204, 204));
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
                .addContainerGap(194, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtPasswordUser, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel6)))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellidosUser, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombresUser, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUserNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarCargo)
                            .addComponent(btnModificarCargo)
                            .addComponent(btnEliminarCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelarCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardarCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(180, 180, 180))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel3))
                            .addComponent(txtUserNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel7))
                            .addComponent(txtPasswordUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2))
                            .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel5))
                                    .addComponent(txtNombresUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtApellidosUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(btnAgregarCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardarCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificarCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelarCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
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
        cbCargo.setSelectedItem(new Cargo((int) modeloUser.getValueAt(row, 3)));
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
                //FALTA JALAR EL ID DEL COMBO BOX
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
        try {
            llenarCargosCombo();
        } catch (Exception ex) {
            Logger.getLogger(FormUser.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        //int idselect = 5;
        //cbCargo.removeAllItems();
        CargoServicio cargoServicio=new CargoServicio();
        try {
            cbCargo.removeAllItems();
            ArrayList<Cargo> listaCargo = cargoServicio.mostrarCargo();
      
            for (int i = 0; i < listaCargo.size(); i++) {
                //cbCargo.addItem(listaCargo.get(i).getCargo());
                cbCargo.addItem(new Cargo(listaCargo.get(i).getId(), listaCargo.get(i).getCargo(), listaCargo.get(i).getDescripcion()));
                
            }
            
            //cbCargo.setSelectedItem(new Cargo(idselect));
            
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
    private javax.swing.JTextField txtIdUser;
    private javax.swing.JTextField txtNombresUser;
    private javax.swing.JTextField txtPasswordUser;
    private javax.swing.JTextField txtUserNameUser;
    // End of variables declaration//GEN-END:variables
}
