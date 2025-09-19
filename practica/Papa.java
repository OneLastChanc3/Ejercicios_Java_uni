
public class Papa {
    private String nombre;
    private int ahorro;
    private Abuelo ab;

    public Papa(String nombre , Abuelo ab) {
        this.nombre = nombre;
        this.ab = ab;
        this.ahorro = 0;
    }
    public void setAhorro(int ahorro) {
        this.ahorro += ahorro;
    }
    public int getAhorro() {
        return ahorro;
    }
    public Abuelo getAbuelo() {
        return ab;
    }

    
}
