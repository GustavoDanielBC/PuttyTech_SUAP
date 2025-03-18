
package mx.puttytech.facade;

import java.util.List;
import mx.puttytech.delegate.DelegateProfesor;
import mx.puttytech.entidad.Profesor;

public class FacadeProfesor {
    private final DelegateProfesor delegateProfesor;
    
    public FacadeProfesor() {
        this.delegateProfesor = new DelegateProfesor();
    }
    
    public void guardarProfesores(Profesor profesores){
        delegateProfesor.saveProfesor(profesores);
    }
    
    public void updateProfesores(Profesor profesores) {
        delegateProfesor.updateProfesor(profesores);
    }

    public void deleteProfesor(Profesor profesores) {
        delegateProfesor.deleteProfesor(profesores);
    }

    public List<Profesor> findAllProfesores() {
        return delegateProfesor.findAllProfesor();
    }

    public Profesor findProfesoresById(Integer id) {
        return delegateProfesor.findProfesorById(id);
    }
    
    public List <Profesor> consultarProfesor(Profesor profesores){
        return delegateProfesor.ConsultarProfesor(profesores);
    }
}