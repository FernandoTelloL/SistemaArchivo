
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
        txtDescripcionCargo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAgregarCargo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbCargo = new javax.swing.JTable();

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
        jScrollPane1.setViewportView(jtbCargo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarCargo)
                            .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(27, 27, 27))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(64, 64, 64)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescripcionCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtNombreCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescripcionCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnAgregarCargo)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegresar)))
                .addContainerGap(23, Short.MAX_VALUE))
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
                    //mostrarProductos();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Sistema ChicamaSoft: Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Faltan llenar datos.", "Sistema ChicamaSoft: Advertencia", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnAgregarCargoActionPerformed

    public void limpiarPanelCargo() {
        txtNombreCargo.setText("");
        txtDescripcionCargo.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCargo;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbCargo;
    private javax.swing.JTextField txtDescripcionCargo;
    private javax.swing.JTextField txtNombreCargo;
    // End of variables declaration//GEN-END:variables
}
