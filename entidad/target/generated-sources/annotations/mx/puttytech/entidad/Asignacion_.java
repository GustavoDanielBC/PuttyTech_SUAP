package mx.puttytech.entidad;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.puttytech.entidad.Profesor;
import mx.puttytech.entidad.UnidadAprendizaje;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2025-03-12T02:10:51")
@StaticMetamodel(Asignacion.class)
public class Asignacion_ { 

    public static volatile SingularAttribute<Asignacion, Profesor> numProfesor;
    public static volatile SingularAttribute<Asignacion, UnidadAprendizaje> claveUnidadAprendizaje;
    public static volatile SingularAttribute<Asignacion, Integer> idAsignacion;

}