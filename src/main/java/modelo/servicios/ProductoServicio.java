/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.servicios;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.dao.ProductoDao;
import modelo.dao.beans.Producto;
import modelo.dao.beans.enums.TipoGestion;

/**
 * Clase ProductoServicio Para gestionar servicios
 *
 * @author Eliamill Brandt
 * @version 1.1
 */
public class ProductoServicio {

    private ProductoDao productoDao = new ProductoDao();

    /**
     * Método gestionar Producto
     *
     * @param producto
     * @param tipoGestion
     * @return
     * @throws SQLException
     */
    public List<Producto> gestionarProducto(Producto producto, TipoGestion tipoGestion) throws SQLException {
        List<Producto> productos = new ArrayList<>();
        switch (tipoGestion) {
            case INSERTAR:
                productoDao.insertarProducto(producto);
                break;
            case MODIFICAR:
                productoDao.modificarProducto(producto);
                break;
            case BORRAR:
                productoDao.borrarProducto(producto);
            case CONSULTAR:
                Producto productoTmp = productoDao.consultarProducto(producto.getId());
                if (productoTmp != null) {
                    productos.add(producto);
                }
                break;
            case LISTAR:
                productos = productoDao.consultarProductos();
        }
        return productos;
    }

    /**
     * Método obtener producto por categoria
     *
     * @param idCategoria
     * @return
     * @throws SQLException
     */
    public List<Producto> getProductoByCategoria(int idCategoria) throws SQLException {
        return productoDao.consultarProductoByCategoria(idCategoria);
    }

    /**
     * Método obtener prodcuto por nombre
     *
     * @param nombre
     * @return
     * @throws SQLException
     */
    public Producto getProductoByNombre(String nombre) throws SQLException {
        return productoDao.getProductoByNombre(nombre);
    }

    /**
     * Método obtenet producto por imagen
     *
     * @param nombreImagen
     * @return
     * @throws SQLException
     */
    public Producto getProductoByImagen(String nombreImagen) throws SQLException {
        return productoDao.getProductoByImagen(nombreImagen);
    }

}
