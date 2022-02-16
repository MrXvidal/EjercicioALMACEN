
package ClasesAlmacenes;

public class Producto {
    //precioCompra protected para que clases herederas accedan.
    public String nombre;
    protected int precioCompra;
    public int precioVenta;

    public Producto(String Nombre, int precioCompra, int precioVenta) {
        this.nombre = Nombre;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    
}
