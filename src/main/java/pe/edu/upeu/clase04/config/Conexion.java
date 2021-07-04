/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.clase04.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dreyna
 */
public class Conexion {
    private static final String URL ="jdbc:postgresql://ec2-3-231-69-204.compute-1.amazonaws.com:5432/d6h70ue959gj7j?sslmode=require";
    private static final String USER ="nnuvbbzsmrpums";
    private static final String PASS ="e12c47366e95a3c8581cdb4d547685663a5bd717761e703967e8db240db94525";
    private static final String DRIVER ="org.postgresql.Driver";
    private static Connection cx = null;
    
    public static Connection getConexion(){
        try {
            Class.forName(DRIVER);
            if(cx==null){
                try {
                    cx = DriverManager.getConnection(URL, USER, PASS);
                } catch (SQLException ex) {
                    Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Error: "+e);
        }
    return cx;
    }
}
