/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao.beans;

/**
 * Clase Producto
 * 
 * @author Eliamill Brandt
 * @version 1.1
 */
public class Producto {

    private int id;
    private String nombre;
    private String imagen;
    private int idCategoria;
    private double precio;

    /**
     * Método get de precio
     *
     * @return
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Método set de precio
     *
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Método get de Id de Categoria
     *
     * @return
     */
    public int getIdCategoria() {
        return idCategoria;
    }

    /**
     * Método set de Id de Categoria
     *
     * @param idCategoria
     */
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    /**
     * Método get de Imagen
     *
     * @return
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * Método set de Imagen
     *
     * @param imagen
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
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
     * Método get Nombre
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método set Nombre
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
