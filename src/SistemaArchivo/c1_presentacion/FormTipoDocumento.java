
package SistemaArchivo.c1_presentacion;

import SistemaArchivo.c2_aplicacion.TipoDocumentoServicio;
import SistemaArchivo.c3_dominio.TipoDocumento;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormTipoDocumento extends javax.swing.JInternalFrame {

    String nombreColumnaModeloTipoDocumento[] = {"Id", "Nombre Tipo Documento"};
    String nombreColumnaModeloEntrrada[] = {"Codigo", "Descripcion", "Precio", "Cantidad", "Importe"};
    String nombreColumnaModeloSalida[] = {"Codigo", "Descripcion", "Precio", "Cantidad", "Importe"};
    String nombreColumnaModeloOInventario[] = {"Codigo", "Descripcion", "Entrada", "Salida", "Stock"};
    
    DefaultTableModel modeloTipoDocumento = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    
    public FormTipoDocumento() {
        initComponents();
         this.getContentPane().setBackground(Color.DARK_GRAY);
         mostrarTipoDocumento();
        //activarInternalFrameInicio(true);
        modeloTipoDocumento.setColumnIdentifiers(nombreColumnaModeloTipoDocumento);
    }
    
    //metodo para mostrar los datos de la base a la tabla
    public void mostrarTipoDocumento() {
        try {
            TipoDocumentoServicio tipoDocumentoServicio = new TipoDocumentoServicio();
            ArrayList<TipoDocumento> lista = tipoDocumentoServicio.mostrarTipoDocumento();
            Object[][] fila = new Object[lista.size()][2];
            for (int i = 0; i < lista.size(); i++) {
                TipoDocumento tipoDocumento = lista.get(i);
                fila[i][0] = tipoDocumento.getId();
                fila[i][1] = tipoDocumento.getNombre();
            }
            modeloTipoDocumento.setDataVector(fila, nombreColumnaModeloTipoDocumento);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Sistema Archivo MDCH: Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        btnCancelarTipoDocumento = new javax.swing.JButton();
        btnAgregarTipoDocumento = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbTipoDocumento = new javax.swing.JTable();
        btnEliminarTipoDocumento = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        txtIdTipoDocumento = new javax.swing.JTextField();
        txtNombreTipoDocumento = new javax.swing.JTextField();
        btnGuardarTipoDocumento = new javax.swing.JButton();
        btnModificarTipoDocumento = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setResizable(true);

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel3.setText("NOMBRE TIPO DOCUMENTO:");

        btnCancelarTipoDocumento.setBackground(new java.awt.Color(51, 51, 51));
        btnCancelarTipoDocumento.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnCancelarTipoDocumento.setText("Cancelar");
        btnCancelarTipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarTipoDocumentoActionPerformed(evt);
            }
        });

        btnAgregarTipoDocumento.setBackground(new java.awt.Color(51, 51, 51));
        btnAgregarTipoDocumento.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnAgregarTipoDocumento.setText("Agregar Tipo Documento");
        btnAgregarTipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTipoDocumentoActionPerformed(evt);
            }
        });

        jtbTipoDocumento.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jtbTipoDocumento.setModel(modeloTipoDocumento);
        jtbTipoDocumento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbTipoDocumentoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbTipoDocumento);

        btnEliminarTipoDocumento.setBackground(new java.awt.Color(51, 51, 51));
        btnEliminarTipoDocumento.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnEliminarTipoDocumento.setText("Eliminar Tipo Documento");
        btnEliminarTipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTipoDocumentoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel1.setText("ID:");

        btnSalir.setBackground(new java.awt.Color(51, 51, 51));
        btnSalir.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtIdTipoDocumento.setBackground(new java.awt.Color(51, 51, 51));
        txtIdTipoDocumento.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N

        txtNombreTipoDocumento.setBackground(new java.awt.Color(51, 51, 51));
        txtNombreTipoDocumento.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txtNombreTipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreTipoDocumentoActionPerformed(evt);
            }
        });

        btnGuardarTipoDocumento.setBackground(new java.awt.Color(51, 51, 51));
        btnGuardarTipoDocumento.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnGuardarTipoDocumento.setText("Guardar Tipo Documento");
        btnGuardarTipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTipoDocumentoActionPerformed(evt);
            }
        });

        btnModificarTipoDocumento.setBackground(new java.awt.Color(51, 51, 51));
        btnModificarTipoDocumento.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnModificarTipoDocumento.setText("Modificar Tipo Documento");
        btnModificarTipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarTipoDocumentoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Montserrat Black", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("FORMULARIO DE MANTENIMIENTO DE TIPO DE DOCUMENTO DE SISTEMA DE ARCHIVOS MDCH");
        jLabel4.setAlignmentX(50.0F);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarTipoDocumento)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminarTipoDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnModificarTipoDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGuardarTipoDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelarTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(185, 185, 185))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregarTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnCancelarTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardarTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnModificarTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarTipoDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarTipoDocumentoActionPerformed
        txtIdTipoDocumento.setText("");
        txtNombreTipoDocumento.setText("");
        // activarInternalFrameInicio(true);
    }//GEN-LAST:event_btnCancelarTipoDocumentoActionPerformed

    private void btnAgregarTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTipoDocumentoActionPerformed

        //activarInternalFrameAgregarCargo(true);
    }//GEN-LAST:event_btnAgregarTipoDocumentoActionPerformed

    private void jtbTipoDocumentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbTipoDocumentoMouseClicked

        int row = jtbTipoDocumento.getSelectedRow();
        txtNombreTipoDocumento.setEnabled(true);
        txtIdTipoDocumento.setText(modeloTipoDocumento.getValueAt(row, 0).toString());
        txtNombreTipoDocumento.setText(modeloTipoDocumento.getValueAt(row, 1).toString());
        //activarInternalFrameModificarCargo(true);
    }//GEN-LAST:event_jtbTipoDocumentoMouseClicked

    private void btnEliminarTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTipoDocumentoActionPerformed

        int registros_afectados = 0;
        if (txtIdTipoDocumento.getText().compareTo("") != 0) {
            try {
                int resp = JOptionPane.showConfirmDialog(this, "Estas seguro que deseas eliminar? ", "Sistema Archivo MDCH: Advertencia", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {
                    TipoDocumentoServicio tipoDocumentoServicio = new TipoDocumentoServicio();
                    registros_afectados = tipoDocumentoServicio.eliminarTipoDocumento(Integer.parseInt(txtIdTipoDocumento.getText().trim()));
                    if (registros_afectados == 1) {
                        JOptionPane.showMessageDialog(this, "Se eliminó correctamente.", "Sistema Archivo MDCH: Error", JOptionPane.INFORMATION_MESSAGE);
                        //limpiarPanelCargo();
                        //activarInternalFrameCargo(true);
                        mostrarTipoDocumento();
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Sistema Archivo MDCH: Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un Producto.", "Sistema Archivo MDCH: Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarTipoDocumentoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtNombreTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreTipoDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreTipoDocumentoActionPerformed

    private void btnGuardarTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTipoDocumentoActionPerformed

        int registros_afectados = 0;
        if (txtNombreTipoDocumento.getText().compareTo("") != 0) {
            try {
                TipoDocumento tipoDocumento = new TipoDocumento();
                tipoDocumento.setNombre(txtNombreTipoDocumento.getText().trim().toUpperCase());
                TipoDocumentoServicio tipoDocumentoServicio = new TipoDocumentoServicio();
                registros_afectados = tipoDocumentoServicio.guardarTipoDocumento(tipoDocumento);
                if (registros_afectados == 1) {
                    JOptionPane.showMessageDialog(this, "Se guardo correctamente.", "Sistema Archivo MDCH: Error", JOptionPane.INFORMATION_MESSAGE);
                    //limpiarPanelCargo();
                    //activarInternalFrameInicio(true);
                    mostrarTipoDocumento();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Sistema Archivo MDCH: Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Faltan llenar datos.", "Sistema Archivo MDCH: Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarTipoDocumentoActionPerformed

    private void btnModificarTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarTipoDocumentoActionPerformed

        int registros_afectados = 0;
        if (txtNombreTipoDocumento.getText().compareTo("") != 0) {
            try {
                TipoDocumento tipoDocumento = new TipoDocumento();
                tipoDocumento.setId(Integer.parseInt(txtIdTipoDocumento.getText().trim()));
                tipoDocumento.setNombre(txtNombreTipoDocumento.getText().trim().toUpperCase());
                int resp = JOptionPane.showConfirmDialog(this, "Estas seguro que deseas actualizar la información? ", "Sistema Archivo MDCH: Advertencia", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {
                    TipoDocumentoServicio tipoDocumentoServicio = new TipoDocumentoServicio();
                    registros_afectados = tipoDocumentoServicio.actualizarTipoDocumento(tipoDocumento);
                    if (registros_afectados == 1) {
                        JOptionPane.showMessageDialog(this, "Se actualizo correctamente.", "Sistema Archivo MDCH: Error", JOptionPane.INFORMATION_MESSAGE);
                        //limpiarPanelCargo();
                        //activarInternalFrameCargo(true);
                        mostrarTipoDocumento();
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Sistema archivo MDCH: Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un CARGO y tener todos los campos con información.", "Sistema Archivo MDCH: Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarTipoDocumentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarTipoDocumento;
    private javax.swing.JButton btnCancelarTipoDocumento;
    private javax.swing.JButton btnEliminarTipoDocumento;
    private javax.swing.JButton btnGuardarTipoDocumento;
    private javax.swing.JButton btnModificarTipoDocumento;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbTipoDocumento;
    private javax.swing.JTextField txtIdTipoDocumento;
    private javax.swing.JTextField txtNombreTipoDocumento;
    // End of variables declaration//GEN-END:variables
}
