/**
 * Jose Solano Montoya
 */

package Business.Caso;

import Business.Persona.Querellante;
import Business.Persona.Juez;
import java.util.Date;

public class Caso {

    private int NumeroCaso;
    private String Descripcion;
    private Date FechaCfeacion;
    private Juez JuezAsignado;
    private int Estado;
    private Querellante Denunciante;
    private Historial RegistroHistorico;

    public Caso(int Estado, Date FechaCreacion) {
        RegistroHistorico = new Historial(Estado, FechaCreacion);
    }

    public Caso(int NumeroCaso, String Descripcion, Date FechaCfeacion, int Estado, Querellante Denunciante, Date FechaCreacion) {
        this.NumeroCaso = NumeroCaso;
        this.Descripcion = Descripcion;
        this.FechaCfeacion = FechaCfeacion;
        this.Estado = Estado;
        this.Denunciante = Denunciante;
        this. RegistroHistorico = new Historial(Estado, FechaCreacion);
    }
    


    public int getNumeroCaso() {
        return NumeroCaso;
    }

    public void setNumeroCaso(int NumeroCaso) {
        this.NumeroCaso = NumeroCaso;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Date getFechaCfeacion() {
        return FechaCfeacion;
    }

    public void setFechaCfeacion(Date FechaCfeacion) {
        this.FechaCfeacion = FechaCfeacion;
    }

    public Juez getJuezAsignado() {
        return JuezAsignado;
    }

    public void setJuezAsignado(Juez JuezAsignado) {
        this.JuezAsignado = JuezAsignado;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
    }

    public Querellante getDenunciante() {
        return Denunciante;
    }

    public void setDenunciante(Querellante Denunciante) {
        this.Denunciante = Denunciante;
    }

    public Historial getRegistroHistorico() {
        return RegistroHistorico;
    }

    public void setRegistroHistorico(Historial RegistroHistorico) {
        this.RegistroHistorico = RegistroHistorico;
    }
    
}
