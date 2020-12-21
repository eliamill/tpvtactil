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
import modelo.dao.beans.Cliente;
import modelo.dao.beans.enums.TipoGestion;
import modelo.gestionBd.GestionSql;
import modelo.servicios.ClienteServicio;

/**
 *
 * @author brand
 */
public class ClientesVista extends javax.swing.JFrame {

    private ClienteServicio clienteServicio;
    private int row = -1;

    /**
     * Creates new form Clientes
     */
    public ClientesVista() {
        initComponents();

        try {
            GestionSql gestionSql = new GestionSql();
            gestionSql.openConnection();
            clienteServicio = new ClienteServicio();
            List<Cliente> clientes = clienteServicio.gestionarCliente(null, TipoGestion.LISTAR);
            cargarClientesEnTabla(clientes);
        } catch (SQLException ex) {
            Logger.getLogger(ClientesVista.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelSeleccioneCliente = new javax.swing.JLabel();
        jTextFieldNombreCliente = new javax.swing.JTextField();
        jLabelNombreCliente = new javax.swing.JLabel();
        jLabelDni = new javax.swing.JLabel();
        jTextFieldDni = new javax.swing.JTextField();
        jButtonModificarCliente = new javax.swing.JButton();
        jBorrarCliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePresentaClientes = new javax.swing.JTable();

        setTitle("Gestion Clientes");

        jLabelSeleccioneCliente.setText("Seleccione Cliente");

        jTextFieldNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreClienteActionPerformed(evt);
            }
        });

        jLabelNombreCliente.setText("Nombre/Empresa");

        jLabelDni.setText("DNI");

        jTextFieldDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDniActionPerformed(evt);
            }
        });

        jButtonModificarCliente.setText("Modificar");
        jButtonModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarClienteActionPerformed(evt);
            }
        });

        jBorrarCliente.setText("Borrar");
        jBorrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBorrarClienteActionPerformed(evt);
            }
        });

        jTablePresentaClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablePresentaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePresentaClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTablePresentaClientes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNombreCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelDni)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 588, Short.MAX_VALUE)
                .addComponent(jButtonModificarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBorrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSeleccioneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelSeleccioneCliente)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonModificarCliente)
                    .addComponent(jBorrarCliente)
                    .addComponent(jTextFieldNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombreCliente)
                    .addComponent(jLabelDni)
                    .addComponent(jTextFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(248, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDniActionPerformed

    private void jButtonModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarClienteActionPerformed
        if (row != -1 && jTextFieldNombreCliente.getText() != null && jTextFieldNombreCliente.getText().length() > 0) {
            try {
                String nombre = (String) jTablePresentaClientes.getModel().getValueAt(row, 1);
                Cliente cliente = clienteServicio.getClienteByNombre(nombre);
                cliente.setNombre(jTextFieldNombreCliente.getText());
                clienteServicio.gestionarCliente(cliente, TipoGestion.MODIFICAR);
                List<Cliente> clientes = clienteServicio.gestionarCliente(null, TipoGestion.LISTAR);
                cargarClientesEnTabla(clientes);
            } catch (SQLException ex) {
                Logger.getLogger(ClientesVista.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jButtonModificarClienteActionPerformed

    private void jBorrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBorrarClienteActionPerformed
        if (row != -1 && jTextFieldNombreCliente.getText() != null && jTextFieldNombreCliente.getText().length() > 0) {
            try {
                String nombre = (String) jTablePresentaClientes.getModel().getValueAt(row, 1);
                Cliente cliente = clienteServicio.getClienteByNombre(nombre);
                cliente.setNombre(jTextFieldNombreCliente.getText());
                clienteServicio.gestionarCliente(cliente, TipoGestion.BORRAR);
                List<Cliente> clientes = clienteServicio.gestionarCliente(null, TipoGestion.BORRAR);
                cargarClientesEnTabla(clientes);
            } catch (SQLException ex) {
                Logger.getLogger(ClientesVista.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jBorrarClienteActionPerformed

    private void jTablePresentaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePresentaClientesMouseClicked
        JTable source = (JTable) evt.getSource();
        row = source.rowAtPoint(evt.getPoint());
        String nombre = (String)  jTablePresentaClientes.getModel().getValueAt(row, 1);
        jTextFieldNombreCliente.setText(nombre);
    }//GEN-LAST:event_jTablePresentaClientesMouseClicked

    private void jTextFieldNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreClienteActionPerformed

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(ClientesVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientesVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientesVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientesVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientesVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBorrarCliente;
    private javax.swing.JButton jButtonModificarCliente;
    private javax.swing.JLabel jLabelDni;
    private javax.swing.JLabel jLabelNombreCliente;
    private javax.swing.JLabel jLabelSeleccioneCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePresentaClientes;
    private javax.swing.JTextField jTextFieldDni;
    private javax.swing.JTextField jTextFieldNombreCliente;
    // End of variables declaration//GEN-END:variables

    private void cargarClientesEnTabla(List<Cliente> clientes) {

      
        Object[][] data = new Object[(int) clientes.size()][2];

        for (int j = 0; j < clientes.size(); j++) {
            Cliente cliente = clientes.get(j);
            for (int i = 0; i < 2; i++) {
                if (i == 0) {
                    data[j][i] = cliente.getId();
                } else {
                    data[j][i] = cliente.getNombre();
                }
            }
        }

        DefaultTableModel defaultTableModel = new DefaultTableModel(data, new String[]{"Id", "Nombre"}) {
            @Override
            public Class getColumnClass(int column) {
                return getValueAt(0, column).getClass();
            
            }
        };
        jTablePresentaClientes.setModel(defaultTableModel);
    }
}
