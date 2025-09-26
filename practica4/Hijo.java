public class  Hijo extends Papa{
    public  int dinero;
   
    public  Hijo (int dineroAbuelo,int dineroPapa, int dinero) {
        super(dineroAbuelo,dineroPapa);
        this.dinero = dinero;
        
    }
    public  Hijo(int dinero) {
        super(0,0);
        this.dinero = dinero;
    }
    public int  dineroPapa() {
        return super.dineroPapa();
    }

     public int dineroAbuelo() {
        return super.dineroAbuelo();
    }

    public void comprar(int total) {
        if( total == 280) {
            System.out.println("Hijo: Casa comprada al precio de : " + total);
        }else {
             System.out.println("No alcanza para comprar la casa");
        }
    }
    public int getDineroHijo() {
        return dinero;
    }
}