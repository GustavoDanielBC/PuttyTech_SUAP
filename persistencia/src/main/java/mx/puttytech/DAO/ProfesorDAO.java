
package mx.puttytech.DAO;

import java.util.List;
import mx.puttytech.entidad.Profesor;
import mx.puttytech.entidad.UnidadAprendizaje;
import mx.puttytech.persistencia.AbstractDAO;
import mx.puttytech.persistencia.HibernateUtil;
/**
 *
 * @author issac
 */
public class ProfesorDAO extends AbstractDAO<Integer, Profesor>{
    
    //Falta Correccion Evitar Mover
    public List<UnidadAprendizaje> findUnidadesByProfesor(int idProfesor) {
        String hql = "SELECT a.claveUnidadAprendizaje FROM Asignacion a WHERE a.numProfesor.numProfesor = :numProfesor";
    return (List<UnidadAprendizaje>) HibernateUtil.getSession()
            .createQuery(hql)
            .setParameter("idProfesor", idProfesor)
            .list();
    }
}    