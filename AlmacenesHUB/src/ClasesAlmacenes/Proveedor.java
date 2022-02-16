
package ClasesAlmacenes;

public class Proveedor {
    private String NIF;
   public  String Nombre;
    private String Telefono;
    private String Mail;

    public Proveedor(String NIF, String Nombre, String Telefono, String Mail) {
        this.NIF = NIF;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.Mail = Mail;
    }

    public String getNIF() {
        return NIF;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }
    /**
     * 
     * @return  Retorna el correo
     */
    public String getMail() {
        return Mail;
    }
    
    /**
     * 
     * @param Telefono 
     */
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    /**
     * 
     * @param Mail 
     */
    public void setMail(String Mail) {
        this.Mail = Mail;
    }
    
    
}
