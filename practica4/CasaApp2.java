public class CasaApp2 {
    public static void main(String[] args) {
        Hijo hijo = new Hijo(40, 60, 80);
        Hijo hermano = new Hijo(100);

        int total = hijo.dineroAbuelo() 
                   + hijo.dineroPapa() 
                   + hijo.getDineroHijo()
                   + hermano.getDineroHijo();

        hijo.buscar(total);
        hijo.comprar(total);
    }
}
