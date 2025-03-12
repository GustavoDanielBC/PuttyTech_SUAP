package mx.puttytech.entidad;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.puttytech.entidad.Asignacion;
import mx.puttytech.entidad.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2025-03-12T14:21:19")
@StaticMetamodel(Profesor.class)
public class Profesor_ { 

    public static volatile ListAttribute<Profesor, Usuario> usuarioList;
    public static volatile SingularAttribute<Profesor, Integer> numProfesor;
    public static volatile SingularAttribute<Profesor, String> apellido;
    public static volatile ListAttribute<Profesor, Asignacion> asignacionList;
    public static volatile SingularAttribute<Profesor, String> nombre;
    public static volatile SingularAttribute<Profesor, String> rfc;

}