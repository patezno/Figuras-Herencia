public class Cuadrado {

    // Atributos

    private double lado = 0d;
    private String nombre = null;

    // Constructores

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public Cuadrado(String nombre, double lado) {
        this.nombre = nombre;
        this.lado = lado;
    }

    // Setters

    public void setLado(double lado) {
        this.lado = lado;
    }

    // Getters

    public double getLado() {
        return lado;
    }

    // Metodos

    public double area() {
        return Math.pow(getLado(), 2);
    }
}
