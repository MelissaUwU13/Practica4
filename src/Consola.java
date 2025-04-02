import javax.swing.*;

public class Consola {

    public void Imprimir (int valor, String color, String tipo) {
        if(color.equals("ROSA")) {
            if(tipo.equals("NUMERO")) {
                if (valor == 1){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/R1.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }
                else if (valor == 2){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/R2.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }
                else if (valor == 3){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/R3.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }
                else if (valor == 4){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/R4.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }
                else if (valor == 5){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/R5.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }
                else if (valor == 6){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/R6.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }
                else if (valor == 7){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/R7.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }
                else if (valor == 8){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/R8.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }
                else if (valor == 9){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/R9.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }
                else if (valor == 0){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/R0.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }

            }
            else if(tipo.equals("MAS2")){
                Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/Mas2R.png");
                JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
            }
            else if(tipo.equals("SALTO")){
                Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/RBloqueo.png");
                JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
            }
            else if(tipo.equals("REVERSO")){
                Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/RRota.png");
                JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
            }
        }

        else if (color.equals("AZUL")){
            if(tipo.equals("NUMERO")) {
                if (valor == 1){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/A1.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }
                else if (valor == 2){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/A2.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }
                else if (valor == 3){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/A3.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }
                else if (valor == 4){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/A4.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }
                else if (valor == 5){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/A5.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }
                else if (valor == 6){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/A6.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }
                else if (valor == 7){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/A7.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }
                else if (valor == 8){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/A8.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }
                else if (valor == 9){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/A9.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }
                else if (valor == 0){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/A0.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }

            }
            else if(tipo.equals("MAS2")){
                Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/Mas2A.png");
                JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
            }
            else if(tipo.equals("SALTO")){
                Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/ABloqueo.png");
                JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
            }
            else if(tipo.equals("REVERSO")){
                Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/ARota.png");
                JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
            }
        }

        else if(color.equals("VERDE")) {
            if(tipo.equals("NUMERO")) {
                if (valor == 1){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/V1.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }
                else if (valor == 2){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/V2.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }
                else if (valor == 3){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/V3.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }
                else if (valor == 4){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/V4.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }
                else if (valor == 5){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/V5.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }
                else if (valor == 6){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/V6.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }
                else if (valor == 7){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/V7.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }
                else if (valor == 8){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/V8.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }
                else if (valor == 9){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/V9.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }
                else if (valor == 0){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/V0.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }

            }
            else if(tipo.equals("MAS2")){
                Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/Mas2V.png");
                JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
            }
            else if(tipo.equals("SALTO")){
                Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/VBloqueo.png");
                JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
            }
            else if(tipo.equals("REVERSO")){
                Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/VRota.png");
                JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
            }
        }

        else if(color.equals("AMARILLO")){
            if(tipo.equals("NUMERO")) {
                if (valor == 1){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/Y1.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }
                else if (valor == 2){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/Y2.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }
                else if (valor == 3){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/Y3.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }
                else if (valor == 4){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/Y4.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }
                else if (valor == 5){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/Y5.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }
                else if (valor == 6){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/Y6.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }
                else if (valor == 7){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/Y7.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }
                else if (valor == 8){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/Y8.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }
                else if (valor == 9){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/Y9.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }
                else if (valor == 0){
                    Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/Y0.png");
                    JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
                }

            }
            else if(tipo.equals("MAS2")){
                Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/Mas2Y.png");
                JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
            }
            else if(tipo.equals("SALTO")){
                Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/YBloqueo.png");
                JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
            }
            else if(tipo.equals("REVERSO")){
                Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/YRota.png");
                JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
            }
        }

        else{
            if(tipo.equals("MAS4")) {
                Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/Mas4.png");
                JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
            }
            else if(tipo.equals("CAMBIO_COLOR")){
                Icon icono = new ImageIcon("C:/Users/hp/IdeaProjects/Practica4/src/Cartas/CambioC.png");
                JOptionPane.showMessageDialog(null,"CARTA ACTUAL EN LA MESA: ","UNO GAME",JOptionPane.INFORMATION_MESSAGE,icono);
            }
        }
    }
}
