
package mx.puttytech.helper;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.io.IOException;
import java.io.Serializable; 
import javax.faces.context.FacesContext;
import mx.puttytech.entidad.UnidadAprendizaje;
import mx.puttytech.integracion.ServiceFacadeLocator;


public class UnidadAprendizajeHelper implements Serializable {
    
     public void darDeAltaUDA(UnidadAprendizaje nuevaUDA) throws MySQLIntegrityConstraintViolationException {
        ServiceFacadeLocator.getInstanceFacadeUnidadAprendizaje().guardarUnidaddeaprendizaje(nuevaUDA);
    }
    
    public UnidadAprendizaje encontrarUDARepetida (Integer id) {
        return ServiceFacadeLocator.getInstanceFacadeUnidadAprendizaje().findUnidadDeAprendizajeById(id);
    }
    
}
