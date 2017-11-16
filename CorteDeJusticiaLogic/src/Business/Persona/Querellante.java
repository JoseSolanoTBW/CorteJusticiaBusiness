/**
 * 
 * Descripción: 
 * Fecha: 
 * Autor: Jose Solano Montoya
 * Fecha de modificación: 
 * Modificado por: Jose Solano Montoya
 */

package Business.Persona;

import Business.Persona.Persona;


public class Querellante extends Persona{

    public Querellante() {
        super();
    }

    public Querellante(int Cedula, String Nombre, String Apellido, int Telefono, String Direccion) {
        super(Cedula, Nombre, Apellido, Telefono, Direccion);
    }
    public Querellante(int idPersona,int Cedula, String Nombre, String Apellido, int Telefono, String Direccion) {
        super(idPersona,Cedula, Nombre, Apellido, Telefono, Direccion);
    }  

}
