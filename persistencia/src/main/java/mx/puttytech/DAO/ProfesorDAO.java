
package mx.puttytech.DAO;

import java.util.List;
import mx.puttytech.entidad.Profesor;
import mx.puttytech.entidad.UnidadAprendizaje;
import mx.puttytech.persistencia.AbstractDAO;
import mx.puttytech.persistencia.HibernateUtil;
/**
 *
 * @author Usuario X
 */
public class ProfesorDAO extends AbstractDAO<Integer, Profesor>{
    
    
    public List<UnidadAprendizaje> findUnidadesByProfesor(int idProfesor) {
        String hql = "SELECT a.claveUnidadAprendizaje FROM Asignacion a WHERE a.numProfesor.numProfesor = :numProfesor";
    return (List<UnidadAprendizaje>) HibernateUtil.getSession()
            .createQuery(hql)
            .setParameter("numProfesor", idProfesor)
            .list();
    }
    
     public List<Profesor> SeleccionarProfesor(Profesor idProfesor){
         String sqlconsul = "SELECT * FROM profesor";
         return (List<Profesor>) HibernateUtil.getSession()
                 .createQuery(sqlconsul)
                 .setParameter("numProfesor",idProfesor)
                 .list();
     }
}    