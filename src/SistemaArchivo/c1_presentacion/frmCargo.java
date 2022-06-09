
package SistemaArchivo.c1_presentacion;

import SistemaArchivo.c2_aplicacion.CargoServicio;
import SistemaArchivo.c3_dominio.Cargo;
import java.beans.PropertyVetoException;
import java.lang.System.Logger;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmCargo extends javax.swing.JInternalFrame {
    
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

    public frmCargo() throws PropertyVetoException {
        initComponents();
      
        mostrarCargo();
        modeloCargo.setColumnIdentifiers(nombreColumnaModeloCargo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
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

        setTitle("CARGO");

        btnRegresar.setText("Salir");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        txtNombreCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCargoActionPerformed(evt);
            }
        });

        jLabel2.setText("DESCRIPCION: ");

        jLabel3.setText("CARGO:");

        btnAgregarCargo.setText("Agregar Cargo");
        btnAgregarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCargoActionPerformed(evt);
            }
        });

        jtbCargo.setModel(modeloCargo);
        jtbCargo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbCargoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbCargo);

        txtDescripcionCargo.setColumns(20);
        txtDescripcionCargo.setRows(5);
        jScrollPane2.setViewportView(txtDescripcionCargo);

        btnEliminarCargo.setText("Eliminar Cargo");
        btnEliminarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCargoActionPerformed(evt);
            }
        });

        jLabel1.setText("ID:");

        btnModificarCargo.setText("Modificar Cargo");
        btnModificarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCargoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(txtNombreCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregarCargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarCargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificarCargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btnAgregarCargo)
                        .addGap(22, 22, 22)
                        .addComponent(btnModificarCargo)
                        .addGap(27, 27, 27)
                        .addComponent(btnEliminarCargo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar)
                        .addGap(134, 134, 134))))
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
    
    
     
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        
        this.dispose();
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtNombreCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCargoActionPerformed

    private void btnAgregarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCargoActionPerformed
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
                    //activarOpcionPanelProducto(true);
                    mostrarCargo();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Sistema Archivo MDCH: Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Faltan llenar datos.", "Sistema Archivo MDCH: Advertencia", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnAgregarCargoActionPerformed

    //funcion para mostrar los datos de la fila en las cajas de texto del formulario
    private void jtbCargoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbCargoMouseClicked
        
        int row = jtbCargo.getSelectedRow();
        txtNombreCargo.setEnabled(true);
        txtDescripcionCargo.setEnabled(true);
        txtIdCargo.setText(modeloCargo.getValueAt(row, 0).toString());
        txtNombreCargo.setText(modeloCargo.getValueAt(row, 1).toString());
        txtDescripcionCargo.setText(modeloCargo.getValueAt(row, 2).toString());
        
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
                        //activarOpcionPanelProducto(true);
                        mostrarCargo();
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Sistema ChicamaSoft: Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un Producto.", "Sistema ChicamaSoft: Advertencia", JOptionPane.WARNING_MESSAGE);
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
                int resp = JOptionPane.showConfirmDialog(this, "Estas seguro que deseas actualizar? ", "Sistema Archivo MDCH: Advertencia", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {
                    CargoServicio cargoServicio = new CargoServicio();
                    registros_afectados = cargoServicio.actualizarCargo(cargo);
                    if (registros_afectados == 1) {
                        JOptionPane.showMessageDialog(this, "Se actualizo coreectamente.", "Sistema Archivo MDCH: Error", JOptionPane.INFORMATION_MESSAGE);
                        limpiarPanelCargo();
                        //activarOpcionPanelProducto(true);
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

    public void limpiarPanelCargo() {
        txtIdCargo.setText("");
        txtNombreCargo.setText("");
        txtDescripcionCargo.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCargo;
    private javax.swing.JButton btnEliminarCargo;
    private javax.swing.JButton btnModificarCargo;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtbCargo;
    private javax.swing.JTextArea txtDescripcionCargo;
    private javax.swing.JTextField txtIdCargo;
    private javax.swing.JTextField txtNombreCargo;
    // End of variables declaration//GEN-END:variables
}
