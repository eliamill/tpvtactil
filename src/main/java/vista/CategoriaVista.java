/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.dao.beans.Categoria;
import modelo.dao.beans.enums.TipoGestion;
import modelo.gestionBd.GestionSql;
import modelo.servicios.CategoriaServicio;

/**
 * Clase CategoriaVista
 *
 * @author Eliamill Brandt
 * @version 1.1
 */
public class CategoriaVista extends javax.swing.JFrame {

    private CategoriaServicio categoriaServicio;
    private int row = -1;

    /**
     * Método Categoria vista Inicializa componetes en lista
     */
    public CategoriaVista() {
        initComponents();
        try {
            GestionSql gestionSql = new GestionSql();
            gestionSql.openConnection();
            categoriaServicio = new CategoriaServicio();
            List<Categoria> categorias = categoriaServicio.gestionarCategoria(null, TipoGestion.LISTAR);
            cargarCategoriasEnTabla(categorias);
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaVista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * por defecto
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldNuevoNombreCategoria = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButtonModificar = new javax.swing.JButton();
        jButtonBorrarCategoria = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePresentaCategorias = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButtonInsertar = new javax.swing.JButton();
        jLabelcategoriaModificandose = new javax.swing.JLabel();

        setTitle("Gestion de Categorias");

        jLabel3.setText("Nombre de la Categoria");

        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonBorrarCategoria.setText("Borrar");
        jButtonBorrarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarCategoriaActionPerformed(evt);
            }
        });

        jTablePresentaCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTablePresentaCategorias.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTablePresentaCategoriasFocusLost(evt);
            }
        });
        jTablePresentaCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePresentaCategoriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePresentaCategorias);

        jLabel4.setText("Categorias");

        jButtonInsertar.setText("Insertar");
        jButtonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(178, 178, 178)
                                        .addComponent(jLabelcategoriaModificandose, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldNuevoNombreCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonBorrarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(69, 69, 69))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNuevoNombreCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonInsertar)
                    .addComponent(jButtonModificar)
                    .addComponent(jButtonBorrarCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelcategoriaModificandose, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabelcategoriaModificandose.getAccessibleContext().setAccessibleName("categoríaModificandose");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método que llama un evento del boton modificar
     *
     * @param evt
     */
    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        if (row != -1 && jTextFieldNuevoNombreCategoria.getText() != null && jTextFieldNuevoNombreCategoria.getText().length() > 0) {
            try {
                String nombre = (String) jTablePresentaCategorias.getModel().getValueAt(row, 2);
                Categoria categoria = categoriaServicio.getCategoriaByNombre(nombre);
                categoria.setNombre(jTextFieldNuevoNombreCategoria.getText());
                categoriaServicio.gestionarCategoria(categoria, TipoGestion.MODIFICAR);
                List<Categoria> categorias = categoriaServicio.gestionarCategoria(null, TipoGestion.LISTAR);
                cargarCategoriasEnTabla(categorias);
            } catch (SQLException ex) {
                Logger.getLogger(CategoriaVista.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jButtonModificarActionPerformed

    /**
     * Método que llama un evento del boton insertar
     *
     * @param evt
     */
    private void jButtonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertarActionPerformed
        String nombreCategoria = jTextFieldNuevoNombreCategoria.getText();
        if (nombreCategoria != null && nombreCategoria.length() > 0) {
            try {
                Categoria categoria = new Categoria();
                categoria.setNombre(nombreCategoria);
                categoriaServicio.gestionarCategoria(categoria, TipoGestion.INSERTAR);
                List<Categoria> categorias = categoriaServicio.gestionarCategoria(null, TipoGestion.LISTAR);
                cargarCategoriasEnTabla(categorias);
            } catch (SQLException ex) {
                Logger.getLogger(CategoriaVista.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jButtonInsertarActionPerformed

    /**
     * Método que permite seleccionar las filas de la tabla
     *
     * @param evt
     */
    private void jTablePresentaCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePresentaCategoriasMouseClicked
        JTable source = (JTable) evt.getSource();
        row = source.rowAtPoint(evt.getPoint());
        String nombre = (String) jTablePresentaCategorias.getModel().getValueAt(row, 2);
        jTextFieldNuevoNombreCategoria.setText(nombre);
        jLabelcategoriaModificandose.setText(String.valueOf(row + 1));
    }//GEN-LAST:event_jTablePresentaCategoriasMouseClicked

    /**
     * Método que llama un evento en el boton borrar
     *
     * @param evt
     */
    private void jButtonBorrarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarCategoriaActionPerformed
        if (row != -1 && jTextFieldNuevoNombreCategoria.getText() != null && jTextFieldNuevoNombreCategoria.getText().length() > 0) {
            try {
                String nombre = (String) jTablePresentaCategorias.getModel().getValueAt(row, 2);
                Categoria categoria = categoriaServicio.getCategoriaByNombre(nombre);
                categoriaServicio.gestionarCategoria(categoria, TipoGestion.BORRAR);
                List<Categoria> categorias = categoriaServicio.gestionarCategoria(null, TipoGestion.LISTAR);
                cargarCategoriasEnTabla(categorias);

            } catch (SQLException ex) {
                Logger.getLogger(CategoriaVista.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jButtonBorrarCategoriaActionPerformed

    private void jTablePresentaCategoriasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTablePresentaCategoriasFocusLost

    }//GEN-LAST:event_jTablePresentaCategoriasFocusLost

    /**
     * Método indepediente que pertenece a la venta categoria vista
     * @param args 
     */
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
            java.util.logging.Logger.getLogger(CategoriaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategoriaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategoriaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategoriaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CategoriaVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBorrarCategoria;
    private javax.swing.JButton jButtonInsertar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelcategoriaModificandose;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePresentaCategorias;
    private javax.swing.JTextField jTextFieldNuevoNombreCategoria;
    // End of variables declaration//GEN-END:variables

    /**
     * Método que obtine la data para  listar la informacion inicial en la tabla
     *
     * @param categorias
     */
    private void cargarCategoriasEnTabla(List<Categoria> categorias) {

        Object[][] data = new Object[(int) categorias.size()][3];
        int contador = 1;
        for (int j = 0; j < categorias.size(); j++) {
            Categoria categoria = categorias.get(j);
            for (int i = 0; i < 3; i++) {
                if (i == 0) {
                    data[j][i] = contador;
                } else if (i == 1) {
                    data[j][i] = categoria.getId();
                } else {
                    data[j][i] = categoria.getNombre();
                }
            }
            contador++;
        }

        DefaultTableModel defaultTableModel = new DefaultTableModel(data, new String[]{"#", "Id Categoria", "Nombre Categoria"}) {
            @Override
            public Class getColumnClass(int column) {
                return getValueAt(0, column).getClass();

            }
        };
        jTablePresentaCategorias.setModel(defaultTableModel);

    }
}
