
package SistemaArchivo.c1_presentacion;

import SistemaArchivo.c2_aplicacion.CargoServicio;
import SistemaArchivo.c3_dominio.Cargo;
import java.awt.Color;
import java.beans.PropertyVetoException;
import java.lang.System.Logger;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormCargo extends javax.swing.JInternalFrame {
    
    String nombreColumnaModeloCargo[] = {"Id", "Cargo", "Descripción"};
    String nombreColumnaModeloEntrrada[] = {"Codigo", "Descripcion", "Precio", "Cantidad", "Importe"};
    String nombreColumnaModeloSalida[] = {"Codigo", "Descripcion", "Precio", "Cantidad", "Importe"};
    String nombreColumnaModeloOInventario[] = {"Codigo", "Descripcion", "Entrada", "Salida", "Stock"};
    DefaultTableModel modeloCargo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    public FormCargo() throws PropertyVetoException {
        initComponents();
        
        mostrarCargo();
        activarInternalFrameInicio(true);
        this.setMaximum(true);
        modeloCargo.setColumnIdentifiers(nombreColumnaModeloCargo);
        this.getContentPane().setBackground(Color.DARK_GRAY);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        txtNombreCargo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAgregarCargo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbCargo = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcionCargo = new javax.swing.JTextArea();
        btnEliminarCargo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtIdCargo = new javax.swing.JTextField();
        btnModificarCargo = new javax.swing.JButton();
        btnGuardarCargo = new javax.swing.JButton();
        btnCancelarCargo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setResizable(true);
        setTitle("CARGO");

        btnSalir.setBackground(new java.awt.Color(51, 51, 51));
        btnSalir.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(204, 204, 204));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtNombreCargo.setBackground(new java.awt.Color(51, 51, 51));
        txtNombreCargo.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txtNombreCargo.setForeground(new java.awt.Color(204, 204, 204));
        txtNombreCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCargoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("DESCRIPCION: ");

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("CARGO:");

        btnAgregarCargo.setBackground(new java.awt.Color(51, 51, 51));
        btnAgregarCargo.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnAgregarCargo.setForeground(new java.awt.Color(204, 204, 204));
        btnAgregarCargo.setText("Agregar Cargo");
        btnAgregarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCargoActionPerformed(evt);
            }
        });

        jtbCargo.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jtbCargo.setModel(modeloCargo);
        jtbCargo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbCargoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbCargo);

        txtDescripcionCargo.setBackground(new java.awt.Color(51, 51, 51));
        txtDescripcionCargo.setColumns(20);
        txtDescripcionCargo.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txtDescripcionCargo.setForeground(new java.awt.Color(204, 204, 204));
        txtDescripcionCargo.setRows(5);
        jScrollPane2.setViewportView(txtDescripcionCargo);

        btnEliminarCargo.setBackground(new java.awt.Color(51, 51, 51));
        btnEliminarCargo.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnEliminarCargo.setForeground(new java.awt.Color(204, 204, 204));
        btnEliminarCargo.setText("Eliminar Cargo");
        btnEliminarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCargoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("ID:");

        txtIdCargo.setBackground(new java.awt.Color(51, 51, 51));
        txtIdCargo.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txtIdCargo.setForeground(new java.awt.Color(204, 204, 204));

        btnModificarCargo.setBackground(new java.awt.Color(51, 51, 51));
        btnModificarCargo.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnModificarCargo.setForeground(new java.awt.Color(204, 204, 204));
        btnModificarCargo.setText("Modificar Cargo");
        btnModificarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCargoActionPerformed(evt);
            }
        });

        btnGuardarCargo.setBackground(new java.awt.Color(51, 51, 51));
        btnGuardarCargo.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnGuardarCargo.setForeground(new java.awt.Color(204, 204, 204));
        btnGuardarCargo.setText("Guardar Cargo");
        btnGuardarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCargoActionPerformed(evt);
            }
        });

        btnCancelarCargo.setBackground(new java.awt.Color(51, 51, 51));
        btnCancelarCargo.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnCancelarCargo.setForeground(new java.awt.Color(204, 204, 204));
        btnCancelarCargo.setText("Cancelar");
        btnCancelarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCargoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Montserrat Black", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("FORMULARIO DE MANTENIMIENTO DE CARGOS DE SISTEMA DE ARCHIVOS MDCH");
        jLabel4.setAlignmentX(50.0F);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombreCargo, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2)
                                    .addComponent(txtIdCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAgregarCargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarCargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModificarCargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuardarCargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelarCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(166, 166, 166))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel4)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregarCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardarCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificarCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public void mostrarCargo() {
        try {
            CargoServicio cargoServicio = new CargoServicio();
            ArrayList<Cargo> lista = cargoServicio.mostrarCargo();
            Object[][] fila = new Object[lista.size()][3];
            for (int i = 0; i < lista.size(); i++) {
                Cargo cargo = lista.get(i);
                fila[i][0] = cargo.getId();
                fila[i][1] = cargo.getCargo();
                fila[i][2] = cargo.getDescripcion();
            }
            modeloCargo.setDataVector(fila, nombreColumnaModeloCargo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Sistema Archivo MDCH: Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
     
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        
        this.dispose();
        
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtNombreCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCargoActionPerformed

    private void btnAgregarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCargoActionPerformed
       
        activarInternalFrameAgregarCargo(true);
        
    }//GEN-LAST:event_btnAgregarCargoActionPerformed

    //funcion para mostrar los datos de la fila en las cajas de texto del formulario
    private void jtbCargoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbCargoMouseClicked
        
        int row = jtbCargo.getSelectedRow();
        txtNombreCargo.setEnabled(true);
        txtDescripcionCargo.setEnabled(true);
        txtIdCargo.setText(modeloCargo.getValueAt(row, 0).toString());
        txtNombreCargo.setText(modeloCargo.getValueAt(row, 1).toString());
        txtDescripcionCargo.setText(modeloCargo.getValueAt(row, 2).toString());
        activarInternalFrameModificarCargo(true);
        
    }//GEN-LAST:event_jtbCargoMouseClicked

    private void btnEliminarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCargoActionPerformed
        
        int registros_afectados = 0;
        if (txtIdCargo.getText().compareTo("") != 0) {
            try {
                int resp = JOptionPane.showConfirmDialog(this, "Estas seguro que deseas eliminar? ", "Sistema Archivo MDCH: Advertencia", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {
                    CargoServicio cargoServicio = new CargoServicio();
                    registros_afectados = cargoServicio.eliminarCargo(Integer.parseInt(txtIdCargo.getText().trim()));
                    if (registros_afectados == 1) {
                        JOptionPane.showMessageDialog(this, "Se eliminó correctamente.", "Sistema Archivo MDCH: Error", JOptionPane.INFORMATION_MESSAGE);
                        limpiarPanelCargo();
                        activarInternalFrameCargo(true);
                        mostrarCargo();
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Sistema Archivo MDCH: Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un Producto.", "Sistema Archivo MDCH: Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btnEliminarCargoActionPerformed

    private void btnModificarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCargoActionPerformed
        
        int registros_afectados = 0;
        if (txtNombreCargo.getText().compareTo("") != 0 && txtDescripcionCargo.getText().compareTo("") != 0) {
            try {
                Cargo cargo = new Cargo();
                cargo.setId(Integer.parseInt(txtIdCargo.getText().trim()));
                cargo.setCargo(txtNombreCargo.getText().trim().toUpperCase());
                cargo.setDescripcion(txtDescripcionCargo.getText().trim().toUpperCase());
                int resp = JOptionPane.showConfirmDialog(this, "Estas seguro que deseas actualizar la información? ", "Sistema Archivo MDCH: Advertencia", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {
                    CargoServicio cargoServicio = new CargoServicio();
                    registros_afectados = cargoServicio.actualizarCargo(cargo);
                    if (registros_afectados == 1) {
                        JOptionPane.showMessageDialog(this, "Se actualizo correctamente.", "Sistema Archivo MDCH: Error", JOptionPane.INFORMATION_MESSAGE);
                        limpiarPanelCargo();
                        activarInternalFrameCargo(true);
                        mostrarCargo();
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Sistema archivo MDCH: Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un CARGO y tener todos los campos con información.", "Sistema Archivo MDCH: Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btnModificarCargoActionPerformed

    private void btnGuardarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCargoActionPerformed
        
         int registros_afectados = 0;
        if (txtNombreCargo.getText().compareTo("") != 0 && txtDescripcionCargo.getText().compareTo("") != 0) {
            try {
                Cargo cargo = new Cargo();
                cargo.setCargo(txtNombreCargo.getText().trim().toUpperCase());
                cargo.setDescripcion(txtDescripcionCargo.getText().trim().toUpperCase());
                CargoServicio cargoServicio = new CargoServicio();
                registros_afectados = cargoServicio.guardarCargo(cargo);
                if (registros_afectados == 1) {
                    JOptionPane.showMessageDialog(this, "Se guardo correctamente.", "Sistema Archivo MDCH: Error", JOptionPane.INFORMATION_MESSAGE);
                    limpiarPanelCargo();
                    activarInternalFrameInicio(true);
                    mostrarCargo();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Sistema Archivo MDCH: Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Faltan llenar datos.", "Sistema Archivo MDCH: Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btnGuardarCargoActionPerformed

    private void btnCancelarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCargoActionPerformed
        txtIdCargo.setText("");
        txtNombreCargo.setText("");
        txtDescripcionCargo.setText("");
        activarInternalFrameInicio(true);
    }//GEN-LAST:event_btnCancelarCargoActionPerformed

    public void limpiarPanelCargo() {
        txtIdCargo.setText("");
        txtNombreCargo.setText("");
        txtDescripcionCargo.setText("");
    }

    public void activarInternalFrameCargo(boolean sw) {
        txtIdCargo.setEnabled(!sw);
        txtNombreCargo.setEnabled(!sw);
        txtDescripcionCargo.setEnabled(!sw);
        btnAgregarCargo.setEnabled(sw);
        btnGuardarCargo.setEnabled(!sw);
        btnCancelarCargo.setEnabled(!sw);
        btnModificarCargo.setEnabled(sw);
        btnEliminarCargo.setEnabled(sw);
    }
    
    public void activarInternalFrameInicio(boolean sw) {
        txtIdCargo.setEnabled(!sw);
        txtNombreCargo.setEnabled(!sw);
        txtDescripcionCargo.setEnabled(!sw);
        btnAgregarCargo.setEnabled(sw);
        btnGuardarCargo.setEnabled(!sw);
        btnCancelarCargo.setEnabled(!sw);
        btnModificarCargo.setEnabled(!sw);
        btnEliminarCargo.setEnabled(!sw);
        btnSalir.setEnabled(sw);
    }
    
    public void activarInternalFrameAgregarCargo(boolean sw) {
        txtNombreCargo.setEnabled(sw);
        txtDescripcionCargo.setEnabled(sw);
        btnGuardarCargo.setEnabled(sw);
        btnCancelarCargo.setEnabled(sw);
        btnAgregarCargo.setEnabled(!sw);
        btnAgregarCargo.setForeground(Color.gray);
        txtIdCargo.setEnabled(!sw);
        txtIdCargo.setBackground(Color.DARK_GRAY);
        txtIdCargo.setForeground(Color.gray);
    }
    
    public void activarInternalFrameModificarCargo(boolean sw) {
        txtIdCargo.setEnabled(!sw);
        txtNombreCargo.setEnabled(sw);
        txtDescripcionCargo.setEnabled(sw);
        btnAgregarCargo.setEnabled(!sw);
        btnGuardarCargo.setEnabled(!sw);
        btnCancelarCargo.setEnabled(sw);
        btnModificarCargo.setEnabled(sw);
        btnEliminarCargo.setEnabled(sw);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCargo;
    private javax.swing.JButton btnCancelarCargo;
    private javax.swing.JButton btnEliminarCargo;
    private javax.swing.JButton btnGuardarCargo;
    private javax.swing.JButton btnModificarCargo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtbCargo;
    private javax.swing.JTextArea txtDescripcionCargo;
    private javax.swing.JTextField txtIdCargo;
    private javax.swing.JTextField txtNombreCargo;
    // End of variables declaration//GEN-END:variables
}
