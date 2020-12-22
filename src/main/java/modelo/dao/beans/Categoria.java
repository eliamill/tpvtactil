/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao.beans;

/**
 * Clase Categoria
 *
 * @author Eliamill Brandt
 * @version 1.1
 */
public class Categoria {

    private int id;
    private String nombre;
    private String imagen;

    /**
     * Método get que toma imagen
     *
     * @return
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * Método set que muestra imagen
     *
     * @param imagen
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    /**
     * Método get de id
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
     * Método set de nombre
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método cadena de texto
     *
     * @return
     */
    @Override
    public String toString() {
        return "Id " + id + " nombre " + nombre;
    }

}
