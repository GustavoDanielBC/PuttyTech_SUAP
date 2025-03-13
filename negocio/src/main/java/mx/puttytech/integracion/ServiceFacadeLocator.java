package mx.puttytech.integracion;

import java.io.Serializable;
import mx.puttytech.facade.FacadeUsuario;
import mx.puttytech.facade.FacadeAsignacion;
import mx.puttytech.facade.FacadeProfesor;
import mx.puttytech.facade.FacadeUnidadAprendizaje;

public class ServiceFacadeLocator {
    
    private static FacadeProfesor facadeProfesor;
    private static FacadeUnidadAprendizaje facadeUnidadaprendizaje;
    private static FacadeAsignacion facadeAsignacion;
    private static FacadeUsuario facadeUsuario;
    
    
     public static FacadeProfesor getInstanceFacadeProfesor() {
        if (facadeProfesor == null) {
            facadeProfesor = new FacadeProfesor();
        }
        return facadeProfesor;
    }
     
     public static FacadeUnidadAprendizaje getInstanceFacadeUnidadAprendizaje() {
        if (facadeUnidadaprendizaje == null) {
            facadeUnidadaprendizaje = new FacadeUnidadAprendizaje();
        }
        return facadeUnidadaprendizaje;
    }
     
     public static FacadeAsignacion getInstanceFacadeHorarios() {
        if (facadeAsignacion == null) {
            facadeAsignacion = new FacadeAsignacion();
        }
        return facadeAsignacion;
    }
      public static FacadeUsuario getInstanceFacadeUusuario() {
        if (facadeUsuario == null) {
            facadeUsuario = new FacadeUsuario();
        }//aaahh
        return facadeUsuario;
      }
}
