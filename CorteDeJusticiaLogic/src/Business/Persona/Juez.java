/**
 * Jose Solano Montoya
 */

package Business.Persona;

import Business.Persona.Usuario;
import Business.Corte.Sala;

public class Juez  extends Persona{
    
    private int NumeroJuez;
    private Sala SalaJustica;
    private Usuario LoginUsuario;

    public Juez() {
    }
    
    public Juez(int NumeroJuez, Sala SalaJustica) {
        this.NumeroJuez = NumeroJuez;
        this.SalaJustica = SalaJustica;
    }
    
    public Juez(int NumeroJuez, int NumeroSala, String NombreSala) {
        this.NumeroJuez = NumeroJuez;
        this.SalaJustica = new Sala(NumeroSala, NombreSala);
    }

    public Juez(int NumeroJuez, Sala SalaJustica, Usuario LoginUsuario) {
        this.NumeroJuez = NumeroJuez;
        this.SalaJustica = SalaJustica;
        this.LoginUsuario = LoginUsuario;
    }
    
        public Juez(int NumeroJuez, Sala SalaJustica, String NombreUsuario, String Password) {
        this.NumeroJuez = NumeroJuez;
        this.SalaJustica = SalaJustica;
        this.LoginUsuario = new Usuario(NombreUsuario, Password);
    }         

    public int getNumeroJuez() {
        return NumeroJuez;
    }

    public void setNumeroJuez(int NumeroJuez) {
        this.NumeroJuez = NumeroJuez;
    }

    public Sala getSalaJustica() {
        return SalaJustica;
    }

    public void setSalaJustica(Sala SalaJustica) {
        this.SalaJustica = SalaJustica;
    }
   
}
