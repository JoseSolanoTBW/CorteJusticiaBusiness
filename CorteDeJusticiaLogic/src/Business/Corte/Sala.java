/**
 * Jose Solano Montoya
 */

package Business.Corte;

public class Sala {

    private int NumeroSala;
    private String NombreSala;

    public Sala() {
    }

    public Sala(int NumeroSala, String NombreSala) {
        this.NumeroSala = NumeroSala;
        this.NombreSala = NombreSala;
    }
    
    public int getNumeroSala() {
        return NumeroSala;
    }

    public void setNumeroSala(int NumeroSala) {
        this.NumeroSala = NumeroSala;
    }

    public String getNombreSala() {
        return NombreSala;
    }

    public void setNombreSala(String NombreSala) {
        this.NombreSala = NombreSala;
    }

    
}
