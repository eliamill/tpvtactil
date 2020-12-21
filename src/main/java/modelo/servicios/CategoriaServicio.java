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
 *
 * @author brand
 */
public class CategoriaServicio {

    private CategoriaDao categoriaDao = new CategoriaDao();

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

    public List<Categoria> getCategorias() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Categoria getCategoriaByNombre(String nombre) throws SQLException {
        return categoriaDao.getCategoriaByNombre(nombre);
    }

}
