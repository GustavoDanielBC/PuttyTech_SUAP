
package test;

import mx.puttytech.entidad.Profesor;
import mx.puttytech.integracion.ServiceFacadeLocator;

/**
 *
 * @author lukki
 */
public class test {
    public static void main(String[] args) {
        
       Profesor profesores = ServiceFacadeLocator.getInstanceFacadeProfesor().findProfesoresById(1233);
        
        if(profesores.getNumProfesor()!= null){
            System.out.println(profesores.getNumProfesor());
            System.out.println(profesores.getNombre());
            System.out.println(profesores.getApellido());
            System.out.println(profesores.getRfc());
        }else{
            System.out.println("No se encontro ningun registro");
        }
    }
}
