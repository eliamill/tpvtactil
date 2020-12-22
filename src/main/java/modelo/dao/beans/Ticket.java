/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao.beans;

/**
 *
 * @author brand
 */
public class Ticket {

    private int id;
    private int idCliente;
    private double total;

    //@Override
   /* public String toString() {
        return "ticket con id " + id + " con cliente " + idCliente + " con total " + total;
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    

}
