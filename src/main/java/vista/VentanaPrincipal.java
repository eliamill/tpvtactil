/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.BotonesAction;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.dao.beans.Producto;
import modelo.dao.beans.Ticket;
import modelo.gestionBd.GestionSql;
import modelo.servicios.ProductoServicio;

/**
 *
 * @author brand
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    //prueba de comentario

    private ProductoServicio productoServicio = new ProductoServicio();

    /**
     * Creates new form ventanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        initComponentsMios();
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
        jLabelEmpresa = new javax.swing.JLabel();
        jLabelNumDeTicket = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jLabelVendedor = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelDniCif = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jTextTotal = new javax.swing.JTextField();
        jBoton7 = new javax.swing.JButton();
        jBoton9 = new javax.swing.JButton();
        jBoton8 = new javax.swing.JButton();
        jBoton4 = new javax.swing.JButton();
        jBoton5 = new javax.swing.JButton();
        jBoton6 = new javax.swing.JButton();
        jBoton1 = new javax.swing.JButton();
        jBoton2 = new javax.swing.JButton();
        jBoton3 = new javax.swing.JButton();
        jBotonDecimal = new javax.swing.JButton();
        jBoton0 = new javax.swing.JButton();
        jBotonC = new javax.swing.JButton();
        jButtonNuevaCompra = new javax.swing.JButton();
        jBotonModicarCompra = new javax.swing.JButton();
        jBotonAcceptarCompra = new javax.swing.JButton();
        jBotonBebidas = new javax.swing.JButton();
        jBotonComidas = new javax.swing.JButton();
        jLabelProductosYCategorias = new javax.swing.JLabel();
        jTextFieldDniCif = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jScrollPaneCategotiasProductos = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPaneParaCompra = new javax.swing.JScrollPane();
        jLabelParaMostrarEmpresa = new javax.swing.JLabel();
        jTextFieldNombredelVendedor = new javax.swing.JTextField();
        jLabelIdCliente = new javax.swing.JLabel();
        jTextFieldIdCliente = new javax.swing.JTextField();
        jMenuBarraMenus = new javax.swing.JMenuBar();
        jMenuCliente = new javax.swing.JMenu();
        jMenuGestionCliente = new javax.swing.JMenu();
        jMenuCategoria = new javax.swing.JMenu();
        jMenuGestionCategoria = new javax.swing.JMenu();
        jMenuProducto = new javax.swing.JMenu();
        jMenuGestionProducto = new javax.swing.JMenu();
        jMenuTicket = new javax.swing.JMenu();
        jMenuGestionTicket = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelEmpresa.setText("Empresa");

        jLabelNumDeTicket.setText("Nº de ticket ");

        jLabelFecha.setText("Fecha");

        jLabelHora.setText("Hora");

        jLabelVendedor.setText("Vendedor");

        jLabelNombre.setText("Nombre/Empresa");
        jLabelNombre.setMaximumSize(new java.awt.Dimension(5, 5));

        jLabelDniCif.setText("DNI/CIF");
        jLabelDniCif.setMaximumSize(new java.awt.Dimension(5, 5));

        jLabelTotal.setText("Total");

        jTextTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTotalActionPerformed(evt);
            }
        });

        jBoton7.setText("7");
        jBoton7.setActionCommand("boton7");
        jBoton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBoton7ActionPerformed(evt);
            }
        });

        jBoton9.setText("9");

        jBoton8.setText("8");

        jBoton4.setText("4");

        jBoton5.setText("5");

        jBoton6.setText("6");

        jBoton1.setText("1");

        jBoton2.setText("2");

        jBoton3.setText("3");

        jBotonDecimal.setText(".");

        jBoton0.setText("0");

        jBotonC.setText("c");

        jButtonNuevaCompra.setText("Nueva Compra");

        jBotonModicarCompra.setText("Modificar");

        jBotonAcceptarCompra.setText("Aceptar compra");

        jBotonBebidas.setText("Bebidas");
        jBotonBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonBebidasActionPerformed(evt);
            }
        });

        jBotonComidas.setText("Comidas");
        jBotonComidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonComidasActionPerformed(evt);
            }
        });

        jLabelProductosYCategorias.setText("Productos y Categorias");

        jTextFieldDniCif.setText("jTextField4");
        jTextFieldDniCif.setMaximumSize(new java.awt.Dimension(5, 5));
        jTextFieldDniCif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDniCifActionPerformed(evt);
            }
        });

        jTextFieldNombre.setText("jTextField5");
        jTextFieldNombre.setMaximumSize(new java.awt.Dimension(5, 5));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPaneCategotiasProductos.setViewportView(jTable2);

        jLabelParaMostrarEmpresa.setText("Se muestra empresa");

        jTextFieldNombredelVendedor.setText("jTextField1");

        jLabelIdCliente.setText("Id.Cliente");
        jLabelIdCliente.setMaximumSize(new java.awt.Dimension(5, 5));

        jTextFieldIdCliente.setText("jTextField3");
        jTextFieldIdCliente.setMaximumSize(new java.awt.Dimension(5, 5));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBotonAcceptarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNuevaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBotonModicarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelProductosYCategorias)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBotonBebidas)
                        .addGap(18, 18, 18)
                        .addComponent(jBotonComidas)))
                .addGap(244, 244, 244))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBoton7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)
                                        .addComponent(jBoton8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBoton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)
                                        .addComponent(jBoton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBotonDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)
                                        .addComponent(jBoton0, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBoton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)
                                        .addComponent(jBoton5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBoton9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBoton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBotonC, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBoton6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jTextTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPaneCategotiasProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPaneParaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabelEmpresa)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelParaMostrarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelNumDeTicket)
                                .addGap(114, 114, 114)
                                .addComponent(jLabelFecha)
                                .addGap(105, 105, 105)
                                .addComponent(jLabelHora)
                                .addGap(33, 33, 33))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabelDniCif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldDniCif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(150, 150, 150))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabelVendedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                                .addComponent(jTextFieldNombredelVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelParaMostrarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNombredelVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelNumDeTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDniCif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDniCif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneParaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBoton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBoton8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBoton9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBoton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBoton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBoton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBoton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBoton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBoton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPaneCategotiasProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBotonDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBoton0, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBotonC, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonNuevaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBotonModicarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBotonAcceptarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelProductosYCategorias)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBotonBebidas)
                            .addComponent(jBotonComidas))
                        .addContainerGap())))
        );

        jMenuCliente.setText("Cliente");
        jMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuClienteActionPerformed(evt);
            }
        });

        jMenuGestionCliente.setText("Gestion Cliente");
        jMenuGestionCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuGestionClienteMouseClicked(evt);
            }
        });
        jMenuCliente.add(jMenuGestionCliente);

        jMenuBarraMenus.add(jMenuCliente);

        jMenuCategoria.setText("Categoria");

        jMenuGestionCategoria.setText("Gestion Categoria");
        jMenuGestionCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuGestionCategoriaMouseClicked(evt);
            }
        });
        jMenuCategoria.add(jMenuGestionCategoria);

        jMenuBarraMenus.add(jMenuCategoria);

        jMenuProducto.setText("Producto");

        jMenuGestionProducto.setText("Gestion Producto");
        jMenuGestionProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuGestionProductoMouseClicked(evt);
            }
        });
        jMenuProducto.add(jMenuGestionProducto);

        jMenuBarraMenus.add(jMenuProducto);

        jMenuTicket.setText("Ticket");

        jMenuGestionTicket.setText("Gestion Ticket");
        jMenuGestionTicket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuGestionTicketMouseClicked(evt);
            }
        });
        jMenuTicket.add(jMenuGestionTicket);

        jMenuBarraMenus.add(jMenuTicket);

        setJMenuBar(jMenuBarraMenus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBoton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoton7ActionPerformed
        new BotonesAction().realizarAccion(evt.getActionCommand());
        jTextTotal.setText("7");
    }//GEN-LAST:event_jBoton7ActionPerformed

    private void jTextFieldDniCifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDniCifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDniCifActionPerformed

    private void jTextTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTotalActionPerformed

    private void jMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuClienteActionPerformed

    }//GEN-LAST:event_jMenuClienteActionPerformed

    private void jMenuGestionClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuGestionClienteMouseClicked
        ClientesVista clientes = new ClientesVista();
        clientes.setVisible(true);
    }//GEN-LAST:event_jMenuGestionClienteMouseClicked

    private void jBotonBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonBebidasActionPerformed
       try {
            List<Producto> productos = productoServicio.getProductoByCategoria(2);
            double numFilas = Math.ceil(productos.size() / 3.0);
            Object[][] data = new Object[(int) numFilas][3];
            int contador = 0;

            for (int j = 0; j < numFilas; j++) {
                for (int i = 0; i < 3; i++) {
                    if (contador < productos.size()) {
                        data[j][i] = createImage("imagenes/" + productos.get(contador).getImagen());
                    }else{
                        data[j][i] = "";
                    }
                    contador++;
                }
            }
            DefaultTableModel defaultTableModel = new DefaultTableModel(data, new String[]{"", "", ""}){
              @Override
              public Class getColumnClass(int column){
                  return getValueAt(0, column).getClass();
              }  
            };
            jTable2.setRowHeight(200);
            jTable2.setModel(defaultTableModel);

        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBotonBebidasActionPerformed

    private void jMenuGestionCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuGestionCategoriaMouseClicked
     CategoriaVista categoria = new CategoriaVista();
        categoria.setVisible(true);
    }//GEN-LAST:event_jMenuGestionCategoriaMouseClicked

    private void jMenuGestionProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuGestionProductoMouseClicked
       ProductoVista producto= new ProductoVista();
       producto.setVisible(true);
    }//GEN-LAST:event_jMenuGestionProductoMouseClicked

    private void jMenuGestionTicketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuGestionTicketMouseClicked
       TicketVista ticket = new TicketVista();
       ticket.setVisible (true);
    }//GEN-LAST:event_jMenuGestionTicketMouseClicked

    private void jBotonComidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonComidasActionPerformed
      
                                                 

    }//GEN-LAST:event_jBotonComidasActionPerformed

    public ImageIcon createImage(String path) {
        URL imgUrl = this.getClass().getClassLoader().getResource(path);
        if (imgUrl != null) {
            return new ImageIcon(imgUrl);
        } else {
            System.err.println("No podemos encontar la imagen " + path);
            return null;
        }
    }

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        GestionSql gestionSql = new GestionSql();
        gestionSql.openConnection();
        System.out.println("Empresa " + args[0]);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBoton0;
    private javax.swing.JButton jBoton1;
    private javax.swing.JButton jBoton2;
    private javax.swing.JButton jBoton3;
    private javax.swing.JButton jBoton4;
    private javax.swing.JButton jBoton5;
    private javax.swing.JButton jBoton6;
    private javax.swing.JButton jBoton7;
    private javax.swing.JButton jBoton8;
    private javax.swing.JButton jBoton9;
    private javax.swing.JButton jBotonAcceptarCompra;
    private javax.swing.JButton jBotonBebidas;
    private javax.swing.JButton jBotonC;
    private javax.swing.JButton jBotonComidas;
    private javax.swing.JButton jBotonDecimal;
    private javax.swing.JButton jBotonModicarCompra;
    private javax.swing.JButton jButtonNuevaCompra;
    private javax.swing.JLabel jLabelDniCif;
    private javax.swing.JLabel jLabelEmpresa;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelIdCliente;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNumDeTicket;
    private javax.swing.JLabel jLabelParaMostrarEmpresa;
    private javax.swing.JLabel jLabelProductosYCategorias;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JLabel jLabelVendedor;
    private javax.swing.JMenuBar jMenuBarraMenus;
    private javax.swing.JMenu jMenuCategoria;
    private javax.swing.JMenu jMenuCliente;
    private javax.swing.JMenu jMenuGestionCategoria;
    private javax.swing.JMenu jMenuGestionCliente;
    private javax.swing.JMenu jMenuGestionProducto;
    private javax.swing.JMenu jMenuGestionTicket;
    private javax.swing.JMenu jMenuProducto;
    private javax.swing.JMenu jMenuTicket;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPaneCategotiasProductos;
    private javax.swing.JScrollPane jScrollPaneParaCompra;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextFieldDniCif;
    private javax.swing.JTextField jTextFieldIdCliente;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldNombredelVendedor;
    private javax.swing.JTextField jTextTotal;
    // End of variables declaration//GEN-END:variables

    private void initComponentsMios() {
        JTable tabla = new JTable();
        tabla.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String[]{
                    "", "", "", ""
                }
        ));
        jScrollPaneParaCompra.add(tabla);
    }

}