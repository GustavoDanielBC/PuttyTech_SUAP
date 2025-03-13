
package mx.puttytech.facade;


import java.util.List;
import mx.puttytech.entidad.UnidadAprendizaje;
import mx.puttytech.delegate.DelegateUnidadAprendizaje;

/**
 *
 * @author issac
 */
public class FacadeUnidadAprendizaje {
    
    private final DelegateUnidadAprendizaje delegateUnidadaprendizaje;
    
    public FacadeUnidadAprendizaje() {
        this.delegateUnidadaprendizaje = new DelegateUnidadAprendizaje();
    }
    
    public void guardarUnidaddeaprendizaje(UnidadAprendizaje unidaddeaprendizajes){
        delegateUnidadaprendizaje.saveUnidadAprendizaje(unidaddeaprendizajes);
    }
    
    public void updateUnidadDeAprendizaje(UnidadAprendizaje unidad) {
        delegateUnidadaprendizaje.updateUnidadAprendizaje(unidad);
    }

    public void deleteUnidadDeAprendizaje(UnidadAprendizaje unidad) {
        delegateUnidadaprendizaje.deleteUnidadAprendizaje(unidad);
    }

    public List<UnidadAprendizaje> findAllUnidadesDeAprendizaje() {
        return delegateUnidadaprendizaje.findAllUnidadAprendizaje();
    }

    public UnidadAprendizaje findUnidadDeAprendizajeById(Integer id) {
        return delegateUnidadaprendizaje.findUnidadAprendizajeById(id);
    }   
}