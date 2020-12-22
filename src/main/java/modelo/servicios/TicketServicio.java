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
 * Clase TicketServicio Para gestionar servicios
 *
 * @author Eliamill Brandt
 * @version 1.1
 */
public class TicketServicio {

    private TicketDao ticketDao = new TicketDao();

    /**
     * Método getionar ticket
     *
     * @param ticket
     * @param tipoGestion
     * @return
     * @throws SQLException
     */
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

    /**
     * Método que obtiene el ultimo ticket
     *
     * @return
     * @throws SQLException
     */
    public Ticket getUltimoTicket() throws SQLException {
        return ticketDao.getUltimoTicket();
    }

    /**
     * Método que inserta producto en ticket
     *
     * @param ticket
     * @param producto
     * @param cantidad
     * @throws SQLException
     */
    public void insertarProducto(Ticket ticket, Producto producto, int cantidad) throws SQLException {
        ticketDao.insertarProducto(producto.getId(), ticket.getId(), cantidad);
    }
}
