
package ClasesAlmacenes;

public class Pedidos {
    //Dejamos solo numDePedido como public, el resto no interactuan con otras
    //clases
    public int numDePedido;
    private int fechaDePedido;
    private int fechaDeEntrega;

    public Pedidos(int numDePedido, int fechaDePedido, int fechaDeEntrega) {
        this.numDePedido = numDePedido;
        this.fechaDePedido = fechaDePedido;
        this.fechaDeEntrega = fechaDeEntrega;
    }

    public int getNumDePedido() {
        return numDePedido;
    }

    public int getFechaDePedido() {
        return fechaDePedido;
    }

    public int getFechaDeEntrega() {
        return fechaDeEntrega;
    }
    
    
}
