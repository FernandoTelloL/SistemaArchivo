package SistemaArchivo.c1_presentacion;

import SistemaArchivo.c2_aplicacion.CargoServicio;
import SistemaArchivo.c2_aplicacion.UserServicio;
import SistemaArchivo.c3_dominio.Cargo;
import SistemaArchivo.c3_dominio.User;
import SistemaArchivo.c4_persistencia.GestorJDBC;
import config.Utils;
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
    Utils util = new Utils();

    String nombreColumnaModeloUser[] = {"Id", "Username", "Contraseña", "Cargo","Cargo Id", "Nombres", "Apellidos"};
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
        util.loadConfig();
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
        txtIdUser = new javax.swing.JLabel();

        setClosable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("CARGO: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 187, -1, -1));

        btnGuardarCargo.setBackground(new java.awt.Color(51, 51, 51));
        btnGuardarCargo.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnGuardarCargo.setForeground(new java.awt.Color(204, 204, 204));
        btnGuardarCargo.setText("Guardar Usuario");
        btnGuardarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCargoActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardarCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(747, 337, 124, 35));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("USERNAME:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 119, -1, -1));

        btnCancelarCargo.setBackground(new java.awt.Color(51, 51, 51));
        btnCancelarCargo.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnCancelarCargo.setForeground(new java.awt.Color(204, 204, 204));
        btnCancelarCargo.setText("Cancelar");
        btnCancelarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCargoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelarCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(747, 471, 124, 33));

        btnAgregarCargo.setBackground(new java.awt.Color(51, 51, 51));
        btnAgregarCargo.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnAgregarCargo.setForeground(new java.awt.Color(204, 204, 204));
        btnAgregarCargo.setText("Agregar Usuario");
        btnAgregarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCargoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(747, 212, -1, 39));

        jtbUser.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jtbUser.setModel(modeloUser);
        jtbUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbUser);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 297, 686, 251));

        btnEliminarCargo.setBackground(new java.awt.Color(51, 51, 51));
        btnEliminarCargo.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnEliminarCargo.setForeground(new java.awt.Color(204, 204, 204));
        btnEliminarCargo.setText("Eliminar Usuario");
        btnEliminarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCargoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(747, 425, 124, 34));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 85, -1, -1));

        btnSalir.setBackground(new java.awt.Color(51, 51, 51));
        btnSalir.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(204, 204, 204));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(747, 516, 124, 32));

        txtUserNameUser.setBackground(new java.awt.Color(51, 51, 51));
        txtUserNameUser.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txtUserNameUser.setForeground(new java.awt.Color(204, 204, 204));
        txtUserNameUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameUserActionPerformed(evt);
            }
        });
        getContentPane().add(txtUserNameUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 116, 210, -1));

        btnModificarCargo.setBackground(new java.awt.Color(51, 51, 51));
        btnModificarCargo.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnModificarCargo.setForeground(new java.awt.Color(204, 204, 204));
        btnModificarCargo.setText("Modificar Usuario");
        btnModificarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCargoActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificarCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(747, 384, -1, 35));

        jLabel4.setFont(new java.awt.Font("Montserrat Black", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("FORMULARIO DE MANTENIMIENTO DE USUARIOS DE SISTEMA DE ARCHIVOS MDCH");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 15, -1, -1));

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
        cbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCargoActionPerformed(evt);
            }
        });
        getContentPane().add(cbCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 184, 210, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("NOMBRES:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 215, -1, -1));

        txtNombresUser.setBackground(new java.awt.Color(51, 51, 51));
        txtNombresUser.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txtNombresUser.setForeground(new java.awt.Color(204, 204, 204));
        txtNombresUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresUserActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombresUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 212, 587, -1));

        txtApellidosUser.setBackground(new java.awt.Color(51, 51, 51));
        txtApellidosUser.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txtApellidosUser.setForeground(new java.awt.Color(204, 204, 204));
        txtApellidosUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosUserActionPerformed(evt);
            }
        });
        getContentPane().add(txtApellidosUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 246, 587, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("APELLIDOS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 248, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("CONTRASEÑA:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 153, -1, -1));

        txtPasswordUser.setBackground(new java.awt.Color(51, 51, 51));
        txtPasswordUser.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txtPasswordUser.setForeground(new java.awt.Color(204, 204, 204));
        txtPasswordUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordUserActionPerformed(evt);
            }
        });
        getContentPane().add(txtPasswordUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 150, 210, -1));

        txtIdUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtIdUser.setText("jLabel8");
        getContentPane().add(txtIdUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCargoActionPerformed

        int registros_afectados = 0;

        //int id = cbCargo.getItemAt(cbCargo.getSelectedIndex()).getId();
        //txtIdCombo.setText(id+"");
        if ((txtUserNameUser.getText().compareTo("") != 0)
                && (txtNombresUser.getText().compareTo("") != 0)
                && (txtApellidosUser.getText().compareTo("") != 0)
                && txtPasswordUser.getText().compareTo("") != 0) {
            try {
                User user = new User();
                Cargo cargo = new Cargo();
                cargo.setId(cbCargo.getItemAt(cbCargo.getSelectedIndex()).getId());
                user.setUsername(txtUserNameUser.getText().trim().toUpperCase());
                user.setPassword(txtPasswordUser.getText().trim());
                user.setCargo(cargo);
                user.setNombres(txtNombresUser.getText().trim().toUpperCase());
                user.setApellidos(txtApellidosUser.getText().trim().toUpperCase());
                UserServicio userServicio = new UserServicio();
                registros_afectados = userServicio.guardarUser(user);
                if (registros_afectados == 1) {
                    JOptionPane.showMessageDialog(this, "Se guardo correctamente el usuario.", "Sistema Archivo MDCH: Error", JOptionPane.INFORMATION_MESSAGE);
                    //limpiarPanelCargo();
                    //activarInternalFrameInicio(true);
                    //mostrarCargo();
                    mostrarUser();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), util.getProperty("companyMsg").toString()+ ": Error", JOptionPane.ERROR_MESSAGE);
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
        txtNombresUser.setText(modeloUser.getValueAt(row, 5).toString());
        txtApellidosUser.setText(modeloUser.getValueAt(row, 6).toString());
        
        
        
        cbCargo.setSelectedItem(getCargo((Integer) modeloUser.getValueAt(row, 4)));
        //new Cargo((String) ) 

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
        if (txtUserNameUser.getText().compareTo("") != 0
                && txtPasswordUser.getText().compareTo("") != 0
                && txtNombresUser.getText().compareTo("") != 0
                && txtApellidosUser.getText().compareTo("") != 0) {
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
    }//GEN-LAST:event_cbCargoMouseClicked

    private void cbCargoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbCargoFocusGained
    }//GEN-LAST:event_cbCargoFocusGained

    private void txtPasswordUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordUserActionPerformed
    }//GEN-LAST:event_txtPasswordUserActionPerformed

    private void cbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCargoActionPerformed
    }//GEN-LAST:event_cbCargoActionPerformed

    private void llenarCargosCombo() {
        //int idselect = 5;
        //cbCargo.removeAllItems();
        CargoServicio cargoServicio = new CargoServicio();
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
        } catch (Exception ex) {
            Logger.getLogger(FormUser.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void mostrarUser() {
        try {
            Cargo cargo = new Cargo();
            UserServicio userServicio = new UserServicio();
            ArrayList<User> lista = userServicio.mostrarUser();
            Object[][] fila = new Object[lista.size()][7];
            for (int i = 0; i < lista.size(); i++) {
                User user = lista.get(i);
                fila[i][0] = user.getId();
                fila[i][1] = user.getUsername();
                fila[i][2] = user.getPassword();
                fila[i][3] = user.getCargo().getCargo();
                fila[i][4] = user.getCargo().getId();
                fila[i][5] = user.getNombres();
                fila[i][6] = user.getApellidos();
            }
            modeloUser.setDataVector(fila, nombreColumnaModeloUser);
            jtbUser.getColumnModel().getColumn(4).setPreferredWidth(0);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Sistema Archivo MDCH: Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private Cargo getCargo(int id){
        CargoServicio cargoServicio = new CargoServicio();
        try {
            return cargoServicio.findById(id);
        } catch (Exception ex) {
            Logger.getLogger(FormUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
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
    private javax.swing.JLabel txtIdUser;
    private javax.swing.JTextField txtNombresUser;
    private javax.swing.JTextField txtPasswordUser;
    private javax.swing.JTextField txtUserNameUser;
    // End of variables declaration//GEN-END:variables
}
