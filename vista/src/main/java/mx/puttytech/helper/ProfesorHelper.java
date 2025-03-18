
package mx.puttytech.helper;

import java.io.Serializable;
import java.util.List;
import mx.puttytech.entidad.Profesor;
import mx.puttytech.integracion.ServiceFacadeLocator;


public class ProfesorHelper implements Serializable {
    
    public void deleteProfesor(Profesor profesor) {
        ServiceFacadeLocator.getInstanceFacadeProfesor().deleteProfesor(profesor);
    }
    
    public List<Profesor> getlistProfesores() {
        return ServiceFacadeLocator.getInstanceFacadeProfesor().findAllProfesores();
    }
    
    public void updateProfesor(Profesor profesor){
        ServiceFacadeLocator.getInstanceFacadeProfesor().updateProfesores(profesor);
    }
    
    public void consultarProfesores(Profesor profesor){
        ServiceFacadeLocator.getInstanceFacadeProfesor().consultarProfesor(profesor);
    }
    
}
