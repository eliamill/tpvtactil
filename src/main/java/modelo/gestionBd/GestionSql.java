/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.gestionBd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase GestionSql Para conectarse con la BD
 *
 * @author Eliamill Brandt
 * @version 1.1
 */
public class GestionSql {

    private String url = "jdbc:mysql://localhost/tpvtactil?serverTimezone=Europe/Madrid";
    private String user = "fastfood";
    private String password = "123456";

    private static Connection conn;

    /**
     * Método de obtener Conexión
     *
     * @return
     */
    public static Connection getConn() {
        return conn;
    }

    /**
     * Método para abrir la conexión
     */
    public void openConnection() {
        if (conn == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url, user, password);
                System.out.println("Conexion realizada");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * Método para cerrar la conexión
     *
     * @throws SQLException
     */
    public void closeConnection() throws SQLException {
        conn.close();
    }

    /**
     * Método ejecutar sql
     *
     * @param nombreProcedimientoAlmacenado
     */
    public void executeSql(String nombreProcedimientoAlmacenado) {

    }
}
