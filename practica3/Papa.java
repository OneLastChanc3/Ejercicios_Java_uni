public class Papa extends Abuelo{
    public  int dineroPapa;

    public Papa(int dineroAbuelo, int dineroPapa) {
        super(dineroAbuelo);
        this.dineroPapa = dineroPapa;
    }
    public int getDineroPapa() {
        return dineroPapa;
    }
    public void buscar(int total){
       System.out.println("Papa: casa encontrada al precio de: " + total);     
    }
    
  

}
