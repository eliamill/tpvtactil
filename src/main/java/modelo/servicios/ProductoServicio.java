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
 *
 * @author brand
 */
public class ProductoServicio {
   private ProductoDao productoDao = new ProductoDao();

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
    
    public List<Producto> getProductoByCategoria(int idCategoria) throws SQLException{
        return productoDao.consultarProductoByCategoria(idCategoria);
    }
}
