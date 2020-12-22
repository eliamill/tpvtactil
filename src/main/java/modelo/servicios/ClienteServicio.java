/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.servicios;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.dao.ClienteDao;
import modelo.dao.beans.Cliente;
import modelo.dao.beans.enums.TipoGestion;

/**
 * Clase ClienteServicio Para gestionar servicios
 *
 * @author Eliamill Brandt
 * @version 1.1
 */
public class ClienteServicio {

    private ClienteDao clienteDao = new ClienteDao();

    /**
     * Método Gestionar Cliente
     *
     * @param cliente
     * @param tipoGestion
     * @return
     * @throws SQLException
     */
    public List<Cliente> gestionarCliente(Cliente cliente, TipoGestion tipoGestion) throws SQLException {
        List<Cliente> clientes = new ArrayList<>();
        switch (tipoGestion) {
            case INSERTAR:
                clienteDao.insertarCliente(cliente);
                break;
            case MODIFICAR:
                clienteDao.modificarCliente(cliente);
                break;
            case BORRAR:
                clienteDao.borrarCliente(cliente);
            case CONSULTAR:
                Cliente clienteTmp = clienteDao.consultarCliente(cliente.getId());
                if (clienteTmp != null) {
                    clientes.add(cliente);
                }
                break;
            case LISTAR:
                clientes = clienteDao.consultarClientes();
        }
        return clientes;
    }

    /**
     * Método obtener cliente por nombre
     *
     * @param nombre
     * @return
     * @throws SQLException
     */
    public Cliente getClienteByNombre(String nombre) throws SQLException {
        return clienteDao.getCategoriaByNombre(nombre);
    }
}
