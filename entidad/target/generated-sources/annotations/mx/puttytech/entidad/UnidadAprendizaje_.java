package mx.puttytech.entidad;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.puttytech.entidad.Asignacion;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2025-03-14T19:06:31")
@StaticMetamodel(UnidadAprendizaje.class)
public class UnidadAprendizaje_ { 

    public static volatile SingularAttribute<UnidadAprendizaje, Integer> horasLaboratorio;
    public static volatile SingularAttribute<UnidadAprendizaje, String> nombreunidad;
    public static volatile ListAttribute<UnidadAprendizaje, Asignacion> asignacionList;
    public static volatile SingularAttribute<UnidadAprendizaje, Integer> claveUnidadAprendizaje;
    public static volatile SingularAttribute<UnidadAprendizaje, Integer> horasClase;
    public static volatile SingularAttribute<UnidadAprendizaje, Integer> horasTaller;

}