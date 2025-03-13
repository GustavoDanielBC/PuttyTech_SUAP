
package mx.puttytech.delegate;

import java.util.List;
import mx.puttytech.entidad.Profesor;
import mx.puttytech.integracion.ServiceLocator;


public class DelegateProfesor {
    
  public void saveProfesor(Profesor profesores){
        ServiceLocator.getInstanceProfesorDAO().save(profesores);
    }
    
    public void updateProfesor(Profesor profesor) {
        ServiceLocator.getInstanceProfesorDAO().update(profesor);
    }

    public void deleteProfesor(Profesor profesor) {
        ServiceLocator.getInstanceProfesorDAO().delete(profesor);
    }

    public List<Profesor> findAllProfesor() {
        return ServiceLocator.getInstanceProfesorDAO().findAll();
    }

    public Profesor findProfesorById(Integer id) {
        return ServiceLocator.getInstanceProfesorDAO().find(id);
    }
    
   //encontrar profesor en la bdd
    public Profesor encontrarProfesorRegistrado(Integer idABuscar){
        Profesor profesor = new Profesor();
        
        List<Profesor> profesores = ServiceLocator.getInstanceProfesorDAO().findAll();
       
        for(Profesor pf :profesores){
            //System.out.println(pf.toString());
            if(pf.getNumProfesor()== idABuscar)
                profesor = pf;
        }
        return profesor;
    }
   
    
    
}