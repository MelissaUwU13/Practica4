import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UnoGame {

    private List<CartaDiseño> baraja = new ArrayList<>();
    private List<CartaDiseño> cartasUsadas = new ArrayList<>();
    private List<CartaDiseño> jugador1 = new ArrayList<>();
    private List<CartaDiseño> jugador2 = new ArrayList<>();
    private boolean turnoJugador1 = true;
    private boolean juego = true;
    private Scanner scanner = new Scanner(System.in);

    public UnoGame() {
        Baraja mazo = new Baraja();
        //Cada jugador toma 7 cartas, que a la vez mandan a llamar un metodo que las elimina de la baraja
        jugador1.addAll(Arrays.asList(mazo.tomar(), mazo.tomar(), mazo.tomar(), mazo.tomar(), mazo.tomar(), mazo.tomar(), mazo.tomar()));
        jugador2.addAll(Arrays.asList(mazo.tomar(), mazo.tomar(), mazo.tomar(), mazo.tomar(), mazo.tomar(), mazo.tomar(), mazo.tomar()));

        //Se toma la primera carta del juego
        cartasUsadas.add(mazo.tomar());
    }

    public void mostrarCarta() {
        //Mostramos la ultima carta puesta de la baraja
        System.out.println("Carta en mesa: " + cartasUsadas.get(cartasUsadas.size() - 1));
    }

    public void jugar(){
        while (juego = true){
            mostrarCarta();
            //Aqui analizamos de manera breve un if, si jugador1 es true entonces el turno sera del jugador 1, si es false, sera del jugador2
            //
            List<CartaDiseño> manoActual = turnoJugador1 ? jugador1 : jugador2;

            //Misma comprobacion de antes pero ahora para mostrar el mensaje
            System.out.println("Turno del " + (turnoJugador1 ? "Jugador 1" : "Jugador 2"));

            //Verficamos que el jugador puede jugar o si necesita tomar carta
            if(!comprobarJuego(manoActual)){
                tomarCarta(manoActual);
            }

            //Si el jugador ya no tiene cartas, entonces gana
            if(manoActual.isEmpty()){
                System.out.println("¡Ganó el " + (turnoJugador1 ? "Jugador 1" : "Jugador 2") + "!");
                juego = false; //terminamos el while
            }

            //Cambiamos de turno de jugador
            turnoJugador1 = !turnoJugador1;
        }
    }



    public void tomarCarta(List<CartaDiseño> mano){
        //Revisamos que haya cartas en la baraja para tomar una
        if(!baraja.isEmpty()){
            //Agregamos una carta a la mano del usuario y la eliminamos de la baraja
            mano.add(baraja.remove(0));
            System.out.println("No tienes cartas para jugar, asi que tomaste una carta! 0w0");
        }

        //Si ya no hay cartas para agarrar se pasa el turno
        else{
            System.out.println("No hay más cartas en la baraja, PASE DE TURNO!!");
        }
    }

    //Analizamos si la carta que pone el jugador y verificamos si son del mismo color o valor a la ya puesta en la mesa
    //o si se trata de una carta especial +4 o cambio de color
    public boolean comprobarJuego(List<CartaDiseño> mano){
        CartaDiseño cartaMesa = cartasUsadas.get(cartasUsadas.size() - 1);
        return mano.stream()
                .anyMatch(c -> c.getColor().equals(cartaMesa.getColor())
                        || c.getValor() == cartaMesa.getValor()
                        || c.getColor().equals("NEGRO"));
    }
}
