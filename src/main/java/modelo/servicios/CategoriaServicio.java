/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.servicios;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.dao.CategoriaDao;
import modelo.dao.beans.Categoria;
import modelo.dao.beans.enums.TipoGestion;

/**
 * Clase CategoriaServicio Para getionar servicios 
 *
 * @author Eliamill Brandt
 * @version 1.1
 */
public class CategoriaServicio {

    private CategoriaDao categoriaDao = new CategoriaDao();

    /**
     * Método gestionar categoria
     *
     * @param categoria
     * @param tipoGestion
     * @return
     * @throws SQLException
     */
    public List<Categoria> gestionarCategoria(Categoria categoria, TipoGestion tipoGestion) throws SQLException {
        List<Categoria> categorias = new ArrayList<>();
        switch (tipoGestion) {
            case INSERTAR:
                categoriaDao.insertarCategoria(categoria);
                break;
            case MODIFICAR:
                categoriaDao.modificarCategoria(categoria);
                break;
            case BORRAR:
                categoriaDao.borrarCategoria(categoria);
                break;
            case CONSULTAR:
                Categoria categoriaTmp = categoriaDao.consultarCategoria(categoria.getId());
                if (categoriaTmp != null) {
                    categorias.add(categoriaTmp);
                }
                break;
            case LISTAR:
                categorias = categoriaDao.consultarCategorias();
        }
        return categorias;
    }

    /**
     * Método obtener categotia por nombre
     *
     * @param nombre
     * @return
     * @throws SQLException
     */
    public Categoria getCategoriaByNombre(String nombre) throws SQLException {
        return categoriaDao.getCategoriaByNombre(nombre);
    }

}
