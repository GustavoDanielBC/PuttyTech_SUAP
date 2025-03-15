
package mx.puttytech.ui;
import java.io.Serializable;
import javax.faces.application.NavigationHandler;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Usuario X
 */
public class AltasUnidadAprendizajeBeanUI {
    
    public void redirigirAConsultaProfesor() {
        try {
            FacesContext facesContext = FacesContext.getCurrentInstance();
            NavigationHandler navigationHandler = facesContext.getApplication().getNavigationHandler();
            navigationHandler.handleNavigation(facesContext, null, "consultasProfesor.xhtml?faces-redirect=true");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void redirigirAAltaProfesor() {
        try {
            FacesContext facesContext = FacesContext.getCurrentInstance();
            NavigationHandler navigationHandler = facesContext.getApplication().getNavigationHandler();
            navigationHandler.handleNavigation(facesContext, null, "altaProfesor.xhtml?faces-redirect=true");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void redirigirAConsultaUnidades() {
        try {
            FacesContext facesContext = FacesContext.getCurrentInstance();
            NavigationHandler navigationHandler = facesContext.getApplication().getNavigationHandler();
            navigationHandler.handleNavigation(facesContext, null, "consultasUnidadAprendizaje.xhtml?faces-redirect=true");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void redirigirAAltaUDA() {
        try {
            FacesContext facesContext = FacesContext.getCurrentInstance();
            NavigationHandler navigationHandler = facesContext.getApplication().getNavigationHandler();
            navigationHandler.handleNavigation(facesContext, null, "consultasUnidadAprendizaje.xhtml?faces-redirect=true");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
