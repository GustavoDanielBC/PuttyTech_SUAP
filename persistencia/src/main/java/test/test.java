/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.List;
import mx.puttytech.DAO.UsuarioDAO;
import mx.puttytech.entidad.Usuario;

/**
 *
 * @author lukki
 */
public class test {
    public static void main(String[] args) {
        List<Usuario> listaUsuarios = new ArrayList();
        UsuarioDAO usuarioDao = new UsuarioDAO();
        listaUsuarios = usuarioDao.findAll();
        
        for(Usuario us : listaUsuarios){
            System.out.println("Numero de Profesor: " + us.getNumProfesor());
        }
    }
}    