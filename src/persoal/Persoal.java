
package persoal;

/**
 *
 * @author irodriguezsteuerberg
 */
public class Persoal {
private String telefono;
private String correo;

    public Persoal() {
    }

    public Persoal(String telefono, String correo) {
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return  ("\ntelefono = " + telefono + "\ncorreo = " + correo);
    }








}
