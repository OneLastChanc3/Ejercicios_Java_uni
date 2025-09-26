public class Papa extends Abuelo{
    public  int dinero;

    public Papa() {
        super(0);
        this.dinero = 0;
    }

    public Papa(int dineroAbuelo, int dineroPapa) {
        super(dineroAbuelo);
        this.dinero = dineroPapa;
    }

    public int dineroPapa() {
        return dinero;
    }

    public void buscar(int total){
       System.out.println("Papa: casa encontrada al precio de: " + total);     
    }
    
  

}
