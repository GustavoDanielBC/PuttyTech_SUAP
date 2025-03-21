
package mx.puttytech.ui;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.io.IOException;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.el.PropertyNotFoundException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.validation.ConstraintViolationException;
import mx.puttytech.entidad.Profesor;
import mx.puttytech.entidad.Usuario;
import mx.puttytech.helper.AltasHelper;
import mx.puttytech.helper.UsuarioAltaHelper;

@ManagedBean(name = "AltasBeanUI")
@ViewScoped
public class AltasBeanUI implements Serializable{
    private AltasHelper altasHelper;
    //private transient BuscarHelper buscarHelper;
    //private Usuario usuario;
    private UsuarioAltaHelper usuarioAltaHelper;
    private Profesor profesor;
    
    public AltasBeanUI() {
        altasHelper = new AltasHelper();
        usuarioAltaHelper = new UsuarioAltaHelper();
        //buscarHelper = new BuscarHelper();
    }
    
    /**
     * Metodo postconstructor todo lo que este dentro de este metodo
     * sera la primero que haga cuando cargue la pagina
     */
    @PostConstruct
    public void init(){
        profesor = new Profesor();
    }

     public void darDeAlta() throws IOException{
        Profesor profesorRepetido = null;
        
        Integer id_profesor = profesor.getNumProfesor();
        String nombre = limpiarEspacios(profesor.getNombre());
        String apellido = limpiarEspacios(profesor.getApellido());
        String rfc = profesor.getRfc().trim();
        //System.out.println(id_profesor);
        
        profesorRepetido = altasHelper.buscar(id_profesor);
        
        if (id_profesor == null || nombre == null || apellido == null || rfc == null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Error al capturar los datos:", "Por favor evite dejar campos vacíos"));
        } else if (nombre.isEmpty() || apellido.isEmpty() || rfc.isEmpty()) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Error al capturar los datos:", "Por favor evite dejar campos vacíos"));
        } else if(!esCadenaSoloLetras(nombre) || !esCadenaSoloLetras(apellido)){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Error al capturar los datos:", "Caracteres inválidos en nombre o apellido"));
        } else if (isBlank(nombre) || isBlank(apellido) || isBlank(rfc)) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Error al capturar los datos:", "Por favor evite dejar campos vacíos"));
        } else if (rfc.length() != 13){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Error al capturar los datos:", "RFC no válido"));
        } else if (profesorRepetido!=null){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Error al capturar los datos:", "El ID proporcionado ya existe en el sistema"));
        } else{
                //usuarioAltaHelper.AltaUsuario(new Usuarios(id_profesor,String.valueOf(id_profesor),nombre+" "+apellido));
                altasHelper.Alta(profesor, new Usuario(id_profesor,String.valueOf(id_profesor),nombre+" "+apellido+rfc));
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Acción realizada", "Registro capturado exitosamente"));
            
            
        }
    }

    public boolean isBlank(String str) {
        return str.trim().isEmpty();
    }
    
    /* getters y setters*/

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor usuario) {
        this.profesor = usuario;
    }
    
    private boolean esCadenaSoloLetras(String cadena) {
        // Expresión regular que valida las letras del alfabeto español con acentos y ñ
        String regex = "^[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ\\s]+$";
        
        // Retorna true si la cadena coincide con el patrón, false en caso contrario
        return cadena.matches(regex);
    }
    
    private String limpiarEspacios(String cadena) {
        
        return cadena.trim().replaceAll("\\s+", " ");
    }
}