
package mx.puttytech.helper;

import java.io.Serializable;
import java.util.List;
import mx.puttytech.entidad.UnidadAprendizaje;
import mx.puttytech.integracion.ServiceFacadeLocator;

public class UnidadHelper implements Serializable {
    
   public List<UnidadAprendizaje> getlistUnidades() {
        return ServiceFacadeLocator.getInstanceFacadeUnidadAprendizaje().findAllUnidadesDeAprendizaje();
    } 
}
