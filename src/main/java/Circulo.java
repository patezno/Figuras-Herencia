public class Circulo {

    // Atributos

    private int radio = 0;
    private String nombre = null;
    private final double PI = Math.PI;

    // Constructores

    public Circulo() {
    }

    public Circulo(int radio) {
        this.radio = radio;
    }

    public Circulo(String nombre, int radio) {
        this.nombre = nombre;
        this.radio = radio;
    }

    // Setters

    public void setRadio(int radio) {
        this.radio = radio;
    }

    // Getters

    public int getRadio() {
        return radio;
    }

    // Metodos

    public double area() {
        return PI * Math.pow(getRadio(), 2);
    }
}
