

public class Triangulo extends Figura{
    private double largo;
    private double ancho;

    public Triangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }
    @Override
    public double area() {
        return largo*ancho;
    }
     @Override
    public double perimetro() {
        return 2*(largo+ancho);
    }
}
