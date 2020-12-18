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
 *
 * @author brand
 */
public class GestionSql {

    private String url ="jdbc:mysql://www.ired.es/eliaTPV?serverTimezone=Europe/Madrid";
    private String user = "elia";
    private String password = "Xjv6k74&";
    
    private static Connection conn;

    public static Connection getConn() {
        return conn;
    }

    public void openConnection() {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,password);   
            System.out.println("Conexion realizada");
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }

    public void closeConnection() throws SQLException{
        conn.close();
    }
    
    public void executeSql(String nombreProcedimientoAlmacenado){
        
    }
}
