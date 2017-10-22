/**
 * Jose Solano Montoya
 */

package Business.Caso;

import java.util.Date;

public class DetalleHistorial {

    private int Estado;
    private Date FechaActualizacion;

    public DetalleHistorial() {
    }

    public DetalleHistorial(int Estado, Date FechaActualizacion) {
        this.Estado = Estado;
        this.FechaActualizacion = FechaActualizacion;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
    }

    public Date getFechaActualizacion() {
        return FechaActualizacion;
    }

    public void setFechaActualizacion(Date FechaActualizacion) {
        this.FechaActualizacion = FechaActualizacion;
    }
    
}
