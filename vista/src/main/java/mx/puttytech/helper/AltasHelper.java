
package mx.puttytech.helper;

import java.io.IOException;
import java.io.Serializable; 
import javax.faces.context.FacesContext;
import mx.puttytech.entidad.Profesor;
import mx.puttytech.entidad.Usuario;
import mx.puttytech.integracion.ServiceFacadeLocator;


public class AltasHelper {
    
    /**
     * Metodo para hacer login llamara a la instancia de usuarioFacade
     * @param nuevoProfesor
     * @param numProfesor
     * @param nombre
     * @param apellido
     * @param RFC
     *  
     */
    public void Alta(Profesor nuevoProfesor, Usuario nuevoUsuario){
        ServiceFacadeLocator.getInstanceFacadeUusuario().guardarUsuariosProfesores(nuevoProfesor, nuevoUsuario);
        
    }
    
    public Profesor buscar(Integer idABuscar){
        return ServiceFacadeLocator.getInstanceFacadeProfesor().findProfesoresById(idABuscar);
    }
    
}
