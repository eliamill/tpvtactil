/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao.beans;

/**
 * Clase Ticket
 *
 * @author Eliamill Brandt
 * @version 1.1
 */
public class Ticket {

    private int id;
    private int idCliente;
    private double total;

    /**
     * Método de Cadena de Texto
     *
     * @return
     */
    @Override
    public String toString() {
        return "ticket con id " + id + " con cliente " + idCliente + " con total " + total;
    }

    /**
     * Método get Id
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * Método set Id
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Método get de Id
     *
     * @return
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Método set de Id
     *
     * @param idCliente
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * Método get de Total
     *
     * @return
     */
    public double getTotal() {
        return total;
    }

    /**
     * Método set de Total
     *
     * @param total
     */
    public void setTotal(double total) {
        this.total = total;
    }

}
