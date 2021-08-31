package alvaro.horasextras_productoshigiene_lectorficheros;

/**
 *
 * @author Álvaro
 */
public class Producto {
    private String nombre;
    private float precio;
    private boolean vegano;

    public Producto(String nombre, float precio, boolean vegano) {
        this.nombre = nombre;
        this.precio = precio;
        this.vegano = vegano;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public boolean isVegano() {
        return vegano;
    }

    @Override
    public String toString() {
        return nombre + " - " + precio + " - " + vegano;
    }
}
