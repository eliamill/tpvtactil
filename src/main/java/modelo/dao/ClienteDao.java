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
import modelo.dao.beans.Cliente;
import modelo.gestionBd.GestionSql;

/**
 * Clase ClienteDao Para realizarlas las gestiones con la BD
 *
 * @author Eliamill Brandt
 * @version 1.1
 */
public class ClienteDao {

    private Connection conn = GestionSql.getConn();

    /**
     * Método Insertar Cliente
     *
     * @param cliente
     * @throws SQLException
     */
    public void insertarCliente(Cliente cliente) throws SQLException {
        String sql = "insert into Cliente(nombre,dnicif) values(?,?)";

        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, cliente.getNombre());
        pstm.setString(2, cliente.getDnicif());
        int row = pstm.executeUpdate();
    }

    /**
     * Método Modificar Cliente
     *
     * @param cliente
     * @throws SQLException
     */
    public void modificarCliente(Cliente cliente) throws SQLException {

        String sql = "update Cliente set nombre = ?,dnicif=? where id = ?";

        PreparedStatement pstm = conn.prepareStatement(sql);

        pstm.setString(1, cliente.getNombre());
        pstm.setString(2, cliente.getDnicif());
        pstm.setInt(3, cliente.getId());

        pstm.executeUpdate();

    }

    /**
     * Método Borrar Cliente
     *
     * @param cliente
     * @throws SQLException
     */
    public void borrarCliente(Cliente cliente) throws SQLException {

        String sql = "delete from Cliente where id = ?";

        PreparedStatement pstm = conn.prepareStatement(sql);

        pstm.setInt(1, cliente.getId());

        pstm.executeUpdate();

    }

    /**
     * Método Consultar Cliente
     *
     * @param id
     * @return
     * @throws SQLException
     */
    public Cliente consultarCliente(int id) throws SQLException {
        String sql = "select * from Cliente where id = ?";

        PreparedStatement pstm = conn.prepareStatement(sql);

        pstm.setInt(1, id);

        ResultSet resultSet = pstm.executeQuery();

        if (resultSet.next()) {
            Cliente retorno = new Cliente();
            retorno.setId(resultSet.getInt("id"));
            retorno.setNombre(resultSet.getString("nombre"));
            return retorno;
        }

        return null;

    }

    /**
     * Método Listar Cliente
     *
     * @return
     * @throws SQLException
     */
    public List<Cliente> consultarClientes() throws SQLException {
        String sql = "select * from cliente";

        PreparedStatement pstm = conn.prepareStatement(sql);

        ResultSet resultSet = pstm.executeQuery();

        List<Cliente> retorno = new ArrayList<>();

        while (resultSet.next()) {
            Cliente cliente = new Cliente();
            cliente.setId(resultSet.getInt("id"));
            cliente.setNombre(resultSet.getString("nombre"));
            cliente.setDnicif(resultSet.getString("dnicif"));
            retorno.add(cliente);
        }

        return retorno;

    }

    /**
     * Método Consultar cliente por nombre
     *
     * @param nombre
     * @return
     * @throws SQLException
     */
    public Cliente getCategoriaByNombre(String nombre) throws SQLException {
        String sql = "select * from Cliente where nombre = ?";

        PreparedStatement pstm = conn.prepareStatement(sql);

        pstm.setString(1, nombre);

        ResultSet resultSet = pstm.executeQuery();

        if (resultSet.next()) {
            Cliente retorno = new Cliente();
            retorno.setId(resultSet.getInt("id"));
            retorno.setNombre(resultSet.getString("nombre"));
            retorno.setDnicif(resultSet.getString("dnicif"));
            return retorno;
        }

        return null;
    }
}
