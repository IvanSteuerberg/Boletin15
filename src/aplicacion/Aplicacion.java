package aplicacion;
import persoal.Persoal;
import notaprimertrimestre.NotaMedia;
/**
 *
 * @author irodriguezsteuerberg
 */
public class Aplicacion {

    public static void main(String[] args) {
        
    Persoal alu = new Persoal("612345678","juan@gmail.com");
    NotaMedia nota1 = new NotaMedia();
    float nota=(nota1.calcularNotaMedia());
    Academica aca1 = new Academica("Juan",nota,alu);
   
    System.out.println(aca1.toString());
    }
    
}
