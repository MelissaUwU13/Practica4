import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UnoGame{

    private Consola impreso = new Consola();
    private List<CartaDiseño> baraja = new ArrayList<>();
    private List<CartaDiseño> cartasUsadas = new ArrayList<>();
    private List<CartaDiseño> jugador1 = new ArrayList<>();
    private List<CartaDiseño> jugador2 = new ArrayList<>();
    private boolean turnoJugador1 = true;
    private boolean juego = true;
    private Scanner scanner = new Scanner(System.in);

    public UnoGame(){
        Baraja mazo = new Baraja();
        baraja = mazo.generarBaraja(); // Copiar todas las cartas a baraja

        // Repartir 7 cartas a cada jugador, eliminándolas de la baraja
        for (int i = 0; i < 7; i++) {
            jugador1.add(tomarCartaDeBaraja());
            jugador2.add(tomarCartaDeBaraja());
        }

        // Sacar la primera carta del juego
        cartasUsadas.add(tomarCartaDeBaraja());
    }

    public void mostrarCarta(){
        //Mostramos la ultima carta puesta de la baraja
        System.out.println("Carta en mesa: " + cartasUsadas.get(cartasUsadas.size() - 1));
    }

    public void mostrarMano(List<CartaDiseño> mano){
        System.out.println("Cartas en tu mano:");
        for(int i=0;i<mano.size(); i++){
            System.out.println(i + ": " + mano.get(i));
        }
    }

    public void jugar(){
        while (juego == true){
            mostrarCarta();
            //Aqui analizamos de manera breve un if, si jugador1 es true entonces el turno sera del jugador 1, si es false, sera del jugador 2
            List<CartaDiseño> manoActual = turnoJugador1 ? jugador1 : jugador2;

            //Misma comprobacion de antes pero ahora para mostrar el mensaje
            System.out.println("Turno del " + (turnoJugador1 ? "Jugador 1" : "Jugador 2"));

            // Mostrar las cartas en la mano del jugador
            mostrarMano(manoActual);

            //Comprobar las cartas válidas para jugar
            List<CartaDiseño> cartasValidas = comprobarCartasValidas(manoActual);

            if(cartasValidas.isEmpty()){
                //Si no hay cartas válidas, el jugador toma una carta
                System.out.println("No tienes cartas válidas para jugar, TOMA UNA CARTA!");

                tomarCarta(manoActual);
            }
            else{
                // Solicitar al jugador que elija una carta válida para jugar
                int opcion = -1;
                boolean cartaValida = false;
                while (!cartaValida){
                    System.out.print("Elige una carta válida por su número de opción: ");
                    opcion = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer

                    // Verificar si la opción es válida
                    if(opcion >= 0 && opcion < manoActual.size() && cartasValidas.contains(manoActual.get(opcion))){
                        cartaValida = true;
                    }
                    else{
                        System.out.println("Carta no válida para jugar, porfis elige una carta otra qwq");
                    }
                }


                // Seleccionar la carta elegida
                CartaDiseño cartaSeleccionada = manoActual.get(opcion);

                // Realizamos la comprobación y jugamos la carta
                cartasUsadas.add(cartaSeleccionada);
                manoActual.remove(opcion); //Eliminar la carta de la mano después de jugarla
                System.out.println("Jugaste la carta " + cartaSeleccionada);
                impreso.Imprimir(cartaSeleccionada.getValor(), cartaSeleccionada.getColor(), cartaSeleccionada.getTipo());
                cartasEspeciales(manoActual); // Verificamos si la carta jugada es especial
            }

            //Si el jugador ya no tiene cartas, entonces gana
            if(manoActual.isEmpty()){
                System.out.println("¡Ganó el " + (turnoJugador1 ? "Jugador 1" : "Jugador 2") + "!");
                juego = false; //terminamos el while
            }

            //Cambiamos de turno de jugador
            turnoJugador1 = !turnoJugador1;
            System.out.println(" ");
        }
    }

    private CartaDiseño tomarCartaDeBaraja() {
        if(!baraja.isEmpty()){
            return baraja.remove(0); //Sacamos la primera carta de la baraja y la eliminamos
        }
        return null; //En caso de que no haya cartas
    }

    //Tomar una carta de la baraja
    public void tomarCarta(List<CartaDiseño> mano){
        //Revisamos que haya cartas en la baraja para tomar una
        if(!baraja.isEmpty()){
            //Agregamos una carta a la mano del usuario y la eliminamos de la baraja
            mano.add(baraja.remove(0));
            System.out.println("Carta tomada! 0w0");
        }

        //Si ya no hay cartas para agarrar se pasa el turno
        else{
            System.out.println("No hay más cartas en la baraja, PASE DE TURNO!!");
        }
    }

    //Función que comprueba cuáles cartas en la mano son válidas para jugar
    public List<CartaDiseño> comprobarCartasValidas(List<CartaDiseño> mano) {
        CartaDiseño cartaMesa = cartasUsadas.get(cartasUsadas.size() - 1);
        List<CartaDiseño> cartasValidas = new ArrayList<>();

        for(CartaDiseño carta : mano){
            if(carta.getColor().equals(cartaMesa.getColor()) || carta.getValor() == cartaMesa.getValor() || carta.getColor().equals("NEGRO")){
                cartasValidas.add(carta);
            }
        }

        return cartasValidas;
    }

    private void cartasEspeciales(List<CartaDiseño> mano){
        CartaDiseño carta = cartasUsadas.get(cartasUsadas.size() - 1);

        if(carta.getTipo().equals("MAS2")){
            System.out.println("te comes 2 cartas jeje");
            System.out.println("¡El siguiente jugador come dos cartas!");
            comerCartas(2);
        }
        else if(carta.getTipo().equals("MAS4")){
            System.out.println("uyyy te comes 4 papu");
            System.out.println("¡El siguiente jugador come cuatro cartas y pero antes elige un color!");
            comerCartas(4);
            cambioColor();
        }
        else if(carta.getTipo().equals("CAMBIO_COLOR")){
            System.out.println("¡El jugador elige un nuevo color!");
            cambioColor();
        }
        else if(carta.getTipo().equals("SALTO")){
            System.out.println("BLOQUEO BLOQUEO!!");
            System.out.println("¡El siguiente jugador pierde su turno!");
            // Salta el turno del siguiente jugador
            turnoJugador1 = !turnoJugador1;
        }
        else if(carta.getTipo().equals("REVERSO")){
            System.out.println("¡La dirección del juego se invierte!");
            turnoJugador1 = !turnoJugador1;
            //Como son dos jugadores el reverso es basicamente un bloqueo
        }
    }

    //Metodo para remover 2 o 4 cartas
    private void comerCartas(int numCartas){
        List<CartaDiseño> siguienteJugador = turnoJugador1 ? jugador2 : jugador1;

        for(int i=0;i<numCartas;i++){
            CartaDiseño cartaTomada = tomarCartaDeBaraja();
            if(cartaTomada != null){
                siguienteJugador.add(cartaTomada);
            }
        }
    }

    //Cambiar de color a carta
    public void cambioColor(){
        System.out.println("Elige un color (ROSA, AZUL, VERDE, AMARILLO): ");
        System.out.println("FAVOR DE ESCRIBIRLO EN MAYUSCULAS");
        System.out.print("Ingrese el color: ");
        String color = scanner.nextLine().toUpperCase();

        //Si el usuario no elije una opcion correcta tendra que volver a intentarlo hasta que le salga bien
        while (!color.equals("AZUL") && !color.equals("ROSA") && !color.equals("VERDE") && !color.equals("AMARILLO")){
            System.out.println("Color inválido. Elige entre ROSA, AZUL, VERDE o AMARILLO: ");
            color = scanner.nextLine().toUpperCase();
        }

        System.out.println("El color se ha cambiado a " + color);
        //Cambio de color en la ultima carta
        cartasUsadas.get(cartasUsadas.size() - 1).setColor(color);
    }
}