
package mx.puttytech.integracion;

import mx.puttytech.DAO.AsignacionDAO;
import mx.puttytech.DAO.ProfesorDAO;
import mx.puttytech.DAO.UnidadAprendizajeDAO;
import mx.puttytech.DAO.UsuarioDAO;

public class ServiceLocator {
    
    private static  ProfesorDAO profesorDAO;
    private static UsuarioDAO usuarioDAO;
    private static UnidadAprendizajeDAO unidadaprendizajeDAO;
    private static AsignacionDAO asignacionDAO;
    /**
     * se crea la instancia para alumno DAO si esta no existe
     */
    public static ProfesorDAO getInstanceProfesorDAO(){
        if(profesorDAO == null){
            profesorDAO = new ProfesorDAO();
            return profesorDAO;
        } else{
            return profesorDAO;
        }
    }
    /**
     * se crea la instancia de usuarioDAO si esta no existe
     */
    public static UsuarioDAO getInstanceUsuarioDAO(){
        if(usuarioDAO == null){
            usuarioDAO = new UsuarioDAO();
            return usuarioDAO;
        } else{
            return usuarioDAO;
        }
    }
    
      public static UnidadAprendizajeDAO getInstanceUnidadAprendizajeDAO(){
        if(unidadaprendizajeDAO == null){
            unidadaprendizajeDAO = new UnidadAprendizajeDAO();
            return unidadaprendizajeDAO;
        } else{
            return unidadaprendizajeDAO;
        }
    }
      
      public static AsignacionDAO getInstanceAsignacionDAO(){
           if(asignacionDAO == null){
            asignacionDAO = new AsignacionDAO();
            return asignacionDAO;
        } else{
            return asignacionDAO;
        }
      }
    
}
