
public class App {
    public static void main(String[] args) {
        Circulo c = new Circulo(2);
        Triangulo t = new Triangulo(4, 2);

        System.out.println("Área círculo: " + c.area());
        System.out.println("Perímetro círculo: " + c.perimetro());

        System.out.println("Área triángulo: " + t.area());
        System.out.println("Perímetro triángulo: " + t.perimetro());
    }
}
