/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.dao.beans.Ticket;
import modelo.gestionBd.GestionSql;

/**
 * Clase TicketDao Para realizarlas las gestiones con la BD
 *
 * @author Eliamill Brandt
 * @version 1.1
 */
public class TicketDao {

    private Connection conn = GestionSql.getConn();

    /**
     * Método para insertar Ticket
     *
     * @param ticket
     * @throws SQLException
     */
    public void insertarTicket(Ticket ticket) throws SQLException {
        String sql = "insert into ticket(idCliente,total) values(?,?)";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, ticket.getIdCliente());
        pstm.setDouble(2, ticket.getTotal());
        int row = pstm.executeUpdate();
    }

    /**
     * Método para modificar Ticket
     *
     * @param ticket
     * @throws SQLException
     */
    public void modificarTicket(Ticket ticket) throws SQLException {

        String sql = "update ticket set idCliente = ?, total =? where id = ?";

        PreparedStatement pstm = conn.prepareStatement(sql);

        pstm.setInt(1, ticket.getIdCliente());
        pstm.setDouble(2, ticket.getTotal());
        pstm.setInt(3, ticket.getId());

        pstm.executeUpdate();

    }

    /**
     * Método para Borrar Ticket
     *
     * @param ticket
     * @throws SQLException
     */
    public void borrarTicket(Ticket ticket) throws SQLException {

        String sql = "delete from ticket where id = ?";

        PreparedStatement pstm = conn.prepareStatement(sql);

        pstm.setInt(1, ticket.getId());

        pstm.executeUpdate();

    }

    /**
     * Método para Consultar Ticket
     *
     * @param id
     * @return
     * @throws SQLException
     */
    public Ticket consultarTicket(int id) throws SQLException {
        String sql = "select * from Ticket where id = ?";

        PreparedStatement pstm = conn.prepareStatement(sql);

        pstm.setInt(1, id);

        ResultSet resultSet = pstm.executeQuery();

        if (resultSet.next()) {
            Ticket retorno = new Ticket();
            retorno.setId(resultSet.getInt("id"));
            retorno.setIdCliente(resultSet.getInt("idCliente"));
            return retorno;
        }

        return null;

    }

    /**
     * Método Consultar Ticket
     *
     * @return
     * @throws SQLException
     */
    public List<Ticket> consultarTickets() throws SQLException {
        String sql = "select * from ticket";

        PreparedStatement pstm = conn.prepareStatement(sql);

        ResultSet resultSet = pstm.executeQuery();

        List<Ticket> retorno = new ArrayList<>();

        while (resultSet.next()) {
            Ticket ticket = new Ticket();
            ticket.setId(resultSet.getInt("id"));
            ticket.setIdCliente(resultSet.getInt("idCliente"));
            ticket.setTotal(resultSet.getDouble("total"));
            retorno.add(ticket);
        }

        return retorno;

    }

    /**
     * Método Listar Ticket
     *
     * @param idCliente
     * @return
     * @throws SQLException
     */
    public List<Ticket> consultarTicketsDeCliente(int idCliente) throws SQLException {
        String sql = "select * from ticket where idCliente = ?";

        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, idCliente);

        ResultSet resultSet = pstm.executeQuery();

        List<Ticket> retorno = new ArrayList<>();

        while (resultSet.next()) {
            Ticket ticket = new Ticket();
            ticket.setId(resultSet.getInt("id"));
            ticket.setIdCliente(resultSet.getInt("idCliente"));
            ticket.setTotal(resultSet.getDouble("total"));
            retorno.add(ticket);
        }

        return retorno;

    }

    /**
     * Método que asocia el producto comprado cn el ticket
     *
     * @param idProducto
     * @param idTicket
     * @param cantidad
     * @throws SQLException
     */
    public void insertarProducto(int idProducto, int idTicket, int cantidad) throws SQLException {
        String sql = "insert into producto_ticket (idProducto,idTicket,cantidad)values(?,?,?)";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, idProducto);
        pstm.setInt(2, idTicket);
        pstm.setInt(3, cantidad);

        pstm.executeUpdate();

    }

    /**
     * Método que obtiene el ultimo ticket
     *
     * @return
     * @throws SQLException
     */
    public Ticket getUltimoTicket() throws SQLException {
        String sql = "select * from ticket order by id desc limit 1";
        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet resultSet = pstm.executeQuery();

        if (resultSet.next()) {
            Ticket retorno = new Ticket();
            retorno.setId(resultSet.getInt("id"));
            retorno.setIdCliente(resultSet.getInt("idCliente"));
            return retorno;
        }

        return null;
    }

}
