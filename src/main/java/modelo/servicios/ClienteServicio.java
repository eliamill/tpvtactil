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
 *
 * @author brand
 */
public class ClienteServicio {
   private ClienteDao clienteDao = new ClienteDao();

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
}
