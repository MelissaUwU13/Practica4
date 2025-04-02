public class CartaDiseño {
    private String tipo, color;
    private int valor;

    public CartaDiseño(String color, String tipo, int valor) {
        this.color = color;
        this.valor = valor;
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public int getValor() {
        return valor;
    }

    public String toString() {
        return tipo.equals("NUMERO") ? color + " " + valor : color + " " + tipo;
    }

}
