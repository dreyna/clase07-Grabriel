/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.clase04.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pe.edu.upeu.clase04.config.Conexion;
import pe.edu.upeu.clase04.dao.UsuarioDao;

/**
 *
 * @author dreyna
 */
public class UsuarioDaoImpl implements UsuarioDao{
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;

    @Override
    public int validar(String username, String password) {
        int x = 0;
        try {
            String SQL = "select *from usuario where username=? and password=?";
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while(rs.next()){
                x = 1;
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
       return x;
    }
    
}
