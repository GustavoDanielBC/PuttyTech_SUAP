
package mx.puttytech.facade;

import java.util.List;
import mx.puttytech.entidad.Profesor;
import mx.puttytech.entidad.Usuario;
import mx.puttytech.delegate.DelegateUsuario;
public class FacadeUsuario {
    private final DelegateUsuario delegateUsuario;
    
    public FacadeUsuario() {
        this.delegateUsuario = new DelegateUsuario();
    }
    
    public void guardarUsuarios(Usuario usuarios){
        delegateUsuario.saveUsuarios(usuarios);
    }
    
     public void guardarUsuariosProfesores(Profesor nuevoProfesor, Usuario nuevoUsuario){
        delegateUsuario.saveUsuarioProfesor(nuevoProfesor, nuevoUsuario);
    }
    
    public void updateUsuarios(Usuario usuarios) {
        delegateUsuario.updateUsuarios(usuarios);
    }

    public void deleteUsuarios(Usuario usuarios) {
        delegateUsuario.deleteUsuarios(usuarios);
    }

    public List<Usuario> findAllUsuarios() {
        return delegateUsuario.findAllUsuarios();
    }

    public Usuario findUsuariosById(Integer id) {
        return delegateUsuario.findUsuarioById(id);
    }
}