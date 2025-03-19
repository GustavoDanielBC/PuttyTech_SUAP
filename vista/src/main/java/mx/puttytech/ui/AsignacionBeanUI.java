package mx.puttytech.ui;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import mx.puttytech.entidad.Profesor;
import mx.puttytech.entidad.UnidadAprendizaje;
import mx.puttytech.entidad.Asignacion;
import mx.puttytech.integracion.ServiceFacadeLocator;

@ManagedBean(name = "asignacionBeanUI")
@ViewScoped
public class AsignacionBeanUI implements Serializable {
    
    private Profesor profesorSeleccionado;
    private UnidadAprendizaje unidadSeleccionada;
    private List<Asignacion> asignaciones;
    private Profesor profesorParaAsignar;
    private UnidadAprendizaje unidadParaAsignar;
    
    // Método para asignar una unidad de aprendizaje a un profesor
    public void asignarUnidadAProfesor() {
        try {
            Asignacion nuevaAsignacion = new Asignacion();
            nuevaAsignacion.setNumProfesor(profesorSeleccionado);
            nuevaAsignacion.setClaveUnidadAprendizaje(unidadSeleccionada);
            
            // Se guarda la asignación utilizando la fachada o delegate
            ServiceFacadeLocator.getInstanceFacadeHorarios().guardarHorario(nuevaAsignacion);
            
            // Actualizar la lista de asignaciones usando la consulta SQL definida en el DAO
            asignaciones = ServiceFacadeLocator.getInstanceFacadeHorarios().findAllHorario();
            
            FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Asignación exitosa", "¡Unidad asignada correctamente!"));
        } catch(Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "No se pudo asignar la unidad."));
            e.printStackTrace();
        }
    }
    
    // Getters and setters
    public Profesor getProfesorSeleccionado() {
        return profesorSeleccionado;
    }

    public void setProfesorSeleccionado(Profesor profesorSeleccionado) {
        this.profesorSeleccionado = profesorSeleccionado;
    }

    public UnidadAprendizaje getUnidadSeleccionada() {
        return unidadSeleccionada;
    }

    public void setUnidadSeleccionada(UnidadAprendizaje unidadSeleccionada) {
        this.unidadSeleccionada = unidadSeleccionada;
    }

    public List<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(List<Asignacion> asignaciones) {
        this.asignaciones = asignaciones;
    }
}