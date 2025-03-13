
package mx.puttytech.ui;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import mx.puttytech.entidad.UnidadAprendizaje;
import mx.puttytech.helper.UnidadHelper;

public class UnidadBeanUI {
     private final UnidadHelper helper;
    private List<UnidadAprendizaje> unidades;
    private UnidadAprendizaje unidaddeaprendizajeSeleccionado;
    
    public UnidadBeanUI() {
        helper = new UnidadHelper();
        this.unidades = helper.getlistUnidades();
    }
    
     public List<UnidadAprendizaje> getUnidades() {
        return unidades;
    }
    
    public void setProfesorSeleccionado(UnidadAprendizaje unidaddeaprendizajeSeleccionado) {
        this.unidaddeaprendizajeSeleccionado = unidaddeaprendizajeSeleccionado;
    } 
}
