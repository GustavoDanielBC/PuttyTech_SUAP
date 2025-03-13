
package mx.puttytech.delegate;


import java.util.List;
import mx.puttytech.entidad.UnidadAprendizaje;
import mx.puttytech.integracion.ServiceLocator;

public class DelegateUnidadAprendizaje {
    
    public void saveUnidadAprendizaje(UnidadAprendizaje unidadaprendizaje){
        ServiceLocator.getInstanceUnidadAprendizajeDAO().save(unidadaprendizaje);
    }
    
    public void updateUnidadAprendizaje(UnidadAprendizaje unidadaprendizaje) {
        ServiceLocator.getInstanceUnidadAprendizajeDAO().update(unidadaprendizaje);
    }

    public void deleteUnidadAprendizaje(UnidadAprendizaje unidadaprendizaje) {
        ServiceLocator.getInstanceUnidadAprendizajeDAO().delete(unidadaprendizaje);
    }

    public List<UnidadAprendizaje> findAllUnidadAprendizaje() {
        return ServiceLocator.getInstanceUnidadAprendizajeDAO().findAll();
    }

    public UnidadAprendizaje findUnidadAprendizajeById(Integer id) {
        return ServiceLocator.getInstanceUnidadAprendizajeDAO().find(id);
    }
    
   //encontrar profesor en la bdd
    public UnidadAprendizaje encontrarUnidadAprendizajeRegistrada(Integer idABuscar){
        UnidadAprendizaje profesor = new UnidadAprendizaje();
        
        List<UnidadAprendizaje> unidadaprendizaje = ServiceLocator.getInstanceUnidadAprendizajeDAO().findAll();
       
        for(UnidadAprendizaje pf :unidadaprendizaje){
            //System.out.println(pf.toString());
            if(pf.getClaveUnidadAprendizaje()== idABuscar)
                profesor = pf;
        }
        return profesor;
    }
}
