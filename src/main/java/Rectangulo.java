public class Rectangulo {

    // Atributos

    private int base = 0;
    private int altura = 0;
    private String nombre = null;

    // Constructores

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        this.nombre = "Desconocido";
    }

    public Rectangulo(String nombre, int base, int altura) {
        this.nombre = nombre;
        this.base = base;
        this.altura = altura;
    }


}
