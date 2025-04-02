public class CartaDiseño {
    enum Color { AZUL, VERDE, ROSA, AMARILLO, NEGRO } // NEGRO para cartas especiales

    private String valor, color;

    public CartaDiseño(String color, String valor) {
        this.color = color;
        this.valor = valor;
    }

    public String getColor() {
        return color;
    }

    public String getValor() {
        return valor;
    }

    public String toString() {
        return color + " " + valor;
    }

}
