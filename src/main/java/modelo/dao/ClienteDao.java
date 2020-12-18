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
 *
 * @author brand
 */
public class ClienteDao {

    private Connection conn = GestionSql.getConn();

    public void insertarCliente(Cliente cliente) throws SQLException {
        String sql = "insert into Cliente(nombre) values(?)";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, cliente.getNombre());
        int row = pstm.executeUpdate();
    }

    public void modificarCliente(Cliente cliente) throws SQLException {

        String sql = "update Cliente set nombre = ? where id = ?";

        PreparedStatement pstm = conn.prepareStatement(sql);

        pstm.setString(1, cliente.getNombre());

        pstm.setInt(2, cliente.getId());

        pstm.executeUpdate();

    }

    public void borrarCliente(Cliente cliente) throws SQLException {

        String sql = "delete from Cliente where id = ?";

        PreparedStatement pstm = conn.prepareStatement(sql);

        pstm.setInt(1, cliente.getId());

        pstm.executeUpdate();

    }

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

    public List<Cliente> consultarClientes() throws SQLException {
        String sql = "select * from Cliente";

        PreparedStatement pstm = conn.prepareStatement(sql);

        ResultSet resultSet = pstm.executeQuery();

        List<Cliente> retorno = new ArrayList<>();

        while (resultSet.next()) {
            Cliente cliente = new Cliente();
            cliente.setId(resultSet.getInt("id"));
            cliente.setNombre(resultSet.getString("nombre"));
            retorno.add(cliente);
        }

        return retorno;

    }
}
