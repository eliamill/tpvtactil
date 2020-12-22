/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao.beans;

/**
 * Clase Cliente
 * @author Eliamill Brandt
 * @version 1.1
 */
public class Cliente {

    private int id;
    private String nombre;
    private String dnicif;

    /**
     * Método get de Dni/Cif
     *
     * @return
     */
    public String getDnicif() {
        return dnicif;
    }

    /**
     * Método set de Dni/Cif
     *
     * @param dnicif
     */
    public void setDnicif(String dnicif) {
        this.dnicif = dnicif;
    }

    /**
     * Método get de Id
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * Método set de id
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Método get de nombre
     *
     * @return
     */
    public String getNombre() {

        return nombre;
    }

    /**
     * Método set de Nombre
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
