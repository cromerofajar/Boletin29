package boletin29;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author cromerofajar
 */
public class Boletin29 {

    public static void main(String[] args) {
        float precioY;
        ArrayList<Barco>listaBarcos=new ArrayList<>();
        Barco yate=new Yate(3,600,5,34,"0034btd");
        Velero velero=new Velero(3,20,38,"0454hsd");
        Deportivo deportivo=new Deportivo(600,70,34,"9373lfw");
        yate.CalcularPrecio();
        velero.CalcularPrecio();
        deportivo.CalcularPrecio();
        listaBarcos.add(yate);
        listaBarcos.add(velero);
        listaBarcos.add(deportivo);
        for(Barco l:listaBarcos){
            JOptionPane.showMessageDialog(null,l);
        }
        
                
    }
    
}
