/**
 *  Jose Solano Montoya
 */
package Business.Persona;

import Business.Persona.Usuario;

public class Secretario extends Persona {

    private Usuario LoginUsuario;

    public Secretario() {
        super();
    }

    public Secretario(int Cedula, String Nombre, String Apellido, int Telefono, String Direccion, String NombreUsuario, String Password) {
        super(Cedula, Nombre, Apellido, Telefono, Direccion);
        this.LoginUsuario = new Usuario(NombreUsuario, Password);
    }

    public Secretario(int idPerson, int Cedula, String Nombre, String Apellido, int Telefono, String Direccion, String NombreUsuario, int idUsuario) {
        super(idPerson, Cedula, Nombre, Apellido, Telefono, Direccion);
        this.LoginUsuario = new Usuario(idUsuario, NombreUsuario);
    }

    public Usuario getLoginUsuario() {
        return LoginUsuario;
    }

    public void setLoginUsuario(Usuario LoginUsuario) {
        this.LoginUsuario = LoginUsuario;
    }

}
