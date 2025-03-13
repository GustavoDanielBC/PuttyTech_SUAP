
package mx.puttytech.ui;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import mx.puttytech.entidad.Profesor;
import mx.puttytech.helper.ProfesorHelper;
/**
 *
 * @author Usuario X
 */


public class ProfesorBeanUI {
    private final ProfesorHelper helper;
    private List<Profesor> profesores;
    private Profesor profesorSeleccionado; // Atributo para el profesor seleccionado
    
    public ProfesorBeanUI() {
        helper = new ProfesorHelper();
        this.profesores = helper.getlistProfesores();
    }
    
    public List<Profesor> getProfesores() {
        return profesores;
    }
    
    public void setProfesorSeleccionado(Profesor profesorSeleccionado) {
        this.profesorSeleccionado = profesorSeleccionado;
    }
    
     public void modificarProfesorDesdeFormulario() {
        if (profesorSeleccionado != null) {
            helper.updateProfesor(profesorSeleccionado); 
            this.profesores = helper.getlistProfesores();
        }
    }

     public void eliminarProfesor() {
        if (profesorSeleccionado != null) {
            helper.deleteProfesor(profesorSeleccionado);
            this.profesores = helper.getlistProfesores();
        }
     }
      
}
