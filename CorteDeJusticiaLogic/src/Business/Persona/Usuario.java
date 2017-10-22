/**
 *Jose Solano Montoya
 */

package Business.Persona;

public class Usuario {

    private String NombreUsuario;
    private String Password;

    public Usuario() {
    }
    
    public Usuario(String NombreUsuario, String Password) {
        this.NombreUsuario = NombreUsuario;
        this.Password = Password;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
  
}
