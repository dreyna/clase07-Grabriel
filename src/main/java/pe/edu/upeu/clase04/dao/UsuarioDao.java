/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.clase04.dao;

import java.util.HashMap;
import java.util.List;
import pe.edu.upeu.clase04.entity.Usuario;

/**
 *
 * @author dreyna
 */
public interface UsuarioDao {
    HashMap<String, Object> validar(String username, String password);//x
   int create(Usuario u);
   int update(Usuario u);
   int delete(int id);
   boolean buscar(String username);
   Usuario read(int id);
   List<Usuario> readAll();
}
