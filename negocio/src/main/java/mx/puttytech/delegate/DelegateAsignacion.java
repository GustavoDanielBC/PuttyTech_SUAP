
package mx.puttytech.delegate;


import java.util.List;
import mx.puttytech.integracion.ServiceLocator;
import mx.puttytech.entidad.Asignacion;

public class DelegateAsignacion {
    public void saveAsignacion(Asignacion profesores){
        ServiceLocator.getInstanceAsignacionDAO().save(profesores);
    }
    
    public void updateAsignacion(Asignacion profesor) {
        ServiceLocator.getInstanceAsignacionDAO().update(profesor);
    }

    public void deleteAsignacion(Asignacion profesor) {
        ServiceLocator.getInstanceAsignacionDAO().delete(profesor);
    }

    public List<Asignacion> findAllAsignacion() {
        return ServiceLocator.getInstanceAsignacionDAO().findAll();
    }

    public Asignacion findById(Integer id) {
        return ServiceLocator.getInstanceAsignacionDAO().find(id);
    }
}    
