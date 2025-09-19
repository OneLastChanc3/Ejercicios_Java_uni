

public class Hijo {
    private String nombre;
    private int ahorro;
    private Papa pa;

    public  Hijo(String nombre, Papa pa) {
        this.nombre = nombre;
        this.pa = pa;
    }

    public void ahorrar(int ahorro){
        this.ahorro += ahorro;
    }
    public void  ahorrarPapa(int ahorro) {
        pa.setAhorro(ahorro);
    }
    public void ahorrarAbuelo(int ahorro) {
        pa.getAbuelo().setAhorro(ahorro);
    }
    public int getAhorro() {
        return ahorro;
    }
}
