
package mx.puttytech.helper;

import java.io.Serializable;
import mx.puttytech.entidad.Profesor;
import mx.puttytech.entidad.Usuario;
import mx.puttytech.integracion.ServiceFacadeLocator;

public class UsuarioAltaHelper implements Serializable {
    
    public void AltaUsuario(Usuario nuevoUsuario){
        ServiceFacadeLocator.getInstanceFacadeUusuario().guardarUsuarios(nuevoUsuario);
    }
    
    
}
