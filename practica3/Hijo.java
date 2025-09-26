public class  Hijo extends Papa{
    public  int dineroHijo;
   

    public  Hijo (int dineroAbuelo,int dineroPapa, int dineroHijo) {
        super(dineroAbuelo,dineroPapa);
        this.dineroHijo = dineroHijo;
        

    }
    public  Hijo(int dineroHijo) {
        super(0,0);
        this.dineroHijo = dineroHijo;
    }
    public void comprar(int total) {
        if( total == 280) {
            System.out.println("Hijo: Casa comprada al precio de : " + total);
        }else {
             System.out.println("No alcanza para comprar la casa");
        }
    }
    public int getDineroHijo() {
        return dineroHijo;
    }
}