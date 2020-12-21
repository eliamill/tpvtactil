/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.servicios;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.dao.TicketDao;
import modelo.dao.beans.Producto;
import modelo.dao.beans.Ticket;
import modelo.dao.beans.enums.TipoGestion;

/**
 *
 * @author brand
 */
public class TicketServicio {

    private TicketDao ticketDao = new TicketDao();

    public List<Ticket> gestionarTicket(Ticket ticket, TipoGestion tipoGestion) throws SQLException {
        List<Ticket> tickets = new ArrayList<>();
        switch (tipoGestion) {
            case INSERTAR:
                ticketDao.insertarTicket(ticket);
                break;
            case MODIFICAR:
                ticketDao.modificarTicket(ticket);
                break;
            case BORRAR:
                ticketDao.borrarTicket(ticket);
            case CONSULTAR:
                Ticket ticketTmp = ticketDao.consultarTicket(ticket.getId());
                if (ticketTmp != null) {
                    tickets.add(ticket);
                }
                break;
            case LISTAR:
                tickets = ticketDao.consultarTickets();
        }
        return tickets;
    }

    public Ticket getUltimoTicket() throws SQLException {
        return ticketDao.getUltimoTicket();
    }

    public void insertarProducto(Ticket ticket, Producto producto, int cantidad) throws SQLException {
        ticketDao.insertarProducto(producto.getId(), ticket.getId(), cantidad);
    }
}
