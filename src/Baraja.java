import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Baraja {
    private List<CartaDiseño> cartas;
    private Random random = new Random();
    private String[] colores = {"ROSA", "AZUL", "VERDE", "AMARILLO"}; //Color baraja
    private String[] tiposEspeciales = {"MAS2", "SALTO", "REVERSO"}; //Tipos de cartas


    public Baraja() {
        cartas = new ArrayList<>();

        //For para las cartas normales de los 4 colores
        for(String color : colores){
            int i=0;

            //Carta normal del 0 al 9
            while(i<=9){
                cartas.add(new CartaDiseño(color, "NUMERO", i));
                i++;
            }

            //Carta de colores especial - mas2, salto, reverso
            for(int j=0;j<2;j++){
                for(String tipo : tiposEspeciales){
                    cartas.add(new CartaDiseño(color, tipo, -1));
                }
            }
        }

        //For para las dos cartas especiales black
        for(int i=0;i<4;i++){
            cartas.add(new CartaDiseño("NEGRO", "MAS4", -1));
            cartas.add(new CartaDiseño("NEGRO", "CAMBIO_COLOR", -1));
        }

        Collections.shuffle(cartas);
    }

    //Revisa que la baraja no este vacia, sino no lo esta entonces toma una carta
    public CartaDiseño tomar(){
        return cartas.isEmpty() ? null : cartas.remove(0);
    }
}
