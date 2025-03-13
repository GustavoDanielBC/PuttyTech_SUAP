
package mx.puttytech.helper;

import java.io.Serializable;
import java.util.List; 
import mx.puttytech.entidad.Asignacion;
import mx.puttytech.integracion.ServiceFacadeLocator;


public class AsignacionHelper implements Serializable {
    
       public void deleteProfesor(Asignacion asignacion) {
        ServiceFacadeLocator.getInstanceFacadeHorarios().deleteHorario(asignacion);
    }
    
    public List<Asignacion> getlistProfesores() {
        return ServiceFacadeLocator.getInstanceFacadeHorarios().findAllHorario();
    }
    
    public void updateProfesor(Asignacion asignacion){
        ServiceFacadeLocator.getInstanceFacadeHorarios().updateHorario(asignacion);
    }
    
}


