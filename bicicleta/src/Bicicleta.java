public class Bicicleta {
    private String tipo;
    private String color;
    private int tamaño;

    public Bicicleta(String tipo, String color, int tamaño) {
        this.tipo = tipo;
        this.color = color;
        this.tamaño = tamaño;
    }

    public void pedalear() {
        System.out.println("La bicicleta está en movimiento.");
    }

    public void frenar() {
        System.out.println("La bicicleta ha frenado.");
    }

    public void girar() {
        System.out.println("La bicicleta está girando.");
    }

    public void mostrarInfo() {
        System.out.println("Bicicleta: Tipo = " + tipo + ", Color = " + color + ", Tamaño = " + tamaño);
    }
}
