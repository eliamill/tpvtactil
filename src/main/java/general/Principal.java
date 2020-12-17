/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.dao.CategoriaDao;
import modelo.dao.ClienteDao;
import modelo.dao.TicketDao;
import modelo.dao.beans.Categoria;
import modelo.dao.beans.Cliente;
import modelo.dao.beans.Ticket;
import modelo.dao.beans.enums.TipoGestion;
import modelo.gestionBd.GestionSql;
import modelo.servicios.TicketServicio;

/**
 *
 * @author brand
 */
public class Principal {

    public static void main(String[] args) {
        GestionSql gestionSql = new GestionSql();
        gestionSql.openConnection();

        /*CategoriaDao categoriaDao = new CategoriaDao();
        try {
            List<Categoria> categorias = categoriaDao.consultarCategorias();
            for (Categoria categoria : categorias) {
                System.out.println(categoria);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        ClienteDao clienteDao = new ClienteDao();
        Cliente cliente = new Cliente();
        cliente.setNombre("Roman");
        try {
            clienteDao.insertarCliente(cliente);
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        TicketDao ticketDao = new TicketDao();
        Ticket ticket = new Ticket();
        ticket.setIdCliente(2);
        ticket.setTotal(50.5);
//        try {
//            ticketDao.insertarTicket(ticket);
//        } catch (SQLException ex) {
//            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        try {
//            List<Ticket> tickets = ticketDao.consultarTicketsDeCliente(2);
//            for (Ticket ticket : tickets) {
//                System.out.println(ticket);
//            }
//            ticketDao.insertarProducto(2, 1, 3);
//        } catch (SQLException ex) {
//            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
//        }

        TicketServicio ticketServicio = new TicketServicio();

        try {
            ticketServicio.gestionarTicket(ticket, TipoGestion.INSERTAR);

        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
