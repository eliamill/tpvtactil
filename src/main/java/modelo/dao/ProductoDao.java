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
import modelo.dao.beans.Producto;
import modelo.gestionBd.GestionSql;

/**
 *
 * @author brand
 */
public class ProductoDao {

    private Connection conn = GestionSql.getConn();

    public void insertarProducto(Producto producto) throws SQLException {
        String sql = "insert into Producto(idCategoria,nombre,imagen) values(?,?,?)";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, producto.getIdCategoria());
        pstm.setString(2, producto.getNombre());
        pstm.setString(3, producto.getImagen());

        int row = pstm.executeUpdate();
    }

    public void modificarProducto(Producto producto) throws SQLException {

        String sql = "update Producto set idCategoria = ?,nombre = ?,imagen=? where id = ?";

        PreparedStatement pstm = conn.prepareStatement(sql);

        pstm.setInt(1, producto.getIdCategoria());
        pstm.setString(2, producto.getNombre());
        pstm.setString(3, producto.getImagen());

        pstm.setInt(4, producto.getId());

        pstm.executeUpdate();

    }

    public void borrarProducto(Producto producto) throws SQLException {

        String sql = "delete from Producto where id = ?";

        PreparedStatement pstm = conn.prepareStatement(sql);

        pstm.setInt(1, producto.getId());

        pstm.executeUpdate();

    }

    public Producto consultarProducto(int id) throws SQLException {
        String sql = "select * from Producto where id = ?";

        PreparedStatement pstm = conn.prepareStatement(sql);

        pstm.setInt(1, id);

        ResultSet resultSet = pstm.executeQuery();

        if (resultSet.next()) {
            Producto retorno = new Producto();
            retorno.setId(resultSet.getInt("id"));
            retorno.setIdCategoria(resultSet.getInt("idCategoria"));
            retorno.setNombre(resultSet.getString("nombre"));
            retorno.setImagen(resultSet.getString("imagen"));
            retorno.setPrecio(resultSet.getDouble("precio"));
            return retorno;
        }

        return null;

    }

    public List<Producto> consultarProductos() throws SQLException {
        String sql = "select * from Producto";

        PreparedStatement pstm = conn.prepareStatement(sql);

        ResultSet resultSet = pstm.executeQuery();

        List<Producto> retorno = new ArrayList<>();

        while (resultSet.next()) {
            Producto producto = new Producto();
            producto.setId(resultSet.getInt("id"));
            producto.setNombre(resultSet.getString("nombre"));
            producto.setIdCategoria(resultSet.getInt("idCategoria"));
            producto.setImagen(resultSet.getString("imagen"));
            producto.setPrecio(resultSet.getDouble("precio"));
            retorno.add(producto);
        }

        return retorno;

    }

    public List<Producto> consultarProductoByCategoria(int idCategoria) throws SQLException {
        String sql = "select * from Producto where idCategoria = ?";

        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, idCategoria);

        ResultSet resultSet = pstm.executeQuery();

        List<Producto> retorno = new ArrayList<>();

        while (resultSet.next()) {
            Producto producto = new Producto();
            producto.setId(resultSet.getInt("id"));
            producto.setNombre(resultSet.getString("nombre"));
            producto.setIdCategoria(resultSet.getInt("idCategoria"));
            producto.setImagen(resultSet.getString("imagen"));
            producto.setPrecio(resultSet.getDouble("precio"));
            retorno.add(producto);
        }

        return retorno;
    }

    public Producto getProductoByNombre(String nombre) throws SQLException {
        String sql = "select * from Producto where nombre = ?";

        PreparedStatement pstm = conn.prepareStatement(sql);

        pstm.setString(1, nombre);

        ResultSet resultSet = pstm.executeQuery();

        if (resultSet.next()) {
            Producto retorno = new Producto();
            retorno.setId(resultSet.getInt("id"));
            retorno.setNombre(resultSet.getString("nombre"));
            retorno.setImagen(resultSet.getString("imagen"));
            retorno.setIdCategoria(resultSet.getInt("idCategoria"));
            retorno.setPrecio(resultSet.getDouble("precio"));
            return retorno;

        }
        return null;
    }

    public Producto getProductoByImagen(String nombreImagen) throws SQLException {
        String sql = "select * from Producto where imagen = ?";

        PreparedStatement pstm = conn.prepareStatement(sql);

        pstm.setString(1, nombreImagen);

        ResultSet resultSet = pstm.executeQuery();

        if (resultSet.next()) {
            Producto retorno = new Producto();
            retorno.setId(resultSet.getInt("id"));
            retorno.setNombre(resultSet.getString("nombre"));
            retorno.setImagen(resultSet.getString("imagen"));
            retorno.setIdCategoria(resultSet.getInt("idCategoria"));
            retorno.setPrecio(resultSet.getDouble("precio"));
            return retorno;

        }
        return null;
    }

}
