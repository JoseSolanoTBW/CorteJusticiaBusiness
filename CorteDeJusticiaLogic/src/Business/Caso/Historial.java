/**
 * Jose Solano Montoya
 */

package Business.Caso;

import java.util.ArrayList;
import java.util.Date;


public class Historial {
    private ArrayList<DetalleHistorial> ActualizacionEstado;

    public Historial() {
        ActualizacionEstado = IsListCreated();
    }
    
    public Historial(ArrayList<DetalleHistorial> ActualizacionEstado) {
        this.ActualizacionEstado = ActualizacionEstado;
    }
    
    public Historial(int Estado, Date FechaActualizacion) {
        this.ActualizacionEstado = IsListCreated();
        DetalleHistorial detalleHistorico = new DetalleHistorial(Estado, FechaActualizacion);
        this.SaveDetalleHistorico(detalleHistorico);
    }
    
    
    public ArrayList<DetalleHistorial> getActualizzacionEstado() {
        return ActualizacionEstado;
    }

    public void setActualizzacionEstado(ArrayList<DetalleHistorial> ActualizzacionEstado) {
        this.ActualizacionEstado = IsListCreated();
    }
    
    private ArrayList<DetalleHistorial> IsListCreated(){
        
        if(ActualizacionEstado == null)
            return new ArrayList<DetalleHistorial>();
        
        return ActualizacionEstado;
    }
    
    public void SaveDetalleHistorico(DetalleHistorial nuevoDetalle){
        ActualizacionEstado = IsListCreated();
        ActualizacionEstado.add(nuevoDetalle);
    }
    
}
