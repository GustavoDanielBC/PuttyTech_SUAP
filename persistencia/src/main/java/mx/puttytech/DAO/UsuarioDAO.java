
package mx.puttytech.DAO;


import mx.puttytech.entidad.Profesor;
import mx.puttytech.entidad.Usuario;
import mx.puttytech.persistencia.AbstractDAO;
import mx.puttytech.persistencia.HibernateUtil;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UsuarioDAO extends AbstractDAO<Integer, Usuario>{
    public void registrarProfesor(Profesor nuevoProfesor, Usuario nuevoUsuario) {
    Session session = HibernateUtil.getSession();
    Transaction tx = null;
    try {
        tx = session.beginTransaction();

        // Insertar en la tabla usuarios
        String sqlUsuario = "INSERT INTO Usuario (idUsuario, contrasena, nombreUsuario) VALUES (:idUsuario, :contrasena, :nombreUsuario)";
        SQLQuery queryUsuario = session.createSQLQuery(sqlUsuario);
        queryUsuario.setParameter("idUsuario", nuevoUsuario.getIdUsuario());
        queryUsuario.setParameter("contrasena", nuevoUsuario.getContrasena());
        queryUsuario.setParameter("nombreUsuario", nuevoUsuario.getNombreUsuario());
        queryUsuario.executeUpdate();

        // Insertar en la tabla profesores
        String sqlProfesor = "INSERT INTO profesores (id_profesor, nombre, apellido, rfc) VALUES (:id_profesor, :nombre, :apellido, :rfc)";
        SQLQuery queryProfesor = session.createSQLQuery(sqlProfesor);
        queryProfesor.setParameter("numProfesor", nuevoProfesor.getNumProfesor());
        queryProfesor.setParameter("nombre", nuevoProfesor.getNombre());
        queryProfesor.setParameter("apellido", nuevoProfesor.getApellido());
        queryProfesor.setParameter("RFC", nuevoProfesor.getRfc());
        queryProfesor.executeUpdate();

        // Commit de la transacción
        tx.commit();
    } catch (Exception e) {
        if (tx != null) tx.rollback();
        e.printStackTrace();
        throw new RuntimeException(e);
    } finally {
        session.close();
    }
}
    
    
}
