import java.io.Serializable;

public class MovimientoBancario implements Serializable {
    private String fecha;
    private String concepto;
    private double cantidad;
    private boolean tipo;

    public MovimientoBancario(String fecha, String concepto, double cantidad, boolean tipo) {
        this.fecha = fecha;
        this.concepto = concepto;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public MovimientoBancario() {
        this.fecha = "";
        this.concepto = "";
        this.cantidad = 0;
        this.tipo = false;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public boolean getTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Fecha: "+this.fecha+" Concepto: "+this.concepto+" Cantidad: "+this.cantidad+" Tipo: "+this.tipo;
    }
     
}
