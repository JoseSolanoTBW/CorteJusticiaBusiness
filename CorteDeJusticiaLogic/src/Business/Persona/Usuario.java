/**
 *Jose Solano Montoya
 */

package Business.Persona;

public class Usuario {
    
    private int idUsuario;
    private String NombreUsuario;
    private String Password;

    public Usuario() {
    }
    
    public Usuario(String NombreUsuario, String Password) {
        this.NombreUsuario = NombreUsuario;
        this.Password = Password;
    }
    public Usuario(int idUsuario, String NombreUsuario){
        this.idUsuario = idUsuario;
        this.NombreUsuario = NombreUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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
