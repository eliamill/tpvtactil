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
import modelo.dao.beans.Categoria;
import java.util.List;
import modelo.gestionBd.GestionSql;

/**
 * Clase CategoriaDao Para realizarlas las gestiones con la BD
 *
 * @author Eliamill Brandt
 * @version 1.1
 */
public class CategoriaDao {

    private Connection conn = GestionSql.getConn();

    /**
     * Método Insertar Categoria
     *
     * @param categoria
     * @throws SQLException
     */
    public void insertarCategoria(Categoria categoria) throws SQLException {
        String sql = "insert into Categoria(nombre) values(?)";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, categoria.getNombre());
        int row = pstm.executeUpdate();
    }

    /**
     * Método modificar Categoria
     *
     * @param categoria
     * @throws SQLException
     */
    public void modificarCategoria(Categoria categoria) throws SQLException {

        String sql = "update Categoria set nombre = ? where id = ?";

        PreparedStatement pstm = conn.prepareStatement(sql);

        pstm.setString(1, categoria.getNombre());

        pstm.setInt(2, categoria.getId());

        pstm.executeUpdate();

    }

    /**
     * Método borrar Categoria
     *
     * @param categoria
     * @throws SQLException
     */
    public void borrarCategoria(Categoria categoria) throws SQLException {

        String sql = "delete from Categoria where id = ?";

        PreparedStatement pstm = conn.prepareStatement(sql);

        pstm.setInt(1, categoria.getId());

        pstm.executeUpdate();

    }

    /**
     * Método consultar Categoria
     *
     * @param id
     * @return
     * @throws SQLException
     */
    public Categoria consultarCategoria(int id) throws SQLException {
        String sql = "select * from Categoria where id = ?";

        PreparedStatement pstm = conn.prepareStatement(sql);

        pstm.setInt(1, id);

        ResultSet resultSet = pstm.executeQuery();

        if (resultSet.next()) {
            Categoria retorno = new Categoria();
            retorno.setId(resultSet.getInt("id"));
            retorno.setNombre(resultSet.getString("nombre"));
            return retorno;
        }

        return null;

    }

    /**
     * Método Listar Categoria
     *
     * @return
     * @throws SQLException
     */
    public List<Categoria> consultarCategorias() throws SQLException {
        String sql = "select * from Categoria";

        PreparedStatement pstm = conn.prepareStatement(sql);

        ResultSet resultSet = pstm.executeQuery();

        List<Categoria> retorno = new ArrayList<>();

        while (resultSet.next()) {
            Categoria categoria = new Categoria();
            categoria.setId(resultSet.getInt("id"));
            categoria.setNombre(resultSet.getString("nombre"));
            retorno.add(categoria);
        }

        return retorno;
    }

    /**
     * Método consultar Categoria por nombre
     *
     * @param nombre
     * @return
     * @throws SQLException
     */
    public Categoria getCategoriaByNombre(String nombre) throws SQLException {
        String sql = "select * from Categoria where nombre = ?";

        PreparedStatement pstm = conn.prepareStatement(sql);

        pstm.setString(1, nombre);

        ResultSet resultSet = pstm.executeQuery();

        if (resultSet.next()) {
            Categoria retorno = new Categoria();
            retorno.setId(resultSet.getInt("id"));
            retorno.setNombre(resultSet.getString("nombre"));
            return retorno;
        }

        return null;
    }

}
