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
import java.util.HashMap;
import java.util.List;
import pe.edu.upeu.clase04.config.Conexion;
import pe.edu.upeu.clase04.dao.UsuarioDao;
import pe.edu.upeu.clase04.entity.Usuario;

/**
 *
 * @author dreyna
 */
public class UsuarioDaoImpl implements UsuarioDao{
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;

    @Override
    public HashMap<String, Object> validar(String username, String password) {
        HashMap<String, Object> datos = new HashMap<>();
        try {
            String SQL = "select *from usuario where username=? and password=?";
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while(rs.next()){
                datos.put("idusuario", rs.getInt("idusuario"));
                datos.put("username", rs.getString("username"));
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
       return datos;
    }

    @Override
    public int create(Usuario u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Usuario u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean buscar(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
