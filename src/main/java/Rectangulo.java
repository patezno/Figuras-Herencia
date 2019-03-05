public class Rectangulo {

    // Atributos

    private double base = 0d;
    private double altura = 0d;
    private String nombre = null;

    // Constructores

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.nombre = "Desconocido";
    }

    public Rectangulo(String nombre, double base, double altura) {
        this.nombre = nombre;
        this.base = base;
        this.altura = altura;
    }

    // Setters

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Getters

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    // Metodos

    public double area() {
        return getBase() * getAltura();
    }

}
