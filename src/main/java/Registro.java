
//import com.sun.istack.internal.NotNull;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named (value="Registro")
@RequestScoped
public class Registro {
    
    String correo1;
    
    String contraseña1;

    public String getCorreo1() {
        return correo1;
    }

    public void setCorreo1(String correo1) {
        this.correo1 = correo1;
    }

    public String getContraseña1() {
        return contraseña1;
    }

    public void setContraseña1(String contraseña1) {
        this.contraseña1 = contraseña1;
    }
    
    public void mensaje (){
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(correo1));
    }
    
}
