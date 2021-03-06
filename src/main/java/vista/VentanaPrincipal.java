/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import modelo.dao.beans.Cliente;
import modelo.dao.beans.Producto;
import modelo.dao.beans.Ticket;
import modelo.dao.beans.enums.TipoGestion;
import modelo.gestionBd.GestionSql;
import modelo.servicios.ClienteServicio;
import modelo.servicios.ProductoServicio;
import modelo.servicios.TicketServicio;

/**
 * Clase VentanaPrincipal
 *
 * @author Eliamill Brandt
 * @version 1.1
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    //prueba de comentario
    private ProductoServicio productoServicio = new ProductoServicio();
    private TicketServicio ticketServicio = new TicketServicio();
    private ClienteServicio clienteServicio = new ClienteServicio();

    /**
     * Constructor
     */
    public VentanaPrincipal() {
        initComponents();
    }

    /**
     * Variables por defecto
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabelEmpresa = new javax.swing.JLabel();
        jLabelVendedor = new javax.swing.JLabel();
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
        jBoton0 = new javax.swing.JButton();
        jBotonC = new javax.swing.JButton();
        jButtonNuevaCompra = new javax.swing.JButton();
        jBotonAcceptarCompra = new javax.swing.JButton();
        jBotonBebidas = new javax.swing.JButton();
        jBotonComidas = new javax.swing.JButton();
        jLabelProductosYCategorias = new javax.swing.JLabel();
        jScrollPaneCategotiasProductos = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabelParaMostrarEmpresa = new javax.swing.JLabel();
        jTextFieldNombredelVendedor = new javax.swing.JTextField();
        jLabelIdCliente = new javax.swing.JLabel();
        jTextFieldIdCliente = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableTickets = new javax.swing.JTable();
        jLabelDescuento = new javax.swing.JLabel();
        jTextDescuento = new javax.swing.JTextField();
        jMenuBarraMenus = new javax.swing.JMenuBar();
        jMenuCliente = new javax.swing.JMenu();
        jMenuGestionCliente = new javax.swing.JMenu();
        jMenuCategoria = new javax.swing.JMenu();
        jMenuGestionCategoria = new javax.swing.JMenu();
        jMenuProducto = new javax.swing.JMenu();
        jMenuGestionProducto = new javax.swing.JMenu();
        jMenuTicket = new javax.swing.JMenu();
        jMenuGestionTicket = new javax.swing.JMenu();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelEmpresa.setText("Empresa");

        jLabelVendedor.setText("Vendedor");

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
        jBoton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBoton9ActionPerformed(evt);
            }
        });

        jBoton8.setText("8");
        jBoton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBoton8ActionPerformed(evt);
            }
        });

        jBoton4.setText("4");
        jBoton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBoton4ActionPerformed(evt);
            }
        });

        jBoton5.setText("5");
        jBoton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBoton5ActionPerformed(evt);
            }
        });

        jBoton6.setText("6");
        jBoton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBoton6ActionPerformed(evt);
            }
        });

        jBoton1.setText("1");
        jBoton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBoton1ActionPerformed(evt);
            }
        });

        jBoton2.setText("2");
        jBoton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBoton2ActionPerformed(evt);
            }
        });

        jBoton3.setText("3");
        jBoton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBoton3ActionPerformed(evt);
            }
        });

        jBoton0.setText("0");
        jBoton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBoton0ActionPerformed(evt);
            }
        });

        jBotonC.setText("c");
        jBotonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonCActionPerformed(evt);
            }
        });

        jButtonNuevaCompra.setText("Nuevo Producto");
        jButtonNuevaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevaCompraActionPerformed(evt);
            }
        });

        jBotonAcceptarCompra.setText("Finalizar ticket");
        jBotonAcceptarCompra.setMaximumSize(new java.awt.Dimension(75, 23));
        jBotonAcceptarCompra.setMinimumSize(new java.awt.Dimension(75, 23));
        jBotonAcceptarCompra.setPreferredSize(new java.awt.Dimension(75, 23));
        jBotonAcceptarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonAcceptarCompraActionPerformed(evt);
            }
        });

        jBotonBebidas.setText("Bebidas");
        jBotonBebidas.setPreferredSize(new java.awt.Dimension(75, 23));
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

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Ninguna categoría seleccionada"}
            },
            new String [] {
                "Productos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPaneCategotiasProductos.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabelIdCliente.setText("Id.Cliente");
        jLabelIdCliente.setMaximumSize(new java.awt.Dimension(5, 5));

        jTextFieldIdCliente.setMaximumSize(new java.awt.Dimension(5, 5));

        jTableTickets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"No hay productos"},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Cuenta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableTickets);

        jLabelDescuento.setText("Descuento");
        jLabelDescuento.setMaximumSize(new java.awt.Dimension(5, 5));

        jTextDescuento.setMaximumSize(new java.awt.Dimension(5, 5));
        jTextDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDescuentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
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
                                .addGap(49, 49, 49)
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
                            .addComponent(jBoton6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jBotonBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBotonComidas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPaneCategotiasProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
                                    .addComponent(jLabelProductosYCategorias)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButtonNuevaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBotonAcceptarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelTotal))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabelDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(8, 8, 8))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabelVendedor)
                                                .addGap(24, 24, 24)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldNombredelVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                    .addComponent(jTextTotal, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelParaMostrarEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelParaMostrarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombredelVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonNuevaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBotonAcceptarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jLabelProductosYCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
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
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBoton0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBotonC, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPaneCategotiasProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotonBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBotonComidas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

        jMenuGestionTicket.setText("Listar Tickets");
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

    
    /**
     * Método que llama al evento al pulsar el boton 7
     * @param evt 
     */
    private void jBoton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoton7ActionPerformed
        TableModel modeloTicket = jTableTickets.getModel();
        int cantidad = (Integer) modeloTicket.getValueAt(modeloTicket.getRowCount() - 1, 0);
        String cantidadS = cantidad + "7";
        modeloTicket.setValueAt(Integer.parseInt(cantidadS), modeloTicket.getRowCount() - 1, 0);
        double precio = (Double) modeloTicket.getValueAt(modeloTicket.getRowCount() - 1, 2);
        double subtotal = Integer.parseInt(cantidadS) * precio;
        subtotal = (double) Math.round(subtotal * 100d) / 100d;
        modeloTicket.setValueAt(subtotal, modeloTicket.getRowCount() - 1, 3);
        calcularTotal();
    }//GEN-LAST:event_jBoton7ActionPerformed

    private void jTextTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTotalActionPerformed

    private void jMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuClienteActionPerformed

    }//GEN-LAST:event_jMenuClienteActionPerformed

    /**
     * Método que llama a la ventana gestion cliente 
     * @param evt 
     */
    private void jMenuGestionClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuGestionClienteMouseClicked
        ClientesVista clientes = new ClientesVista();
        clientes.setVisible(true);
    }//GEN-LAST:event_jMenuGestionClienteMouseClicked

    /**
     * Método que llama al evento al pulsar el boton Bebidas
     * @param evt 
     */
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
                    } else {
                        data[j][i] = "";
                    }
                    contador++;
                }
            }
            DefaultTableModel defaultTableModel = new DefaultTableModel(data, new String[]{"", "", ""}) {
                @Override
                public Class getColumnClass(int column) {
                    return getValueAt(0, column).getClass();
                }
            };
            jTable2.setRowHeight(185);
            jTable2.setModel(defaultTableModel);

        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBotonBebidasActionPerformed

    /**
     * Método que llama a la ventana gestion de categoria 
     * @param evt 
     */
    private void jMenuGestionCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuGestionCategoriaMouseClicked
        CategoriaVista categoria = new CategoriaVista();
        categoria.setVisible(true);
    }//GEN-LAST:event_jMenuGestionCategoriaMouseClicked

    /**
     * Método que llama a la ventana gestion producto
     * @param evt 
     */
    private void jMenuGestionProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuGestionProductoMouseClicked
        ProductoVista producto = new ProductoVista();
        producto.setVisible(true);
    }//GEN-LAST:event_jMenuGestionProductoMouseClicked

    /**
     * Metodo que llama a gestion ticket en esta ventana solo se listara 
     * @param evt 
     */
    private void jMenuGestionTicketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuGestionTicketMouseClicked
        TicketVista ticket = new TicketVista();
        ticket.setVisible(true);
    }//GEN-LAST:event_jMenuGestionTicketMouseClicked

    /**
     * Método que llama al evento al pulsar el boton comidas
     * @param evt 
     */
    private void jBotonComidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonComidasActionPerformed
        try {
            List<Producto> productos = productoServicio.getProductoByCategoria(1);
            double numFilas = Math.ceil(productos.size() / 3.0);
            Object[][] data = new Object[(int) numFilas][3];
            int contador = 0;

            for (int j = 0; j < numFilas; j++) {
                for (int i = 0; i < 3; i++) {
                    if (contador < productos.size()) {
                        data[j][i] = createImage("imagenes/" + productos.get(contador).getImagen());
                    } else {
                        data[j][i] = "";
                    }
                    contador++;
                }
            }
            DefaultTableModel defaultTableModel = new DefaultTableModel(data, new String[]{"", "", ""}) {
                @Override
                public Class getColumnClass(int column) {
                    return getValueAt(0, column).getClass();
                }
            };
            jTable2.setRowHeight(185);
            jTable2.setModel(defaultTableModel);

        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jBotonComidasActionPerformed

    /**
     * Método que llama al evento al pulsar el boton aceptar compra
     * @param evt 
     */
    private void jBotonAcceptarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonAcceptarCompraActionPerformed
        Ticket ticket = new Ticket();
        Cliente cliente = new Cliente();
        if (jTextFieldIdCliente.getText() != null && jTextFieldIdCliente.getText().length() > 0) {
            cliente.setId(Integer.parseInt(jTextFieldIdCliente.getText()));
            List<Cliente> clientes;
            try {
                clientes = clienteServicio.gestionarCliente(cliente, TipoGestion.CONSULTAR);
                TableModel modelo = jTableTickets.getModel();
                if (clientes.size() > 0 && modelo.getColumnCount() == 4) {
                    ticket.setIdCliente(Integer.parseInt(jTextFieldIdCliente.getText()));
                    ticket.setTotal(Double.parseDouble(jTextTotal.getText()));
                    ticketServicio.gestionarTicket(ticket, TipoGestion.INSERTAR);
                    Ticket ultimoTicket = ticketServicio.getUltimoTicket();
                    for (int i = 0; i < modelo.getRowCount(); i++) {
                        String nombreProducto = (String) modelo.getValueAt(i, 1);
                        Producto producto = productoServicio.getProductoByNombre(nombreProducto);
                        int cantidad = (Integer) modelo.getValueAt(i, 0);
                        ticketServicio.insertarProducto(ultimoTicket, producto, cantidad);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jBotonAcceptarCompraActionPerformed

    /**
     * Método que llama al evento al pulsar el boton nueva compra
     * @param evt 
     */
    private void jButtonNuevaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevaCompraActionPerformed
        TableModel modelo = jTableTickets.getModel();
        Object[][] data = new Object[1][4];
        data[0][0] = 0;
        data[0][3] = 0.0;
        if (modelo.getColumnCount() == 4 && ((String) modelo.getValueAt(modelo.getRowCount() - 1, 1)) != null) {
            data = new Object[modelo.getRowCount() + 1][4];
            data[modelo.getRowCount()][0] = 0;
            data[modelo.getRowCount()][3] = 0.0;
            for (int i = 0; i < modelo.getRowCount(); i++) {
                for (int j = 0; j < modelo.getColumnCount(); j++) {
                    data[i][j] = modelo.getValueAt(i, j);
                }
            }
        }
        DefaultTableModel defaultTableModel = new DefaultTableModel(data, new String[]{"Cantidad", "Producto", "Precio", "Subtotal"});
        jTableTickets.setModel(defaultTableModel);


    }//GEN-LAST:event_jButtonNuevaCompraActionPerformed

    /**
     * Método que permite seleccionar la imagen de los productos 
     * @param evt 
     */
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        try {
            JTable source = (JTable) evt.getSource();
            int row = source.rowAtPoint(evt.getPoint());
            int col = source.columnAtPoint(evt.getPoint());
            TableModel modelo = source.getModel();
            ImageIcon imagen = (ImageIcon) modelo.getValueAt(row, col);
            URL urlImagen = new URL(imagen.getDescription());
            String nombreImagen = new File(urlImagen.getFile()).getName();
            Producto producto = null;
            try {
                producto = productoServicio.getProductoByImagen(nombreImagen);
            } catch (SQLException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            TableModel modeloTicket = jTableTickets.getModel();
            modeloTicket.setValueAt(producto.getNombre(), modeloTicket.getRowCount() - 1, 1);
            modeloTicket.setValueAt(producto.getPrecio(), modeloTicket.getRowCount() - 1, 2);
            if ((Integer) modeloTicket.getValueAt(modeloTicket.getRowCount() - 1, 0) == 0) {
                modeloTicket.setValueAt(0, modeloTicket.getRowCount() - 1, 0);
                modeloTicket.setValueAt(0, modeloTicket.getRowCount() - 1, 3);
            } else {
                int cantidad = (Integer) modeloTicket.getValueAt(modeloTicket.getRowCount() - 1, 0);
                double subtotal = cantidad * (Double) modeloTicket.getValueAt(modeloTicket.getRowCount() - 1, 2);
                subtotal = (double) Math.round(subtotal * 100d) / 100d;
                modeloTicket.setValueAt(subtotal, modeloTicket.getRowCount() - 1, 3);
                calcularTotal();
            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTextDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDescuentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDescuentoActionPerformed

    /**
     * Método que llama al evento al pulsar el boton 8
     * @param evt 
     */
    private void jBoton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoton8ActionPerformed
        TableModel modeloTicket = jTableTickets.getModel();
        int cantidad = (Integer) modeloTicket.getValueAt(modeloTicket.getRowCount() - 1, 0);
        String cantidadS = cantidad + "8";
        modeloTicket.setValueAt(Integer.parseInt(cantidadS), modeloTicket.getRowCount() - 1, 0);
        double precio = (Double) modeloTicket.getValueAt(modeloTicket.getRowCount() - 1, 2);
        double subtotal = Integer.parseInt(cantidadS) * precio;
        subtotal = (double) Math.round(subtotal * 100d) / 100d;
        modeloTicket.setValueAt(subtotal, modeloTicket.getRowCount() - 1, 3);
        calcularTotal();
    }//GEN-LAST:event_jBoton8ActionPerformed

    /**
     * Método que llama al evento al pulsar el boton 9
     * @param evt 
     */
    private void jBoton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoton9ActionPerformed
        TableModel modeloTicket = jTableTickets.getModel();
        int cantidad = (Integer) modeloTicket.getValueAt(modeloTicket.getRowCount() - 1, 0);
        String cantidadS = cantidad + "9";
        modeloTicket.setValueAt(Integer.parseInt(cantidadS), modeloTicket.getRowCount() - 1, 0);
        double precio = (Double) modeloTicket.getValueAt(modeloTicket.getRowCount() - 1, 2);
        double subtotal = Integer.parseInt(cantidadS) * precio;
        subtotal = (double) Math.round(subtotal * 100d) / 100d;
        modeloTicket.setValueAt(subtotal, modeloTicket.getRowCount() - 1, 3);
        calcularTotal();
    }//GEN-LAST:event_jBoton9ActionPerformed

    /**
     * Método que llama al evento al pulsar el boton 4
     * @param evt 
     */
    private void jBoton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoton4ActionPerformed
        TableModel modeloTicket = jTableTickets.getModel();
        int cantidad = (Integer) modeloTicket.getValueAt(modeloTicket.getRowCount() - 1, 0);
        String cantidadS = cantidad + "4";
        modeloTicket.setValueAt(Integer.parseInt(cantidadS), modeloTicket.getRowCount() - 1, 0);
        double precio = (Double) modeloTicket.getValueAt(modeloTicket.getRowCount() - 1, 2);
        double subtotal = Integer.parseInt(cantidadS) * precio;
        subtotal = (double) Math.round(subtotal * 100d) / 100d;
        modeloTicket.setValueAt(subtotal, modeloTicket.getRowCount() - 1, 3);
        calcularTotal();
    }//GEN-LAST:event_jBoton4ActionPerformed

    /**
     * Método que llama al evento al pulsar el boton 5
     * @param evt 
     */
    private void jBoton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoton5ActionPerformed
        TableModel modeloTicket = jTableTickets.getModel();
        int cantidad = (Integer) modeloTicket.getValueAt(modeloTicket.getRowCount() - 1, 0);
        String cantidadS = cantidad + "5";
        modeloTicket.setValueAt(Integer.parseInt(cantidadS), modeloTicket.getRowCount() - 1, 0);
        double precio = (Double) modeloTicket.getValueAt(modeloTicket.getRowCount() - 1, 2);
        double subtotal = Integer.parseInt(cantidadS) * precio;
        subtotal = (double) Math.round(subtotal * 100d) / 100d;
        modeloTicket.setValueAt(subtotal, modeloTicket.getRowCount() - 1, 3);
        calcularTotal();
    }//GEN-LAST:event_jBoton5ActionPerformed

    /**
     * Método que llama al evento al pulsar el boton 6
     * @param evt 
     */
    private void jBoton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoton6ActionPerformed
        TableModel modeloTicket = jTableTickets.getModel();
        int cantidad = (Integer) modeloTicket.getValueAt(modeloTicket.getRowCount() - 1, 0);
        String cantidadS = cantidad + "6";
        modeloTicket.setValueAt(Integer.parseInt(cantidadS), modeloTicket.getRowCount() - 1, 0);
        double precio = (Double) modeloTicket.getValueAt(modeloTicket.getRowCount() - 1, 2);
        double subtotal = Integer.parseInt(cantidadS) * precio;
        subtotal = (double) Math.round(subtotal * 100d) / 100d;
        modeloTicket.setValueAt(subtotal, modeloTicket.getRowCount() - 1, 3);
        calcularTotal();
    }//GEN-LAST:event_jBoton6ActionPerformed

    /**
     * Método que llama al evento al pulsar el boton 1
     * @param evt 
     */
    private void jBoton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoton1ActionPerformed
        TableModel modeloTicket = jTableTickets.getModel();
        int cantidad = (Integer) modeloTicket.getValueAt(modeloTicket.getRowCount() - 1, 0);
        String cantidadS = cantidad + "1";
        modeloTicket.setValueAt(Integer.parseInt(cantidadS), modeloTicket.getRowCount() - 1, 0);
        double precio = (Double) modeloTicket.getValueAt(modeloTicket.getRowCount() - 1, 2);
        double subtotal = Integer.parseInt(cantidadS) * precio;
        subtotal = (double) Math.round(subtotal * 100d) / 100d;
        modeloTicket.setValueAt(subtotal, modeloTicket.getRowCount() - 1, 3);
        calcularTotal();
    }//GEN-LAST:event_jBoton1ActionPerformed

    /**
     * Método que llama al evento al pulsar el boton 2
     * @param evt 
     */
    private void jBoton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoton2ActionPerformed
        TableModel modeloTicket = jTableTickets.getModel();
        int cantidad = (Integer) modeloTicket.getValueAt(modeloTicket.getRowCount() - 1, 0);
        String cantidadS = cantidad + "2";
        modeloTicket.setValueAt(Integer.parseInt(cantidadS), modeloTicket.getRowCount() - 1, 0);
        double precio = (Double) modeloTicket.getValueAt(modeloTicket.getRowCount() - 1, 2);
        double subtotal = Integer.parseInt(cantidadS) * precio;
        subtotal = (double) Math.round(subtotal * 100d) / 100d;
        modeloTicket.setValueAt(subtotal, modeloTicket.getRowCount() - 1, 3);
        calcularTotal();
    }//GEN-LAST:event_jBoton2ActionPerformed

    /**
     * 3
     * @param evt 
     */
    private void jBoton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoton3ActionPerformed
        TableModel modeloTicket = jTableTickets.getModel();
        int cantidad = (Integer) modeloTicket.getValueAt(modeloTicket.getRowCount() - 1, 0);
        String cantidadS = cantidad + "3";
        modeloTicket.setValueAt(Integer.parseInt(cantidadS), modeloTicket.getRowCount() - 1, 0);
        double precio = (Double) modeloTicket.getValueAt(modeloTicket.getRowCount() - 1, 2);
        double subtotal = Integer.parseInt(cantidadS) * precio;
        subtotal = (double) Math.round(subtotal * 100d) / 100d;
        modeloTicket.setValueAt(subtotal, modeloTicket.getRowCount() - 1, 3);
        calcularTotal();
    }//GEN-LAST:event_jBoton3ActionPerformed

    /**
     * Método que llama al evento al pulsar el boton 0
     * @param evt 
     */
    private void jBoton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoton0ActionPerformed
        TableModel modeloTicket = jTableTickets.getModel();
        int cantidad = (Integer) modeloTicket.getValueAt(modeloTicket.getRowCount() - 1, 0);
        String cantidadS = cantidad + "0";
        modeloTicket.setValueAt(Integer.parseInt(cantidadS), modeloTicket.getRowCount() - 1, 0);
        double precio = (Double) modeloTicket.getValueAt(modeloTicket.getRowCount() - 1, 2);
        double subtotal = Integer.parseInt(cantidadS) * precio;
        subtotal = (double) Math.round(subtotal * 100d) / 100d;
        modeloTicket.setValueAt(subtotal, modeloTicket.getRowCount() - 1, 3);
        calcularTotal();
    }//GEN-LAST:event_jBoton0ActionPerformed

    /**
     * Método que llama al evento al pulsar el boton c 
     * @param evt 
     */
    private void jBotonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonCActionPerformed
      TableModel modeloTicket = jTableTickets.getModel();
        int cantidad = (Integer) modeloTicket.getValueAt(modeloTicket.getRowCount() - 1, 0);
        String cantidadS = "0";
        modeloTicket.setValueAt(Integer.parseInt(cantidadS), modeloTicket.getRowCount() - 1, 0);
        double precio = (Double) modeloTicket.getValueAt(modeloTicket.getRowCount() - 1, 2);
        double subtotal = Integer.parseInt(cantidadS) * precio;
        subtotal = (double) Math.round(subtotal * 100d) / 100d;
        modeloTicket.setValueAt(subtotal, modeloTicket.getRowCount() - 1, 3);
        calcularTotal();
    }//GEN-LAST:event_jBotonCActionPerformed

    /**
     * Método para obtener imagen 
     * @param path
     * @return 
     */
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
     * Método principal del proyecto 
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
                ventanaPrincipal.jLabelParaMostrarEmpresa.setText(args[0]);
                ventanaPrincipal.setVisible(true);
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
    private javax.swing.JButton jButtonNuevaCompra;
    private javax.swing.JLabel jLabelDescuento;
    private javax.swing.JLabel jLabelEmpresa;
    private javax.swing.JLabel jLabelIdCliente;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPaneCategotiasProductos;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTableTickets;
    private javax.swing.JTextField jTextDescuento;
    private javax.swing.JTextField jTextFieldIdCliente;
    private javax.swing.JTextField jTextFieldNombredelVendedor;
    private javax.swing.JTextField jTextTotal;
    // End of variables declaration//GEN-END:variables

    /**
     * Método para calcular total
     */
    private void calcularTotal() {
        TableModel modeloTicket = jTableTickets.getModel();
        double total = 0.0;
        for (int i = 0; i < modeloTicket.getRowCount(); i++) {
            double subtotal = (Double) modeloTicket.getValueAt(i, 3);
            total += subtotal;
        }
        if (jTextDescuento != null && jTextDescuento.getText().length() > 0) {
            try {
                int descuento = Integer.parseInt(jTextDescuento.getText());
                total -= total * descuento / 100;
            } catch (Exception e) {
                System.out.println("Formato descuento erroneo");
            }
        }
        jTextTotal.setText(total + "");
    }

}
