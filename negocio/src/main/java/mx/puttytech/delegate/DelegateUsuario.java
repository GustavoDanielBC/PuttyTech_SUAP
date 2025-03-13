
package mx.puttytech.delegate;

import java.util.List;
import mx.puttytech.entidad.Profesor;
import mx.puttytech.entidad.Usuario;
import mx.puttytech.integracion.ServiceLocator;

public class DelegateUsuario {
    public void saveUsuarios(Usuario profesores){
        ServiceLocator.getInstanceUsuarioDAO().save(profesores);
    }
    public void saveUsuarioProfesor(Profesor nuevoProfesor, Usuario nuevoUsuario){
        ServiceLocator.getInstanceUsuarioDAO().registrarProfesor(nuevoProfesor, nuevoUsuario);
    }
    public void updateUsuarios(Usuario profesor) {
        ServiceLocator.getInstanceUsuarioDAO().update(profesor);
    }

    public void deleteUsuarios(Usuario profesor) {
        ServiceLocator.getInstanceUsuarioDAO().delete(profesor);
    }

    public List<Usuario> findAllUsuarios() {
        return ServiceLocator.getInstanceUsuarioDAO().findAll();
    }

    public Usuario findUsuarioById(Integer id) {
        return ServiceLocator.getInstanceUsuarioDAO().find(id);
    }
}    