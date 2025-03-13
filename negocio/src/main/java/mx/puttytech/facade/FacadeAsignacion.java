
package mx.puttytech.facade;

import java.util.List;
import mx.puttytech.entidad.Asignacion;
import mx.puttytech.delegate.DelegateAsignacion;
/**
 *
 * @author Johan
 */
public class FacadeAsignacion {
    private final DelegateAsignacion delegateasignacion;
    
    public FacadeAsignacion() {
        this.delegateasignacion = new DelegateAsignacion();
    }
    
    public void guardarHorario(Asignacion horario){
        delegateasignacion.saveAsignacion(horario);
    }
    
    public void updateHorario(Asignacion horario) {
        delegateasignacion.updateAsignacion(horario);
    }

    public void deleteHorario(Asignacion horario) {
        delegateasignacion.deleteAsignacion(horario);
    }

    public List<Asignacion> findAllHorario() {
        return delegateasignacion.findAllAsignacion();
    }

    public Asignacion findHorarioById(Integer id) {
        return delegateasignacion.findById(id);
    }
}