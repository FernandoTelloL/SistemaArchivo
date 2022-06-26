
package SistemaArchivo.c1_presentacion;

import SistemaArchivo.c2_aplicacion.AreaServicio;
import SistemaArchivo.c3_dominio.Area;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormArea extends javax.swing.JInternalFrame {

    String nombreColumnaModeloArea[] = {"Id", "Nombre Área"};
    String nombreColumnaModeloEntrrada[] = {"Codigo", "Descripcion", "Precio", "Cantidad", "Importe"};
    String nombreColumnaModeloSalida[] = {"Codigo", "Descripcion", "Precio", "Cantidad", "Importe"};
    String nombreColumnaModeloOInventario[] = {"Codigo", "Descripcion", "Entrada", "Salida", "Stock"};
    DefaultTableModel modeloArea = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    
    public FormArea() {
        initComponents();
        
        mostrarArea();
        //activarInternalFrameInicio(true);
        modeloArea.setColumnIdentifiers(nombreColumnaModeloArea);
        this.getContentPane().setBackground(Color.DARK_GRAY);
    }
    
    public void mostrarArea() {
        try {
            AreaServicio areaServicio = new AreaServicio();
            ArrayList<Area> lista = areaServicio.mostrarArea();
            Object[][] fila = new Object[lista.size()][2];
            for (int i = 0; i < lista.size(); i++) {
                Area area = lista.get(i);
                fila[i][0] = area.getId();
                fila[i][1] = area.getNombre_area();
            }
            modeloArea.setDataVector(fila, nombreColumnaModeloArea);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Sistema Archivo MDCH: Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuardarArea = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnCancelarArea = new javax.swing.JButton();
        btnAgregarArea = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbArea = new javax.swing.JTable();
        btnEliminarArea = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        txtIdArea = new javax.swing.JTextField();
        txtNombreArea = new javax.swing.JTextField();
        btnModificarArea = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setClosable(true);
        setResizable(true);

        btnGuardarArea.setBackground(new java.awt.Color(51, 51, 51));
        btnGuardarArea.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnGuardarArea.setForeground(new java.awt.Color(204, 204, 204));
        btnGuardarArea.setText("Guardar Área");
        btnGuardarArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAreaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("AREA:");

        btnCancelarArea.setBackground(new java.awt.Color(51, 51, 51));
        btnCancelarArea.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnCancelarArea.setForeground(new java.awt.Color(204, 204, 204));
        btnCancelarArea.setText("Cancelar");
        btnCancelarArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAreaActionPerformed(evt);
            }
        });

        btnAgregarArea.setBackground(new java.awt.Color(51, 51, 51));
        btnAgregarArea.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnAgregarArea.setForeground(new java.awt.Color(204, 204, 204));
        btnAgregarArea.setText("Agregar Área");
        btnAgregarArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAreaActionPerformed(evt);
            }
        });

        jtbArea.setModel(modeloArea);
        jtbArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbAreaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbArea);

        btnEliminarArea.setBackground(new java.awt.Color(51, 51, 51));
        btnEliminarArea.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnEliminarArea.setForeground(new java.awt.Color(204, 204, 204));
        btnEliminarArea.setText("Eliminar Área");
        btnEliminarArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAreaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("ID:");

        btnSalir.setBackground(new java.awt.Color(51, 51, 51));
        btnSalir.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(204, 204, 204));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtIdArea.setBackground(new java.awt.Color(102, 102, 102));
        txtIdArea.setForeground(new java.awt.Color(204, 204, 204));

        txtNombreArea.setBackground(new java.awt.Color(102, 102, 102));
        txtNombreArea.setForeground(new java.awt.Color(204, 204, 204));
        txtNombreArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreAreaActionPerformed(evt);
            }
        });

        btnModificarArea.setBackground(new java.awt.Color(51, 51, 51));
        btnModificarArea.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnModificarArea.setForeground(new java.awt.Color(204, 204, 204));
        btnModificarArea.setText("Modificar Área");
        btnModificarArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarAreaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Montserrat Black", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("FORMULARIO DE MANTENIMIENTO DE ÁREAS DE SISTEMA DE ARCHIVOS MDCH");
        jLabel4.setAlignmentX(50.0F);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdArea, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAgregarArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModificarArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuardarArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelarArea, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(198, 198, 198))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1031, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel4)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtIdArea)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregarArea, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnCancelarArea, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardarArea, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificarArea, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarArea, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAreaActionPerformed

        int registros_afectados = 0;
        if (txtNombreArea.getText().compareTo("") != 0) {
            try {
                Area area = new Area();
                area.setNombre_area(txtNombreArea.getText().trim().toUpperCase());
                AreaServicio areaServicio = new AreaServicio();
                registros_afectados = areaServicio.guardarArea(area);
                if (registros_afectados == 1) {
                    JOptionPane.showMessageDialog(this, "Se guardo correctamente.", "Sistema Archivo MDCH: Error", JOptionPane.INFORMATION_MESSAGE);
                    //limpiarPanelCargo();
                    //activarInternalFrameInicio(true);
                    mostrarArea();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Sistema Archivo MDCH: Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Faltan llenar datos.", "Sistema Archivo MDCH: Advertencia", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnGuardarAreaActionPerformed

    private void btnCancelarAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAreaActionPerformed
        txtIdArea.setText("");
        txtNombreArea.setText("");
       // activarInternalFrameInicio(true);
    }//GEN-LAST:event_btnCancelarAreaActionPerformed

    private void btnAgregarAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAreaActionPerformed

        //activarInternalFrameAgregarCargo(true);

    }//GEN-LAST:event_btnAgregarAreaActionPerformed

    private void jtbAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbAreaMouseClicked

        int row = jtbArea.getSelectedRow();
        txtNombreArea.setEnabled(true);
        txtIdArea.setText(modeloArea.getValueAt(row, 0).toString());
        txtNombreArea.setText(modeloArea.getValueAt(row, 1).toString());
        //activarInternalFrameModificarCargo(true);

    }//GEN-LAST:event_jtbAreaMouseClicked

    private void btnEliminarAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAreaActionPerformed

        int registros_afectados = 0;
        if (txtIdArea.getText().compareTo("") != 0) {
            try {
                int resp = JOptionPane.showConfirmDialog(this, "Estas seguro que deseas eliminar? ", "Sistema Archivo MDCH: Advertencia", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {
                    AreaServicio cargoServicio = new AreaServicio();
                    registros_afectados = cargoServicio.eliminarArea(Integer.parseInt(txtIdArea.getText().trim()));
                    if (registros_afectados == 1) {
                        JOptionPane.showMessageDialog(this, "Se eliminó correctamente.", "Sistema Archivo MDCH: Error", JOptionPane.INFORMATION_MESSAGE);
                        //limpiarPanelCargo();
                        //activarInternalFrameCargo(true);
                        mostrarArea();
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Sistema Archivo MDCH: Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un Producto.", "Sistema Archivo MDCH: Advertencia", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnEliminarAreaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        this.dispose();

    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtNombreAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreAreaActionPerformed

    private void btnModificarAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarAreaActionPerformed

        int registros_afectados = 0;
        if (txtNombreArea.getText().compareTo("") != 0) {
            try {
                Area area = new Area();
                area.setId(Integer.parseInt(txtIdArea.getText().trim()));
                area.setNombre_area(txtNombreArea.getText().trim().toUpperCase());
                int resp = JOptionPane.showConfirmDialog(this, "Estas seguro que deseas actualizar la información? ", "Sistema Archivo MDCH: Advertencia", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {
                    AreaServicio areaServicio = new AreaServicio();
                    registros_afectados = areaServicio.actualizarArea(area);
                    if (registros_afectados == 1) {
                        JOptionPane.showMessageDialog(this, "Se actualizo correctamente.", "Sistema Archivo MDCH: Error", JOptionPane.INFORMATION_MESSAGE);
                        //limpiarPanelCargo();
                        //activarInternalFrameCargo(true);
                        mostrarArea();
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Sistema archivo MDCH: Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un CARGO y tener todos los campos con información.", "Sistema Archivo MDCH: Advertencia", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnModificarAreaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarArea;
    private javax.swing.JButton btnCancelarArea;
    private javax.swing.JButton btnEliminarArea;
    private javax.swing.JButton btnGuardarArea;
    private javax.swing.JButton btnModificarArea;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbArea;
    private javax.swing.JTextField txtIdArea;
    private javax.swing.JTextField txtNombreArea;
    // End of variables declaration//GEN-END:variables
}
