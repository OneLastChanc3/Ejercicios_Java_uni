
// Circulo hereda de Figura
public class Circulo extends Figura {
    private double radio;
    private final double PI = 3.1415;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return PI * radio * radio; // π·r²
    }

    @Override
    public double perimetro() {
        return 2 * PI * radio; // 2·π·r
    }
}