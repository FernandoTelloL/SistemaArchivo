package SistemaArchivo.c1_presentacion;

import SistemaArchivo.c2_aplicacion.CargoServicio;
import SistemaArchivo.c2_aplicacion.DocumentoServicio;
import SistemaArchivo.c2_aplicacion.TipoDocumentoServicio;
import SistemaArchivo.c3_dominio.Area;
import SistemaArchivo.c3_dominio.Cargo;
import SistemaArchivo.c3_dominio.Documento;
import SistemaArchivo.c3_dominio.TipoDocumento;
import SistemaArchivo.c3_dominio.User;
import config.Utils;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

public class FormDocumento extends javax.swing.JInternalFrame {

    Utils util = new Utils();
    File selectedFile = null;

    public FormDocumento() {
        initComponents();
        util.loadConfig();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seleccionarfile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbTipoDocumento = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbArea = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbNumExpediente = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDescripcion = new javax.swing.JTextArea();
        btnguardar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblfilename = new javax.swing.JLabel();
        jdc = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setResizable(true);

        seleccionarfile.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        seleccionarfile.setText("Buscar Archivo");
        seleccionarfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarfileActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo-muni-light.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setText("Tipo de documento");

        cbTipoDocumento.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cbTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("Área");

        cbArea.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cbArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setText("Número de Expediente");

        cbNumExpediente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cbNumExpediente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setText("Fecha de creación de documento");

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setText("Descripción");

        jtDescripcion.setColumns(20);
        jtDescripcion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtDescripcion.setLineWrap(true);
        jtDescripcion.setRows(5);
        jScrollPane1.setViewportView(jtDescripcion);

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Documento");

        lblfilename.setText("...");

        jdc.setDateFormatString("dd MMM y");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblfilename, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(seleccionarfile))
                        .addComponent(jScrollPane1))
                    .addComponent(cbArea, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jdc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbNumExpediente, javax.swing.GroupLayout.Alignment.LEADING, 0, 170, Short.MAX_VALUE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbNumExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jdc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblfilename)
                    .addComponent(seleccionarfile))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(32, 32, 32)
                .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seleccionarfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarfileActionPerformed
        JFileChooser file = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

        file.setFileFilter(new FileNameExtensionFilter("Archivo Pdf", "pdf"));
        int returnValue = file.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            selectedFile = file.getSelectedFile();
            lblfilename.setText(selectedFile.getAbsolutePath());
            //saveDocument(selectedFile);
        }

    }//GEN-LAST:event_seleccionarfileActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        int registros_afectados = 0;

        //validar campos vacios, esto lo haces tu cagon ejejejej
        
        //datos harcodeados
        Area area = new Area();
        TipoDocumento tipoDocumento = new TipoDocumento();
        User user = new User();
        
        area.setId(1);
        tipoDocumento.setId(1);
        user.setId(1);                                
        
        //capturar fecha
        Date date = jdc.getDate();
        
        Long time = date.getTime();
        
        java.sql.Date d = new java.sql.Date(time);
        
        
        try {
            Documento documento = new Documento("101",area,"102", d,"desc",user, tipoDocumento, "V", selectedFile.getName());                                                            
            DocumentoServicio documentoServicio = new DocumentoServicio();
            registros_afectados = documentoServicio.guardarDocumento(documento);
            if (registros_afectados == 1) {                
                JOptionPane.showMessageDialog(this, "Se guardo correctamente.", util.getProperty("companyMsg").toString(), JOptionPane.INFORMATION_MESSAGE);                                
                
                if(!saveDocument(selectedFile)){
                    JOptionPane.showMessageDialog(this, "Error al copiar archivo "+selectedFile.getName(), util.getProperty("companyMsg").toString()+"Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), util.getProperty("companyMsg").toString()+"Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnguardarActionPerformed

                
            
    
//    private void llenarTipoDocumentoCombo() {
//        TipoDocumentoServicio tipoDocumentoServicio = new TipoDocumentoServicio();
//        try {
//            cbCargo.removeAllItems();
//            ArrayList<Cargo> listaCargo = cargoServicio.mostrarCargo();
//
//            for (int i = 0; i < listaCargo.size(); i++) {
//                //cbCargo.addItem(listaCargo.get(i).getCargo());
//                cbCargo.addItem(new Cargo(listaCargo.get(i).getId(), listaCargo.get(i).getCargo(), listaCargo.get(i).getDescripcion()));
//
//            }
//
//            //cbCargo.setSelectedItem(new Cargo(idselect));
//        } catch (SQLException ex) {
//            Logger.getLogger(FormUser.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (Exception ex) {
//            Logger.getLogger(FormUser.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }
//

    private boolean saveDocument(File source) {
        try {
            System.out.println("path -> "+loadDirectory());
            Files.copy(source.toPath(), (new File(loadDirectory() +"/"+source.getName())).toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException ex) {
            Logger.getLogger(FormDocumento.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    private File loadDirectory(){
        String path = util.getProperty("path").toString();
        
        if (path != null && !path.isEmpty()) {
             File directorio = new File(path);
             if (!directorio.exists()) {
                 if (!directorio.mkdirs()) {
                     JOptionPane.showMessageDialog(this, "No se pudo crear el directorio especificado en la propiedad path del archivo properties", util.getProperty("companyMsg").toString()+" Error", JOptionPane.ERROR_MESSAGE);
                     return null;
                 }else{
                     return directorio;
                 }
            }else{
                 return directorio;
             }                
        }else{
            JOptionPane.showMessageDialog(this, "No se ha definido el directorio para la copia de archivos", util.getProperty("companyMsg").toString()+" Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguardar;
    private javax.swing.JComboBox<String> cbArea;
    private javax.swing.JComboBox<String> cbNumExpediente;
    private javax.swing.JComboBox<String> cbTipoDocumento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdc;
    private javax.swing.JTextArea jtDescripcion;
    private javax.swing.JLabel lblfilename;
    private javax.swing.JButton seleccionarfile;
    // End of variables declaration//GEN-END:variables
}
