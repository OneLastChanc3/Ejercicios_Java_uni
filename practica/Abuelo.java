
public class Abuelo {

    private String nombre;
    private int ahorro;
    public Abuelo (String nombre) {
        this.nombre = nombre;
        this.ahorro = 0;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setAhorro(int ahorro) {
        this.ahorro += ahorro;
    }
    public String getNombre() {
        return nombre;
    }
    public int  getAhorro() {
        return ahorro;
    }
}